package com.lhmh.controller.billproduct;
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
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.billproduct.BillproductEntity;
import com.lhmh.service.billproduct.BillproductServiceI;

/**   
 * @Title: Controller
 * @Description: 产品类型
 * @author zhangdaihao
 * @date 2015-06-22 22:34:49
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/billproductController")
public class BillproductController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillproductController.class);

	@Autowired
	private BillproductServiceI billproductService;
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
	 * 产品类型列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "billproduct")
	public ModelAndView billproduct(HttpServletRequest request) {
		return new ModelAndView("com/lhmh/billproduct/billproductList");
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
	public void datagrid(BillproductEntity billproduct,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BillproductEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billproduct, request.getParameterMap());
		this.billproductService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除产品类型
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BillproductEntity billproduct, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		billproduct = systemService.getEntity(BillproductEntity.class, billproduct.getId());
		message = "产品类型删除成功";
		billproductService.delete(billproduct);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加产品类型
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(BillproductEntity billproduct, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(billproduct.getId())) {
			message = "产品类型更新成功";
			BillproductEntity t = billproductService.get(BillproductEntity.class, billproduct.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(billproduct, t);
				billproductService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "产品类型更新失败";
			}
		} else {
			message = "产品类型添加成功";
			billproductService.save(billproduct);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 产品类型列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(BillproductEntity billproduct, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(billproduct.getId())) {
			billproduct = billproductService.getEntity(BillproductEntity.class, billproduct.getId());
			req.setAttribute("billproductPage", billproduct);
		}
		return new ModelAndView("com/lhmh/billproduct/billproduct");
	}
}
