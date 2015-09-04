package com.lhmh.financialbusinessmanagement.financialregistration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillMainEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.service.BillMainServiceI;
/**   
 * @Title: Controller
 * @Description: 业务登记
 * @author zhangdaihao
 * @date 2015-06-26 08:19:30
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/billDelController")
public class BillDelController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillDelController.class);

	@Autowired
	private BillMainServiceI billMainService;
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
	 * 文件删除页面
	 * 
	 * @return
	 */
	@RequestMapping(params = "billDelQuery")
	public ModelAndView billDelQuery(HttpServletRequest request) {
		//理财室
		List<OfficeEntity> departList = systemService.getList(OfficeEntity.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "officeeName", "officeId"));
		//客户名称
		List<CustEntity> custList = systemService.getList(CustEntity.class);
		request.setAttribute("custReplace", RoletoJson.listToReplaceStr(custList, "custName", "custId"));
		//银行
		List<TSDepart> tsList = systemService.getList(TSDepart.class);
		request.setAttribute("depaReplace", RoletoJson.listToReplaceStr(tsList, "departname", "id"));
		//业务类型
		List<BusstypeEntity> typeList = systemService.getList(BusstypeEntity.class);
		request.setAttribute("typeReplace", RoletoJson.listToReplaceStr(typeList, "busstypeName", "busstypeId"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String tody = sdf.format(new Date());
		request.setAttribute("tody", tody);
		
		return new ModelAndView("com/lhmh/FinancialRegistration/billdelquery");
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
	public void datagrid(BillMainEntity billMain,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BillMainEntity.class, dataGrid);
		//默认查询到期日期是今天的
		String dueDate = request.getParameter("dueDate");
		if(dueDate == null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String tody = sdf.format(new Date());
			cq.eq("dueDate", tody);
		}
		//查询条件组装器
		String bstatus = request.getParameter("flag");
		//文件删除查询
		if("006".equals(bstatus)){
			//上传成功
			billMain.setStatus("0");
		}
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billMain);
		this.billMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
}


