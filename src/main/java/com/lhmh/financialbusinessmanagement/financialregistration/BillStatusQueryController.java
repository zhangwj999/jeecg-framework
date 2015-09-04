package com.lhmh.financialbusinessmanagement.financialregistration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.util.RoletoJson;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhmh.entity.billdetail.BillDetailEntity;
import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillEntity;
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
@RequestMapping("/billStatusQueryController")
public class BillStatusQueryController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillStatusQueryController.class);

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
	 * 管理员--理财查询
	 * 
	 * @return
	 */
	@RequestMapping(params = "billstatusquery")
	public ModelAndView billstatusquery(HttpServletRequest request) {
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
		return new ModelAndView("com/lhmh/FinancialRegistration/billstatusquery");
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
		//查询条件组装器
				String bstatus = request.getParameter("flag");
				//系统管理员--查询
				if("005".equals(bstatus)){
					//业务确认
					billMain.setBStatus("0");
				}				
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billMain);
		this.billMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);

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


	//----
	/**
	 * 方法描述:  明细列表
	 * @param request
	 * @param departid
	 * @return 
	 * 返回类型： ModelAndView
	 */
	@RequestMapping(params = "detailList")
	public ModelAndView detailList(HttpServletRequest request, String billId) {
		request.setAttribute("billId", request.getParameter("billId"));
		return new ModelAndView("com/lhmh/FinancialRegistration/billdetaillist");
	}
	/**
	 * 方法描述:  成员列表dataGrid
	 * 作    者： yiming.zhang
	 * 日    期： Dec 4, 2013-10:40:17 PM
	 * @param user
	 * @param request
	 * @param response
	 * @param dataGrid 
	 * 返回类型： void
	 */
	@RequestMapping(params = "billDatagrid")
	public void billDatagrid(BillDetailEntity billDetail,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		String billId = request.getParameter("billId");
		List<BillEntity> billList = systemService.findByProperty(BillEntity.class, "id", billId);
		if(billList != null && billList.size()>0){
			billId = billList.get(0).getBillId();			
		}
		billDetail.setBillId(billId);
		CriteriaQuery cq = new CriteriaQuery(BillDetailEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, billDetail);
		this.billMainService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
}

