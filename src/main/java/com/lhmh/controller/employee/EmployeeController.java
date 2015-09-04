package com.lhmh.controller.employee;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
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
import org.jeecgframework.core.common.model.json.ValidForm;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.channel.ChannelEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.entity.employee.EmployeeEntity;
import com.lhmh.service.employee.EmployeeServiceI;

/**   
 * @Title: Controller
 * @Description: 员工管理
 * @author zhangdaihao
 * @date 2015-07-13 07:20:18
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/employeeController")
public class EmployeeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeServiceI employeeService;
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
	 * 员工管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "employee")
	public ModelAndView employee(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		
		return new ModelAndView("com/lhmh/employee/employeeList");
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
	public void datagrid(EmployeeEntity employee,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(EmployeeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, employee, request.getParameterMap());
		this.employeeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除员工管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(EmployeeEntity employee, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		employee = systemService.getEntity(EmployeeEntity.class, employee.getId());
		message = "员工管理删除成功";
		employeeService.delete(employee);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加员工管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(EmployeeEntity employee, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(employee.getId())) {
			message = "员工管理更新成功";
			EmployeeEntity t = employeeService.get(EmployeeEntity.class, employee.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(employee, t);
				employeeService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "员工管理更新失败";
			}
		} else {
			message = "员工管理添加成功";
			employeeService.save(employee);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 员工管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(EmployeeEntity employee, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(employee.getId())) {
			employee = employeeService.getEntity(EmployeeEntity.class, employee.getId());
			req.setAttribute("employeePage", employee);
			String departId = employee.getBankId();
			List<TSDepart> depart = (List)systemService.findByProperty(TSDepart.class, "id", departId);
			String departname = depart.get(0).getDepartname();
			req.setAttribute("departname", departname);	
		}
		return new ModelAndView("com/lhmh/employee/employee");
	}
	/**
	 * 校验是否唯一
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkEmpId")
	@ResponseBody
	public ValidForm checkEmpId(HttpServletRequest request,HttpServletResponse responce) {
		ValidForm v = new ValidForm();
		String empId=oConvertUtils.getString(request.getParameter("empId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<EmployeeEntity> empList = systemService.findByProperty(EmployeeEntity.class, "empId", empId);
		if(empList.size()>0){
			EmployeeEntity emp = empList.get(0);
			if( !emp.getId().equals(id) ){
				v.setInfo("员工编号已存在");
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
	@RequestMapping(params = "checkEmpName")
	@ResponseBody
	public ValidForm checkEmpName(ChannelEntity role,HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String empName=oConvertUtils.getString(request.getParameter("empName"));
		try {
			empName = URLDecoder.decode(empName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			if(logger.isInfoEnabled()){
				logger.info("checkEmpName+ee=="+e.toString());
			}
		}
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<EmployeeEntity> empList = systemService.findByProperty(EmployeeEntity.class, "empName", empName);
		if(empList.size()>0){
			EmployeeEntity emp = empList.get(0);
			if( !emp.getId().equals(id) ){
				v.setInfo("员工名称已存在");
				v.setStatus("n");
			}
		}
		return v;
	}	
	/**
	 * 业务类型列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "employeeHelp")
	public ModelAndView employeeHelp(HttpServletRequest request) {
		
		return new ModelAndView("com/lhmh/employee/employeeListHelp");
	}
}
