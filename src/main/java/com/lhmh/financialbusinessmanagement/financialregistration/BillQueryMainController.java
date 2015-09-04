package com.lhmh.financialbusinessmanagement.financialregistration;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhmh.entity.bussproduct.BussproductEntity;
import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.entity.storage.StorageEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillMainEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillMainPage;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillProductEntity;
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
@RequestMapping("/billQueryMainController")
public class BillQueryMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillQueryMainController.class);

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
	 * 客户经理--理财查询
	 * 
	 * @return
	 */
	@RequestMapping(params = "billquery")
	public ModelAndView billquery(HttpServletRequest request) {
		
		String departMentId = ResourceUtil.getDepartId();	//获取登录用户所属银行
		String hd1 = "from OfficeEntity where bankId='"+departMentId+"')";
		//理财室
		List<OfficeEntity> departList = systemService.findHql(hd1);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "officeeName", "officeId"));
		//客户名称
		List<CustEntity> custList = systemService.getList(CustEntity.class);
		request.setAttribute("custReplace", RoletoJson.listToReplaceStr(custList, "custName", "custId"));
		//业务类型
		List<BusstypeEntity> typeList = systemService.getList(BusstypeEntity.class);
		request.setAttribute("typeReplace", RoletoJson.listToReplaceStr(typeList, "busstypeName", "busstypeId"));
		//默认查询当天
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String tody = sdf.format(new Date());
		request.setAttribute("tody", tody);
		
		return new ModelAndView("com/lhmh/FinancialRegistration/billquery");
	}
	/**
	 * 管理员--理财查询
	 * 
	 * @return
	 */
	@RequestMapping(params = "billAllQuery")
	public ModelAndView billAllQuery(HttpServletRequest request) {
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
		return new ModelAndView("com/lhmh/FinancialRegistration/billAllQuery");
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
		String crtDate = request.getParameter("crtDate");
		if(crtDate == null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String tody = sdf.format(new Date());
			cq.eq("crtDate", tody);
		}
		//查询条件组装器
		String bstatus = request.getParameter("flag");
		//理财查询
		if("003".equals(bstatus)){
			//只能查看自己的业务
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
			//业务确认
			billMain.setBStatus("0");
			//上传完成
			billMain.setStatus("0");
		}
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billMain);
		this.billMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);

	}

	/**
	 * 删除业务登记
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BillMainEntity billMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		billMain = systemService.getEntity(BillMainEntity.class, billMain.getId());
		message = "删除成功";
		billMainService.delete(billMain);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}
	
	
	//视频回放review
	/**
	 * 登记录入 结束
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "review")
	@ResponseBody
	public ModelAndView review(BillEntity bill, HttpServletRequest req) {
		//获取选择的条目信息
		if (StringUtil.isNotEmpty(bill.getId())) {
			bill = billMainService.getEntity(BillEntity.class, bill.getId());
			req.setAttribute("billPage", bill);
		}
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_review");  
//		return new ModelAndView("com/lhmh/FinancialRegistration/billList");
	}
	/**
	 * 播放视频
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "playViedo")
	public ModelAndView playViedo(BillEntity bill, HttpServletRequest req) {
		//获取选择的条目信息
		if (StringUtil.isNotEmpty(bill.getId())) {
			bill = billMainService.getEntity(BillEntity.class, bill.getId());
			//添加播放内容
			SQLQuery query=systemService.getSession().createSQLQuery("SELECT ID,BILL_ID,CHANNEL_ID,FILE_URL,FILE_NAME,BEGIN_TIME,END_TIME,STATUS FROM bill_detail where BILL_ID='"+bill.getBillId()+"'");
			 query.addScalar("FILE_URL", new org.hibernate.type.StringType());   
			 query.addScalar("FILE_NAME", new org.hibernate.type.StringType());   
			List list = query.list();
			req.setAttribute("billPage", bill);
			req.setAttribute("billList", list);
		}
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_playViedo");  
	}
}

