package com.lhmh.controller.cust;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.common.model.json.ValidForm;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhmh.entity.cust.CustEntity;
import com.lhmh.service.cust.CustServiceI;

/**   
 * @Title: Controller
 * @Description: 客户信息管理
 * @author zhangdaihao
 * @date 2015-06-03 11:03:53
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/custController")
public class CustController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CustController.class);

	@Autowired
	private CustServiceI custService;
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
	 * 客户信息管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "cust")
	public ModelAndView cust(HttpServletRequest request) {
		return new ModelAndView("com/lhmh/cust/custList");
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
	public void datagrid(CustEntity cust,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(CustEntity.class, dataGrid);
		String bankId = ResourceUtil.getDepartId();
		String sql = "select username from t_s_base_user where departid='"+bankId+"'";
		List bankUserIdList = (List)systemService.findListbySql(sql);
		cq.in("userName", bankUserIdList.toArray());
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, cust, request.getParameterMap());
		this.custService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除客户信息管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(CustEntity cust, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		cust = systemService.getEntity(CustEntity.class, cust.getId());
		message = "客户信息管理删除成功";
		custService.delete(cust);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加客户信息管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(CustEntity cust, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		TSUser user = ResourceUtil.getSessionUserName();
		String userName = user.getUserName();
		cust.setUserName(userName);
		if (StringUtil.isNotEmpty(cust.getId())) {
			message = "客户信息管理更新成功";
			CustEntity t = custService.get(CustEntity.class, cust.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(cust, t);
				custService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "客户信息管理更新失败";
			}
		} else {
			message = "客户信息管理添加成功";
			custService.save(cust);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 客户信息管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(CustEntity cust, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(cust.getId())) {
			cust = custService.getEntity(CustEntity.class, cust.getId());
			req.setAttribute("custPage", cust);
		}
		return new ModelAndView("com/lhmh/cust/cust");
	}
	
	/**
	 * 校验是否唯一
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkCustId")
	@ResponseBody
	public ValidForm checkCustId(HttpServletRequest request,HttpServletResponse responce) {
		ValidForm v = new ValidForm();
		String custId=oConvertUtils.getString(request.getParameter("custId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<CustEntity> custList = systemService.findByProperty(CustEntity.class, "custId", custId);
		if(custList.size()>0){
			CustEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("客户编号已存在");
				v.setStatus("n");
			}
		}
		return v;
	}
	/**
	 * 检查PassId
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkPassId")
	@ResponseBody
	public ValidForm checkPassId(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String passId=oConvertUtils.getString(request.getParameter("passId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<CustEntity> custList = systemService.findByProperty(CustEntity.class, "passId", passId);
		if(custList.size()>0){
			CustEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("证件编号已存在");
				v.setStatus("n");
			}
		}
		return v;
	}
	/**
	 * 客户信息管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "custHelp")
	public ModelAndView custHelp(HttpServletRequest request) {
		return new ModelAndView("com/lhmh/cust/custListHelp");
	}
}
