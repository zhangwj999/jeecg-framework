package com.lhmh.controller.busstype;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.jeecgframework.tag.vo.easyui.ComboTreeModel;
import org.jeecgframework.tag.vo.easyui.TreeGridModel;
import org.jeecgframework.core.common.model.json.TreeGrid;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.jeecgframework.tag.vo.datatable.SortDirection;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.ComboTree;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.common.model.json.ValidForm;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.service.busstype.BusstypeServiceI;

/**   
 * @Title: Controller
 * @Description: 业务类型
 * @author zhangdaihao
 * @date 2015-06-08 19:42:14
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/busstypeController")
public class BusstypeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BusstypeController.class);
	private int Function_Leave_ONE=0;
	private int Function_Leave_TWO=0;
	@Autowired
	private BusstypeServiceI busstypeService;
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
	 * 业务类型列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "busstype")
	public ModelAndView busstype(HttpServletRequest request) {
		return new ModelAndView("com/lhmh/busstype/busstypeList");
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
	public void datagrid(BusstypeEntity busstype,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BusstypeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, busstype, request.getParameterMap());
		this.busstypeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除业务类型
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BusstypeEntity busstype, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		busstype = systemService.getEntity(BusstypeEntity.class, busstype.getId());
		message = "业务类型删除成功";
		busstypeService.delete(busstype);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加业务类型
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(BusstypeEntity busstype, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(busstype.getId())) {
			message = "业务类型更新成功";
			BusstypeEntity t = busstypeService.get(BusstypeEntity.class, busstype.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(busstype, t);
				busstypeService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "业务类型更新失败";
			}
		} else {
			message = "业务类型添加成功";
			busstypeService.save(busstype);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 业务类型列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(BusstypeEntity busstype, HttpServletRequest req) {
		String functionid = req.getParameter("id");
		List<BusstypeEntity> busstypelist = systemService.getList(BusstypeEntity.class);
		req.setAttribute("flist", busstypelist);
		if (functionid != null) {
			busstype = systemService.getEntity(BusstypeEntity.class, functionid);
			req.setAttribute("busstypePage", busstype);
		}
		if (busstype.getBusstypeEntity() != null
				&& busstype.getBusstypeEntity().getId() != null) {
			busstype.setBusstypeLevel(1);
			busstype.setBusstypeEntity((BusstypeEntity) systemService.getEntity(
					BusstypeEntity.class, busstype.getBusstypeEntity().getId()));
			req.setAttribute("busstypePage", busstype);
		}
		return new ModelAndView("com/lhmh/busstype/busstype");
		
		
		
		
		/*if (StringUtil.isNotEmpty(busstype.getId())) {
			busstype = busstypeService.getEntity(BusstypeEntity.class, busstype.getId());
			req.setAttribute("busstypePage", busstype);
		}
		return new ModelAndView("com/lhmh/busstype/busstype");*/
	}
	/**
	 * 权限列表
	 */
	@RequestMapping(params = "busstypeGrid")
	@ResponseBody
	public List<TreeGrid> busstypeGrid(HttpServletRequest request,
			TreeGrid treegrid) {
		CriteriaQuery cq = new CriteriaQuery(BusstypeEntity.class);
		String selfId = request.getParameter("selfId");
		logger.info("1111"+selfId);
		if(selfId != null){
			cq.notEq("id", selfId);
		}
		logger.info("1111"+treegrid.getId());
		if (treegrid.getId() != null) {
			cq.eq("busstypeEntity.id", treegrid.getId());
		}
	
		if (treegrid.getId() == null) {
			cq.isNull("busstypeEntity");
		}
		cq.addOrder("busstypeId", SortDirection.asc);
		cq.add();
		List<BusstypeEntity> functionList = systemService.getListByCriteriaQuery(cq, false);
		
		List<TreeGrid> treeGrids = new ArrayList<TreeGrid>();
		TreeGridModel treeGridModel = new TreeGridModel();
		//treeGridModel.setIcon("TSIcon_iconPath");
		treeGridModel.setIdField("id");
		treeGridModel.setIcon("busstypeId");
		treeGridModel.setTextField("busstypeName");
		treeGridModel.setParentText("busstypeEntity_busstypeName");
		treeGridModel.setParentId("busstypeEntity_id");
		treeGridModel.setSrc("note");
		treeGridModel.setCode("month");
		treeGridModel.setChildList("busstypeEntitys");
		// 添加排序字段
		treeGridModel.setOrder("month");
		
		
	/*	
		treeGridModel.setIcon("TSIcon_iconPath");
		treeGridModel.setTextField("functionName");
		treeGridModel.setParentText("TSBusstype_functionName");
		treeGridModel.setParentId("TSBusstype_id");
		treeGridModel.setSrc("functionUrl");
		treeGridModel.setIdField("id");
		treeGridModel.setChildList("TSBusstypes");*/
		treeGrids = systemService.treegrid(functionList, treeGridModel);
		return treeGrids;
	}

	/**
	 * 父级权限下拉菜单
	 */
	@RequestMapping(params = "setPFunction")
	@ResponseBody
	public List<ComboTree> setPFunction(HttpServletRequest request,
			ComboTree comboTree) {
		CriteriaQuery cq = new CriteriaQuery(BusstypeEntity.class);
		if(null != request.getParameter("selfId")){
			cq.notEq("id", request.getParameter("selfId"));
		}
		if (comboTree.getId() != null) {
			cq.eq("busstypeEntity.id", comboTree.getId());
		}
		if (comboTree.getId() == null) {
			cq.isNull("busstypeEntity");
		}
		cq.add();
		List<BusstypeEntity> busstypeList = systemService.getListByCriteriaQuery(cq, false);
		List<ComboTree> comboTrees = new ArrayList<ComboTree>();
		ComboTreeModel comboTreeModel = new ComboTreeModel("id","busstypeName", "busstypeEntitys");
		comboTrees = systemService.ComboTree(busstypeList, comboTreeModel, null);
		return comboTrees;
	}

	/**
	 * 权限录入
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "saveBusstype")
	@ResponseBody
	public AjaxJson saveBusstype(BusstypeEntity busstype, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
		//String functionOrder = busstype.getBusstypeId();
		//logger.info("11111s"+functionOrder);
		//if (StringUtils.isEmpty(functionOrder)) {
			busstype.setBusstypeId(busstype.getId());
		//}
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
		if (busstype.getBusstypeEntity().getId().equals("")) {
			logger.info("xxa=''");
			busstype.setBusstypeEntity(null);
		} else {
			logger.info("aaaa='ss'"+busstype.getBusstypeEntity().getId());
			BusstypeEntity parent = systemService.getEntity(BusstypeEntity.class,busstype.getBusstypeEntity().getId());
			logger.info("parent"+(parent.getBusstypeLevel()+1));
			busstype.setBusstypeLevel((parent.getBusstypeLevel()+ 1) );
			//busstype.setParentfunctionid(parent.getId());
			//logger.info("busstype"+busstype.getParentfunctionid());
		}
		logger.info("parentend");
		if (StringUtil.isNotEmpty(busstype.getId())) {
			message = "业务类型: " + busstype.getBusstypeName() + "被更新成功";
			busstypeService.saveOrUpdate(busstype);
			systemService.addLog(message, Globals.Log_Type_UPDATE,
					Globals.Log_Leavel_INFO);
			// ----------------------------------------------------------------
			// ----------------------------------------------------------------

			//**systemService.flushRoleFunciton(function.getId(), function);

			// ----------------------------------------------------------------
			// ----------------------------------------------------------------

		} else {
			//if (busstype.getBusstypeLevel().equals(Globals.Function_Leave_ONE)) {
			if (busstype.getBusstypeLevel().equals(Function_Leave_ONE)) {
				List<BusstypeEntity> functionList = systemService.findByProperty(
						BusstypeEntity.class, "busstypeLevel",
						Function_Leave_ONE);
				// int ordre=functionList.size()+1;
				// function.setFunctionOrder(Function_Order_ONE+ordre);
				busstype.setBusstypeId(busstype.getBusstypeId());
			} else {
				List<BusstypeEntity> functionList = systemService.findByProperty(
						BusstypeEntity.class, "busstypeLevel",
						Function_Leave_TWO);
				// int ordre=functionList.size()+1;
				// function.setFunctionOrder(Function_Order_TWO+ordre);
				busstype.setBusstypeId(busstype.getBusstypeId());
			}
			message = "业务类型: " + busstype.getBusstypeName() + "被添加成功";
			busstypeService.save(busstype);
			systemService.addLog(message, Globals.Log_Type_INSERT,
					Globals.Log_Leavel_INFO);

		}

		return j;
	}

	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkBussTypeName")
	@ResponseBody
	public ValidForm checkBussTypeName(HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String busstypeName=oConvertUtils.getString(request.getParameter("busstypeName"));
		try {
			busstypeName = URLDecoder.decode(busstypeName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			if(logger.isInfoEnabled()){
				logger.info("checkBussTypeName+ee=="+e.toString());
			}
		}
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<BusstypeEntity> custList = systemService.findByProperty(BusstypeEntity.class, "busstypeName", busstypeName);
		if(custList.size()>0){
			BusstypeEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("业务类型名称已存在");
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
	@RequestMapping(params = "busstypeHelp")
	public ModelAndView busstypeHelp(HttpServletRequest request) {
		
		return new ModelAndView("com/lhmh/busstype/busstypeListHelp");
	}
}
