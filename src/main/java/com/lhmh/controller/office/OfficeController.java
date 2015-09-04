package com.lhmh.controller.office;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
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
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhmh.entity.channel.ChannelEntity;
import com.lhmh.entity.office.OfficeChannelEntity;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.entity.terminal.TerminalEntity;
import com.lhmh.page.office.OfficePage;
import com.lhmh.service.office.OfficeServiceI;
/**   
 * @Title: Controller
 * @Description: 理财室
 * @author zhangdaihao
 * @date 2015-06-07 14:54:32
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/officeController")
public class OfficeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(OfficeController.class);

	@Autowired
	private OfficeServiceI officeService;
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
	 * 理财室列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "office")
	public ModelAndView office(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		List<TerminalEntity> terminalList = systemService.getList(TerminalEntity.class);
		request.setAttribute("terminalsReplace", RoletoJson.listToReplaceStr(terminalList, "terminalName", "terminalId"));

			return new ModelAndView("com/lhmh/office/officeList");
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
	public void datagrid(OfficeEntity office,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(OfficeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, office);
		this.officeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除理财室
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(OfficeEntity office, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		office = systemService.getEntity(OfficeEntity.class, office.getId());
		message = "删除成功";
		officeService.delete(office);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加理财室
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(OfficeEntity office,OfficePage officePage, HttpServletRequest request) {
		List<OfficeChannelEntity> officeChannelList =  officePage.getOfficeChannelList();
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(office.getId())) {
			message = "更新成功";
			officeService.updateMain(office, officeChannelList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} else {
			message = "添加成功";
			officeService.addMain(office, officeChannelList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 理财室列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(OfficeEntity office, HttpServletRequest req) {
		List<TerminalEntity> terminalList = new ArrayList<TerminalEntity>();
		String terminal = oConvertUtils.getString(req.getParameter("terminalId"));
		if(!StringUtil.isEmpty(terminal)){
			terminalList.add((TerminalEntity)systemService.getEntity(TerminalEntity.class,terminal));
		}else {
			terminalList.addAll((List)systemService.getList(TerminalEntity.class));
		}
		req.setAttribute("terminalList", terminalList);
		List<ChannelEntity> channelList = new ArrayList<ChannelEntity>();
		String bankid = oConvertUtils.getString(office.getBankId());
		if(!StringUtil.isEmpty(bankid)){
			 String hql0 = "from ChannelEntity where 1 = 1  AND bankId = ? ";
			 channelList.addAll((List)systemService.findHql(hql0,bankid));
		}else{
			 channelList.addAll((List)systemService.getList(ChannelEntity.class));
		}
		req.setAttribute("channelList", channelList);	
		
		if (StringUtil.isNotEmpty(office.getId())) {
			office = officeService.getEntity(OfficeEntity.class, office.getId());
			req.setAttribute("officePage", office);
			String departId = office.getBankId();
			List<TSDepart> depart = (List)systemService.findByProperty(TSDepart.class, "id", departId);
			String departname = depart.get(0).getDepartname();
			req.setAttribute("departname", departname);	
		}
		return new ModelAndView("com/lhmh/office/office");
	}
	
	
	/**
	 * 加载明细列表[通道]
	 * 
	 * @return
	 */
	@RequestMapping(params = "officeChannelList")
	public ModelAndView officeChannelList(OfficeEntity office, HttpServletRequest req) {
		List<ChannelEntity> channelList = new ArrayList<ChannelEntity>();
		String bankid = oConvertUtils.getString(office.getBankId());
		logger.info(bankid);
		// List<ChannelEntity> ChannelEntityList = systemService.findHql(hql0,bankid);
		if(!StringUtil.isEmpty(bankid)){
		//	channelList.add((ChannelEntity)systemService.getEntity(ChannelEntity.class,"bankId",bankid));
			 String hql0 = "from ChannelEntity where 1 = 1  AND bankId = ? ";
			 channelList.addAll((List)systemService.findHql(hql0,bankid));
		}else{
			 channelList.addAll((List)systemService.getList(ChannelEntity.class));
		}
		req.setAttribute("channelList", channelList);
		/*if (StringUtil.isNotEmpty(office.getOfficeId())) {
			List<OfficeChannelEntity> officeChannelEntityList =  officeService.findByProperty(OfficeChannelEntity.class, "officeId", office.getOfficeId());
			req.setAttribute("officeChannelList", officeChannelEntityList);
		}
		/*return new ModelAndView("jeecg/demo/test/jeecgOrderProductList");*/
		//===================================================================================
		//获取参数
		String officeid = office.getOfficeId();
		//===================================================================================
		//查询-通道
	    String hql0 = "from OfficeChannelEntity where 1 = 1  AND officeId = ? ";
	   // logger.info("1111"+id+":"+officeid+":=="+req.getParameter("id")+":"+req.getParameter("id"));
		try{
		    List<OfficeChannelEntity> officeChannelEntityList = systemService.findHql(hql0,officeid);
		   // logger.info(officeChannelEntityList.toString());
			req.setAttribute("officeChannelList", officeChannelEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/lhmh/office/officeChannelList");
	}
	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkOfficeId")
	@ResponseBody
	public ValidForm checkOfficeId(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String officeId=oConvertUtils.getString(request.getParameter("officeId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<OfficeEntity> custList = systemService.findByProperty(OfficeEntity.class, "officeId", officeId);
		if(custList.size()>0){
			OfficeEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("编码已存在");
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
	@RequestMapping(params = "checkOfficeName")
	@ResponseBody
	public ValidForm checkOfficeName(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String officeName=oConvertUtils.getString(request.getParameter("officeName"));
		try {
			officeName = URLDecoder.decode(officeName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			if(logger.isInfoEnabled()){
				logger.info("checkBussTypeName+ee=="+e.toString());
			}
		}
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<OfficeEntity> custList = systemService.findByProperty(OfficeEntity.class, "officeName", officeName);
		if(custList.size()>0){
			OfficeEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("名称已存在");
				v.setStatus("n");
			}
		}
		return v;	
	}
	
}
