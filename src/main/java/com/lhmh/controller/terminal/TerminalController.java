package com.lhmh.controller.terminal;
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
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.employee.EmployeeEntity;
import com.lhmh.entity.storage.StorageEntity;
import com.lhmh.entity.terminal.TerminalEntity;
import com.lhmh.service.terminal.TerminalServiceI;

/**   
 * @Title: Controller
 * @Description: 采集终端管理
 * @author zhangdaihao
 * @date 2015-06-05 20:45:44
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/terminalController")
public class TerminalController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TerminalController.class);
	protected String name;// 表格标示
	@Autowired
	private TerminalServiceI terminalService;
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
	 * 采集终端管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "terminal")
	public ModelAndView terminal(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		List<StorageEntity> storageList = systemService.getList(StorageEntity.class);
		request.setAttribute("storagesReplace", RoletoJson.listToReplaceStr(storageList, "storageName", "storageId"));
		List<EmployeeEntity> employeeList = systemService.getList(EmployeeEntity.class);
		request.setAttribute("employeeReplace", RoletoJson.listToReplaceStr(employeeList, "empName", "empId"));

		return new ModelAndView("com/lhmh/terminal/terminalList");
	}
	/**
	 * 采集终端管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "terminalQuery")
	public ModelAndView terminalQuery(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		List<StorageEntity> storageList = systemService.getList(StorageEntity.class);
		request.setAttribute("storagesReplace", RoletoJson.listToReplaceStr(storageList, "storageName", "storageId"));

		return new ModelAndView("com/lhmh/terminal/terminalListQuery");
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
	public void datagrid(TerminalEntity terminal,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TerminalEntity.class, dataGrid);
		TSUser user=ResourceUtil.getSessionUserName();
		String dpt_id=user.getTSDepart().getId();//.getRealName();
		logger.info("dpt_id:"+dpt_id);
		//ResourceUtil.getSessionUserName();
		StringBuffer sb=new StringBuffer("aaaa");
		searchboxFun(sb,"terminalList");
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, terminal, request.getParameterMap());
		this.terminalService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除采集终端管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(TerminalEntity terminal, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		terminal = systemService.getEntity(TerminalEntity.class, terminal.getId());
		message = "采集终端管理删除成功";
		terminalService.delete(terminal);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加采集终端管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(TerminalEntity terminal, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(terminal.getId())) {
			message = "采集终端管理更新成功";
			TerminalEntity t = terminalService.get(TerminalEntity.class, terminal.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(terminal, t);
				terminalService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "采集终端管理更新失败";
			}
		} else {
			message = "采集终端管理添加成功";
			terminalService.save(terminal);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 采集终端管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(TerminalEntity terminal, HttpServletRequest req) {
		
		if (StringUtil.isNotEmpty(terminal.getId())) {
			terminal = terminalService.getEntity(TerminalEntity.class, terminal.getId());
			req.setAttribute("terminalPage", terminal);
			String departId = terminal.getBankId();
			List<TSDepart> depart = (List)systemService.findByProperty(TSDepart.class, "id", departId);
			String departname = depart.get(0).getDepartname();
			req.setAttribute("departname", departname);			
		}
		
		List<StorageEntity> storageList = new ArrayList<StorageEntity>();
		String storageid = oConvertUtils.getString(req.getParameter("storageId"));
		if(!StringUtil.isEmpty(storageid)){
			storageList.add((StorageEntity)systemService.getEntity(StorageEntity.class,storageid));
		}else {
			storageList.addAll((List)systemService.getList(StorageEntity.class));
		}
		req.setAttribute("storageList", storageList);
		
		return new ModelAndView("com/lhmh/terminal/terminal");
	}
	//列表查询框函数
		protected void searchboxFun(StringBuffer sb,String grid)
		{
			sb.append("function "+name+"searchbox(value,name){");
			sb.append("var queryParams=$(\'#" + name + "\').datagrid('options').queryParams;");
			sb.append("queryParams[name]=value;queryParams.searchfield=name;$(\'#" + name + "\')." + grid + "(\'reload\');}");
			sb.append("$(\'#"+name+"searchbox\').searchbox({");
			sb.append("searcher:function(value,name){");
			sb.append(""+name+"searchbox(value,name);");
			sb.append("},");
			sb.append("menu:\'#"+name+"mm\',");
			sb.append("prompt:\'请输入查询关键字\'");
			sb.append("});");
			logger.info("sb"+sb.toString());
		}
		/**
		 * 检查ID
		 * 
		 * @param ids
		 * @return
		 */
		@RequestMapping(params = "checkTerminalId")
		@ResponseBody
		public ValidForm checkTerminalId(HttpServletRequest request,HttpServletResponse response) {
			ValidForm v = new ValidForm();
			String terminalId=oConvertUtils.getString(request.getParameter("terminalId"));
			try {
				terminalId = URLDecoder.decode(terminalId, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				if(logger.isInfoEnabled()){
					logger.info("checkEmpName+ee=="+e.toString());
				}
			}
			String id = oConvertUtils.getString(request.getParameter("id"));
			List<TerminalEntity> custList = systemService.findByProperty(TerminalEntity.class, "terminalId", terminalId);
			if(custList.size()>0){
				TerminalEntity cust = custList.get(0);
				if( !cust.getId().equals(id) ){
					v.setInfo("ID已存在");
					v.setStatus("n");
				}
			}
			return v;
		}
		/**
		 * 检查ID
		 * 
		 * @param ids
		 * @return
		 */
		@RequestMapping(params = "checkTerminalName")
		@ResponseBody
		public ValidForm checkTerminalName(HttpServletRequest request,HttpServletResponse response) {
			ValidForm v = new ValidForm();
			String terminalName=oConvertUtils.getString(request.getParameter("terminalName"));
			try {
				terminalName = URLDecoder.decode(terminalName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				if(logger.isInfoEnabled()){
					logger.info("checkBussTypeName+ee=="+e.toString());
				}
			}
			String id = oConvertUtils.getString(request.getParameter("id"));
			List<TerminalEntity> custList = systemService.findByProperty(TerminalEntity.class, "terminalName", terminalName);
			if(custList.size()>0){
				TerminalEntity cust = custList.get(0);
				if( !cust.getId().equals(id) ){
					v.setInfo("名称已存在");
					v.setStatus("n");
				}
			}
			return v;	
		}
		/**
		 * 检查ID
		 * 
		 * @param ids
		 * @return
		 */
		@RequestMapping(params = "checkTerminalIp")
		@ResponseBody
		public ValidForm checkTerminalIp(HttpServletRequest request,HttpServletResponse response) {
			ValidForm v = new ValidForm();
			String terminalIp=oConvertUtils.getString(request.getParameter("terminalIp"));
			String id = oConvertUtils.getString(request.getParameter("id"));
			List<TerminalEntity> custList = systemService.findByProperty(TerminalEntity.class, "terminalIp", terminalIp);
			if(custList.size()>0){
				TerminalEntity cust = custList.get(0);
				if( !cust.getId().equals(id) ){
					v.setInfo("IP地址已存在");
					v.setStatus("n");
				}
			}
			return v;
		}
}
