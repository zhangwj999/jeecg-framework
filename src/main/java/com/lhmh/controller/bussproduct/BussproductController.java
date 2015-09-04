package com.lhmh.controller.bussproduct;
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
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.lhmh.entity.bussproduct.BussproductEntity;
import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.service.bussproduct.BussproductServiceI;

/**   
 * @Title: Controller
 * @Description: 产品类型
 * @author zhangdaihao
 * @date 2015-06-05 21:27:24
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/bussproductController")
public class BussproductController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BussproductController.class);

	@Autowired
	private BussproductServiceI bussproductService;
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
	@RequestMapping(params = "bussproduct")
	public ModelAndView bussproduct(HttpServletRequest request) {
		List<BusstypeEntity> bussstypeList = systemService.getList(BusstypeEntity.class);
		request.setAttribute("busstypesReplace", RoletoJson.listToReplaceStr(bussstypeList, "busstypeName", "id"));

		return new ModelAndView("com/lhmh/bussproduct/bussproductList");
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
	public void datagrid(BussproductEntity bussproduct,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BussproductEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, bussproduct, request.getParameterMap());
		this.bussproductService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除产品类型
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BussproductEntity bussproduct, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		bussproduct = systemService.getEntity(BussproductEntity.class, bussproduct.getId());
		message = "产品类型删除成功";
		bussproductService.delete(bussproduct);
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
	public AjaxJson save(BussproductEntity bussproduct, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(bussproduct.getId())) {
			message = "产品类型更新成功";
			BussproductEntity t = bussproductService.get(BussproductEntity.class, bussproduct.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(bussproduct, t);
				bussproductService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "产品类型更新失败";
			}
		} else {
			message = "产品类型添加成功";
			bussproductService.save(bussproduct);
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
	public ModelAndView addorupdate(BussproductEntity bussproduct, HttpServletRequest req) {
		
		List<BusstypeEntity> busstypeList = new ArrayList<BusstypeEntity>();
		String busstypeid = oConvertUtils.getString(req.getParameter("busstypeId"));
		if(!StringUtil.isEmpty(busstypeid)){
			busstypeList.add((BusstypeEntity)systemService.getEntity(BusstypeEntity.class,busstypeid));
		}else {
			busstypeList.addAll((List)systemService.getList(BusstypeEntity.class));
		}
		req.setAttribute("busstypeList", busstypeList);
		if (StringUtil.isNotEmpty(bussproduct.getId())) {
			bussproduct = bussproductService.getEntity(BussproductEntity.class, bussproduct.getId());
			req.setAttribute("bussproductPage", bussproduct);
		}
		return new ModelAndView("com/lhmh/bussproduct/bussproduct");
	}
	/**
	 * 检查ID
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "checkProductId")
	@ResponseBody
	public ValidForm checkProductId(BussproductEntity role,HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String productId=oConvertUtils.getString(request.getParameter("productId"));
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<BussproductEntity> custList = systemService.findByProperty(BussproductEntity.class, "productId", productId);
		if(custList.size()>0){
			BussproductEntity cust = custList.get(0);
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
	@RequestMapping(params = "checkProductName")
	@ResponseBody
	public ValidForm checkProductName(BussproductEntity role,HttpServletRequest request,HttpServletResponse response) {
		ValidForm v = new ValidForm();
		String productName=oConvertUtils.getString(request.getParameter("productName"));
		try {
			productName = URLDecoder.decode(productName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			if(logger.isInfoEnabled()){
				logger.info("checkBussTypeName+ee=="+e.toString());
			}
		}
		String id = oConvertUtils.getString(request.getParameter("id"));
		List<BussproductEntity> custList = systemService.findByProperty(BussproductEntity.class, "productName", productName);
		if(custList.size()>0){
			BussproductEntity cust = custList.get(0);
			if( !cust.getId().equals(id) ){
				v.setInfo("名称已存在");
				v.setStatus("n");
			}
		}
		return v;		
	}
}
