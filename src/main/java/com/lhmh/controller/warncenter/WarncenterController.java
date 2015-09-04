package com.lhmh.controller.warncenter;
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

import com.lhmh.entity.warncenter.WarncenterEntity;
import com.lhmh.service.warncenter.WarncenterServiceI;

/**   
 * @Title: Controller
 * @Description: 报警中心
 * @author zhangdaihao
 * @date 2015-06-09 21:45:23
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/warncenterController")
public class WarncenterController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(WarncenterController.class);

	@Autowired
	private WarncenterServiceI warncenterService;
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
	 * 报警中心列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "warncenter")
	public ModelAndView warncenter(HttpServletRequest request) {
		return new ModelAndView("com/lhmh/warncenter/warncenterList");
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
	public void datagrid(WarncenterEntity warncenter,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(WarncenterEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, warncenter, request.getParameterMap());
		this.warncenterService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除报警中心
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(WarncenterEntity warncenter, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		warncenter = systemService.getEntity(WarncenterEntity.class, warncenter.getId());
		message = "报警中心删除成功";
		warncenterService.delete(warncenter);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加报警中心
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(WarncenterEntity warncenter, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(warncenter.getId())) {
			message = "报警中心更新成功";
			WarncenterEntity t = warncenterService.get(WarncenterEntity.class, warncenter.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(warncenter, t);
				warncenterService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "报警中心更新失败";
			}
		} else {
			message = "报警中心添加成功";
			warncenterService.save(warncenter);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 报警中心列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(WarncenterEntity warncenter, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(warncenter.getId())) {
			warncenter = warncenterService.getEntity(WarncenterEntity.class, warncenter.getId());
			req.setAttribute("warncenterPage", warncenter);
		}
		return new ModelAndView("com/lhmh/warncenter/warncenter");
	}
}
