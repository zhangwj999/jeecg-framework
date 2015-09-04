package com.lhmh.controller.storage;
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
import org.jeecgframework.core.util.MyBeanUtils;
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

import com.lhmh.entity.bussproduct.BussproductEntity;
import com.lhmh.entity.employee.EmployeeEntity;
import com.lhmh.entity.storage.StorageEntity;
import com.lhmh.service.storage.StorageServiceI;

/**   
 * @Title: Controller
 * @Description: 存储设备管理
 * @author zhangdaihao
 * @date 2015-06-01 21:02:23
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/storageController")
public class StorageController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(StorageController.class);

	@Autowired
	private StorageServiceI storageService;
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
	 * 存储设备管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "storage")
	public ModelAndView storage(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		return new ModelAndView("com/lhmh/storage/storageList");
	}
	/**
	 * 存储设备管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "storagequery")
	public ModelAndView storagequery(HttpServletRequest request) {
		List<TSDepart> departList = systemService.getList(TSDepart.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "departname", "id"));
		return new ModelAndView("com/lhmh/storage/storageQueryList");
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
	public void datagrid(StorageEntity storage,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(StorageEntity.class, dataGrid);
		//查询条件组装器
//		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, storage);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, storage, request.getParameterMap());
		this.storageService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除存储设备管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(StorageEntity storage, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		storage = systemService.getEntity(StorageEntity.class, storage.getId());
		message = "存储设备管理删除成功";
		storageService.delete(storage);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加存储设备管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(StorageEntity storage, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(storage.getId())) {
			message = "存储设备管理更新成功";
			StorageEntity t = storageService.get(StorageEntity.class, storage.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(storage, t);
				storageService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "存储设备管理更新失败";
			}
		} else {
			message = "存储设备管理添加成功";
			storageService.save(storage);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 存储设备管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(StorageEntity storage, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(storage.getId())) {
			storage = storageService.getEntity(StorageEntity.class, storage.getId());
			req.setAttribute("storagePage", storage);
			String departId = storage.getBankId();
			List<TSDepart> depart = (List)systemService.findByProperty(TSDepart.class, "id", departId);
			String departname = depart.get(0).getDepartname();
			req.setAttribute("departname", departname);			
		}
		return new ModelAndView("com/lhmh/storage/storage");
	}
	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkStorageId")
	@ResponseBody
	public ValidForm checkStorageId(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String storageId=oConvertUtils.getString(request.getParameter("storageId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<StorageEntity> custList = systemService.findByProperty(StorageEntity.class, "storageId", storageId);
		if(custList.size()>0){
			StorageEntity cust = custList.get(0);
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
	@RequestMapping(params = "checkStorageName")
	@ResponseBody
	public ValidForm checkStorageName(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String storageName=oConvertUtils.getString(request.getParameter("storageName"));
		try {
			storageName = URLDecoder.decode(storageName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			if(logger.isInfoEnabled()){
				logger.info("checkBussTypeName+ee=="+e.toString());
			}
		}
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<StorageEntity> custList = systemService.findByProperty(StorageEntity.class, "storageName", storageName);
		if(custList.size()>0){
			StorageEntity cust = custList.get(0);
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
	@RequestMapping(params = "checkStorageIp")
	@ResponseBody
	public ValidForm checkStorageIp(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String storageIp=oConvertUtils.getString(request.getParameter("storageIp"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<StorageEntity> custList = systemService.findByProperty(StorageEntity.class, "storageIp", storageIp);
		if(custList.size()>0){
			StorageEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("编码已存在");
				v.setStatus("n");
			}
		}
		return v;
	}
}
