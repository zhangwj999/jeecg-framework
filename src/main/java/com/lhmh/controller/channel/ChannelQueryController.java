package com.lhmh.controller.channel;
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
import com.lhmh.entity.employee.EmployeeEntity;
import com.lhmh.service.channel.ChannelServiceI;

/**   
 * @Title: Controller
 * @Description: 通道管理
 * @author zhangdaihao
 * @date 2015-06-05 16:46:29
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/channelQueryController")
public class ChannelQueryController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(ChannelQueryController.class);

	@Autowired
	private ChannelServiceI channelService;
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
	 * 通道管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "channel")
	public ModelAndView channel(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
//		List<EmployeeEntity> employeeList = systemService.getList(EmployeeEntity.class);
//		request.setAttribute("employeeReplace", RoletoJson.listToReplaceStr(employeeList, "empName", "id"));		
		return new ModelAndView("com/lhmh/channel/channelList");
	}
	/**
	 * 通道管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "channelQuery")
	public ModelAndView channelQuery(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
//		List<EmployeeEntity> employeeList = systemService.getList(EmployeeEntity.class);
//		request.setAttribute("employeeReplace", RoletoJson.listToReplaceStr(employeeList, "empName", "id"));		
		return new ModelAndView("com/lhmh/channel/channelQueryList");
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
	public void datagrid(ChannelEntity channel,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(ChannelEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, channel, request.getParameterMap());
		this.channelService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除通道管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(ChannelEntity channel, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		channel = systemService.getEntity(ChannelEntity.class, channel.getId());
		message = "通道管理删除成功";
		channelService.delete(channel);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加通道管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(ChannelEntity channel, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(channel.getId())) {
			message = "通道管理更新成功";
			ChannelEntity t = channelService.get(ChannelEntity.class, channel.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(channel, t);
				channelService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "通道管理更新失败";
			}
		} else {
			message = "通道管理添加成功";
			channelService.save(channel);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 通道管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(ChannelEntity channel, HttpServletRequest req) {
		List<TSDepart> departList = new ArrayList<TSDepart>();
		String departid = oConvertUtils.getString(req.getParameter("departid"));
		if(!StringUtil.isEmpty(departid)){
			departList.add((TSDepart)systemService.getEntity(TSDepart.class,departid));
		}else {
			departList.addAll((List)systemService.getList(TSDepart.class));
		}
		req.setAttribute("departList", departList);
		if (StringUtil.isNotEmpty(channel.getId())) {
			channel = channelService.getEntity(ChannelEntity.class, channel.getId());
			req.setAttribute("channelPage", channel);
//			String empId = channel.getEmpId();
//			List<EmployeeEntity> employeeList = systemService.findByProperty(EmployeeEntity.class, "empId", empId);
//			EmployeeEntity employee = employeeList.get(0);
//			String empName = employee.getEmpName();
//			req.setAttribute("empName", empName);
		}
		return new ModelAndView("com/lhmh/channel/channel");
	}
	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkId")
	@ResponseBody
	public ValidForm checkId(ChannelEntity role,HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String id=oConvertUtils.getString(request.getParameter("param"));
		String code=oConvertUtils.getString(request.getParameter("code"));
		code=request.getParameter("code");
		String bank=oConvertUtils.getString(request.getParameter("bank"));
		bank=request.getParameter("bank");
		String sql="select bank_id from channel where bank_id='"+bank+"'"+" and channel_id='"+code+"'";
		List<String> roles=systemService.findListbySql(sql);
		if(roles.size()>0)
		{
			v.setInfo("银行下属的通道编码已存在");
			v.setStatus("n");
		}
		return v;
	}
	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkName")
	@ResponseBody
	public ValidForm checkName(ChannelEntity role,HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String id=oConvertUtils.getString(request.getParameter("param"));
		String code=oConvertUtils.getString(request.getParameter("code"));
		List<ChannelEntity> roles=systemService.findByProperty(ChannelEntity.class,"channelName",id);
		if(roles.size()>0&&!code.equals(id))
		{
			v.setInfo("名称已存在");
			v.setStatus("n");
		}
		return v;
	}

}
