package com.lhmh.controller.billdetail;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.billdetail.BillDetailEntity;
import com.lhmh.entity.channel.ChannelEntity;
import com.lhmh.service.billdetail.BillDetailServiceI;

/**   
 * @Title: Controller
 * @Description: 账单明细
 * @author zhangdaihao
 * @date 2015-07-11 16:27:13
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/billDetailController")
public class BillDetailController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillDetailController.class);

	@Autowired
	private BillDetailServiceI billDetailService;
	@Autowired
	private SystemService systemService;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * 账单明细列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "billDetail")
	public ModelAndView billDetail(HttpServletRequest request) {
		List<ChannelEntity> channelList = systemService.getList(ChannelEntity.class);
		request.setAttribute("channelReplace", RoletoJson.listToReplaceStr(channelList, "channelName", "channelId"));	
		return new ModelAndView("com/lhmh/billdetail/billDetailList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(BillDetailEntity billDetail,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BillDetailEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billDetail, request.getParameterMap());
		this.billDetailService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除账单明细
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BillDetailEntity billDetail, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		billDetail = systemService.getEntity(BillDetailEntity.class, billDetail.getId());
		message = "账单明细删除成功";
		billDetailService.delete(billDetail);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加账单明细
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(BillDetailEntity billDetail, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(billDetail.getId())) {
			message = "账单明细更新成功";
			BillDetailEntity t = billDetailService.get(BillDetailEntity.class, billDetail.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(billDetail, t);
				billDetailService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "账单明细更新失败";
			}
		} else {
			message = "账单明细添加成功";
			billDetailService.save(billDetail);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 账单明细列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(BillDetailEntity billDetail, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(billDetail.getId())) {
			billDetail = billDetailService.getEntity(BillDetailEntity.class, billDetail.getId());
			req.setAttribute("billDetailPage", billDetail);
		}
		return new ModelAndView("com/lhmh/billdetail/billDetail");
	}
}
