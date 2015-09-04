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

import sun.misc.BASE64Encoder;

import com.lhmh.entity.bussproduct.BussproductEntity;
import com.lhmh.entity.busstype.BusstypeEntity;
import com.lhmh.entity.cust.CustEntity;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.entity.storage.StorageEntity;
import com.lhmh.entity.terminal.TerminalEntity;
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
@RequestMapping("/billBackMainController")
public class BillBackMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillBackMainController.class);

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
	 * 理财补录页面
	 * 
	 * @return
	 */
	@RequestMapping(params = "billback")
	public ModelAndView billback(HttpServletRequest request) {
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
		
		return new ModelAndView("com/lhmh/FinancialRegistration/billbackList");
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
		//理财登记
		if("000".equals(bstatus)){
			//只能查看自己的业务
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
		}
		//理财补录
		if("001".equals(bstatus)){
			//billMain.setBStatus("1"); 应该是<>0
			
			billMain.setStatus("1");
			//只能查看自己的业务
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
		}
		//文件上传
		if("002".equals(bstatus)){
			//业务确认
			billMain.setBStatus("0");
			//未开始上传
			billMain.setStatus("1");
		}
		//业务查询
		if("003".equals(bstatus)){
			//只能查看自己的业务
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
			//业务确认
			billMain.setBStatus("0");
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
		if(!"0".equals(billMain.getBStatus())){
			message = "删除成功";
			billMainService.delete(billMain);
		}else{
			message = "不能删除理财状态为已确认的单据！";
		}
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加业务登记
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(BillMainEntity billMain,BillMainPage billMainPage, HttpServletRequest request) {
		List<BillProductEntity> billProductList =  billMainPage.getBillProductList();
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(billMain.getId())) {
			message = "更新成功";
			//根据业务类型获取结束日期
			String beginDate = billMain.getCrtDate();
			String type = billMain.getBillType();
			String sql = "select DATE_FORMAT( date_add(str_to_date('"+beginDate+"', '%Y%m%d'),interval bt.month month),'%Y%m%d') sss  from busstype bt"
					+" where busstype_id='"+type+"'";
			List<String> dueDateList = systemService.findListbySql(sql);
			String dueDate = dueDateList.get(0);
			billMain.setDueDate(dueDate);
	//		员工姓名 登录用户 的用户 名
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
			billMain.setUserName(user.getRealName());
			//根据理财室id，查询获取银行id，通道id
			String officeId = billMain.getOfficeId();
			List<OfficeEntity> list  = systemService.findByProperty(OfficeEntity.class, "officeId", officeId);
			if(list!=null){
				if(list.size()>0){
					//设置银行id
					String bankId = list.get(0).getBankId();
					billMain.setBankId(bankId);
					//终端id
					billMain.setTerminalId(list.get(0).getTerminalId());
					
					List<StorageEntity> stolist  = systemService.findByProperty(StorageEntity.class, "bankId", bankId);
					if(stolist!=null){
						if(stolist.size()>0){
							//存储id
							billMain.setStorageId(stolist.get(0).getStorageId());
						}
					}
					
				}
			}

		    //理财业务状态
		    billMain.setBStatus("1");
		    SimpleDateFormat formatter; 
		 	//理财时间
		    formatter = new SimpleDateFormat ("yyyyMMdd"); 
		    billMain.setCrtDate(formatter.format(Calendar.getInstance().getTime()));
			billMainService.updateMain(billMain, billProductList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} else {
			message = "添加成功";
			//根据业务类型获取结束日期
			String type = billMain.getBillType();
			String sql = "select DATE_FORMAT( date_add(CURRENT_DATE,interval bt.month month),'%Y%m%d') sss  from busstype bt"
					+" where busstype_id='"+type+"'";
			List<String> dueDateList = systemService.findListbySql(sql);
			String dueDate = dueDateList.get(0);
			billMain.setDueDate(dueDate);
//			员工姓名 登录用户 的用户 名
			TSUser user = ResourceUtil.getSessionUserName();
			billMain.setUserId(user.getUserName());
			billMain.setUserName(user.getRealName());
			//根据理财室id，查询获取银行id，通道id
			String officeId = billMain.getOfficeId();
			List<OfficeEntity> list  = systemService.findByProperty(OfficeEntity.class, "officeId", officeId);
			if(list!=null){
				if(list.size()>0){
					//设置银行id
					String bankId = list.get(0).getBankId();
					billMain.setBankId(bankId);
					//终端id
					billMain.setTerminalId(list.get(0).getTerminalId());
					
					List<StorageEntity> stolist  = systemService.findByProperty(StorageEntity.class, "bankId", bankId);
					if(stolist!=null){
						if(stolist.size()>0){
							//存储id
							billMain.setStorageId(stolist.get(0).getStorageId());
						}
					}
					
				}
			}

		    //理财业务状态
		    billMain.setBStatus("1");
			SimpleDateFormat formatter; 
		 	//理财时间
		    formatter = new SimpleDateFormat ("yyyyMMdd"); 
		    billMain.setCrtDate(formatter.format(Calendar.getInstance().getTime()));
			billMainService.addMain(billMain, billProductList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 业务登记列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(BillMainEntity billMain, HttpServletRequest req) {
		SimpleDateFormat formatter; 
	    formatter = new SimpleDateFormat ("yyyyMMdd"); 
	    
		if (StringUtil.isNotEmpty(billMain.getId())) {
			billMain = billMainService.getEntity(BillMainEntity.class, billMain.getId());
			//增加业务流水号
			if(null==billMain.getBillId()||"".equals(billMain.getBillId())){
				billMain.setBillId(getBillMaxId("", formatter.format(Calendar.getInstance().getTime())));
			}
			String billType = billMain.getBillType();
			List<BusstypeEntity> stolist  = systemService.findByProperty(BusstypeEntity.class, "busstypeId", billType);
			if(stolist!=null){
				if(stolist.size()>0){
					BusstypeEntity bussType = stolist.get(0);
					String busiTypeName = bussType.getBusstypeName();
					req.setAttribute("busiTypeName", busiTypeName);
				}
			}
			String custId = billMain.getCustId();
			List<CustEntity> custList  = systemService.findByProperty(CustEntity.class, "custId", custId);
			if(custList!=null){
				if(custList.size()>0){
					CustEntity cust = custList.get(0);
					req.setAttribute("custName", cust.getCustName());
				}
			}
			req.setAttribute("billMainPage", billMain);
		}else {
			//增加业务流水号
			if(null==billMain.getBillId()||"".equals(billMain.getBillId())){
				billMain.setBillId(getBillMaxId("", formatter.format(Calendar.getInstance().getTime())));
			}
			req.setAttribute("billMainPage", billMain);
		}
		
		List<OfficeEntity> departList = new ArrayList<OfficeEntity>();
		String officeId = oConvertUtils.getString(req.getParameter("officeId"));
		if(!StringUtil.isEmpty(officeId)){
			departList.add((OfficeEntity)systemService.getEntity(OfficeEntity.class,officeId));
		}else {
			String departMentId = ResourceUtil.getDepartId();	//获取登录用户所属银行
			departList.addAll((List)systemService.findByProperty(OfficeEntity.class,"bankId",departMentId));
		}
		req.setAttribute("departList", departList);
		//客户编号
		List<CustEntity> custtList = new ArrayList<CustEntity>();
		String custId = oConvertUtils.getString(req.getParameter("custId"));
		if(!StringUtil.isEmpty(custId)){
			custtList.add((CustEntity)systemService.getEntity(CustEntity.class,custId));
		}else {
			custtList.addAll((List)systemService.getList(CustEntity.class));
		}
		req.setAttribute("custtList", custtList);
		return new ModelAndView("com/lhmh/FinancialRegistration/billMain");
	}
	
	
	/**
	 * 加载明细列表[产品明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "billProductList")
	public ModelAndView billProductList(BillMainEntity billMain, HttpServletRequest req) {
	
		//获取参数
		Object id0 = billMain.getId();
		//查询-产品明细
	    String hql0 = "from BillProductEntity where 1 = 1 AND billId = ? ";
		try{
		    List<BillProductEntity> billProductEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("billProductList", billProductEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/lhmh/FinancialRegistration/billProductList");
	}
	
	/**
	 * 登记录入 开始
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "start")
	@ResponseBody
	public AjaxJson start(BillEntity bill, HttpServletRequest request) {
		
		SimpleDateFormat formatter; 
		formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
		message = "更新成功";
		AjaxJson j = new AjaxJson();
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		
		try {
			bill.setBeginTime(formatter.format(Calendar.getInstance().getTime()));
			bill.setBStatus("2");
			billMainService.updateEntitie(bill);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请等级补录";
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 登记录入 结束
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "end")
	@ResponseBody
	public AjaxJson end(BillEntity bill, HttpServletRequest request) {
		SimpleDateFormat formatter; 
		formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
	    message = "更新成功";
		AjaxJson j = new AjaxJson();
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		
		try {
			bill.setEndTime(formatter.format(Calendar.getInstance().getTime()));
			billMainService.updateEntitie(bill);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请等级补录";
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 登记录入 结束
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "accpet")
	@ResponseBody
	public AjaxJson accpet(BillEntity bill, HttpServletRequest request) {
		SimpleDateFormat formatter; 
	    formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
	    message = "更新成功";
		AjaxJson j = new AjaxJson();
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		try {
			if("3".equals(bill.getBStatus())){
				bill.setBStatus("0");
				billMainService.updateEntitie(bill);
			}else{
				message = "不能更新理财状态不是已完成的单据！";
			}
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请等级补录";
		}
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
	public ModelAndView review(BillEntity bill, HttpServletRequest req) {
		//获取选择的条目信息
		if (StringUtil.isNotEmpty(bill.getId())) {
			bill = billMainService.getEntity(BillEntity.class, bill.getId());
			req.setAttribute("billPage", bill);
		}
		SimpleDateFormat formatter; 
	 	//理财时间
	    formatter = new SimpleDateFormat ("yyyyMMdd"); 
	    String time = formatter.format(Calendar.getInstance().getTime());
	    req.setAttribute("time", time);
	    logger.info(bill.getId());
	    req.setAttribute("id", bill.getId());
	    
	    String beginTime = "";
	    beginTime = bill.getBeginTime();
	    String endTime = "";
	    endTime = bill.getEndTime();
	    
	    if(beginTime == null || "".equals(beginTime)){
	    	beginTime = time.substring(0,4)+"-"+time.substring(4,6)+"-"+time.substring(6)+" 00:00:00";		    	
	    }
	    if(endTime == null || "".equals(endTime)){
	    	endTime = time.substring(0,4)+"-"+time.substring(4,6)+"-"+time.substring(6)+" 23:59:59";
	    }
	    req.setAttribute("beginTime", beginTime);
	    req.setAttribute("endTime", endTime);

		String terminalId = bill.getTerminalId();
		String ip = "";
		List<TerminalEntity> stolist  = systemService.findByProperty(TerminalEntity.class, "terminalId", terminalId);
		if(stolist!=null){
			if(stolist.size()>0){
				TerminalEntity terminal = stolist.get(0);
				ip = terminal.getTerminalIp();
			}
		}
		req.setAttribute("ip", ip);
		//jianglfadd
		//获取主能道号
		//
		req.setAttribute("chan", "0");
	    req.setAttribute("id", bill.getId());
	    req.setAttribute("cont", getBASE64(bill.getCustName()+" "+bill.getBillId()+" "+bill.getUserName()+" "+bill.getUserId()));
		    
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_review");  
	}
	
	//视频回放保存reviewsave
	/**
	 * 添加业务登记
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "reviewsave")
	@ResponseBody
	public AjaxJson reviewsave(BillEntity bill,BillMainPage billMainPage, HttpServletRequest request) {
		List<BillProductEntity> billProductList =  billMainPage.getBillProductList();
		AjaxJson j = new AjaxJson();
		
		String beginTime = request.getParameter("beginTime");
		String endTime = request.getParameter("endTime");
		String id = request.getParameter("id");
	    message = "更新成功";
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		try {
			bill.setBeginTime(beginTime);
			bill.setEndTime(endTime);
			bill.setBStatus("3");
			billMainService.updateEntitie(bill);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请等级补录";
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 视频预览review
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "dispaly")
	public ModelAndView display(BillEntity bill, HttpServletRequest req) {
		//获取选择的条目信息
		if (StringUtil.isNotEmpty(bill.getId())) {
			bill = billMainService.getEntity(BillEntity.class, bill.getId());
			req.setAttribute("billPage", bill);
		}
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_display");  
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

	/**
	 * <li>方法名：getPrdouct
	 * <li>@param request HttpServletRequest
	 * <li>@param comboTree ComboTree
	 * <li>@return 产品列表tree
	 * <li>返回类型：List<ComboTree>
	 * <li>说明：回去产品列表
	 * <li>创建人：jarod
	 * <li>创建日期：2013-8-13
	 * <li>修改人： 
	 * <li>修改日期：
	 */
	@RequestMapping(params = "getPrdouct")
	@ResponseBody
	public List<BussproductEntity> getChildren(HttpServletRequest request) {
		//获取产品信息
		 String hql0 = "FROM BussproductEntity";
			    List<BussproductEntity> billProductEntityList = systemService.findHql(hql0,null);
			    request.setAttribute("billProductList", billProductEntityList);
		
		return billProductEntityList;
	}
	
	/**
	 * 理财室数据 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "selectOffice")
	public ModelAndView storage(HttpServletRequest request) {
		List<OfficeEntity> departList = systemService.getList(OfficeEntity.class);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "officeeName", "officeId"));
		return new ModelAndView("com/lhmh/storage/storageList");
	}

	/*
	 * 最大号为１０位，前６位为日期格式，后４位为顺序号 当前传入系统登录日期，银行编号先不传
	 * 如果当日已月201506260001的记录，本方法返回值加１，为201506260002 如果当日无记录，则返回201506260001
	 */
	public String getBillMaxId(String bankId, String date1) {
		String tableId = "";
		String sql = "select max(bill_id) bill_id  from bill where crt_date='"
				+ date1 + "' ";

		List<String> roles = systemService.findListbySql(sql);
		if (roles != null) {
			if (roles.get(0) == null || roles.get(0) == "null") {
				tableId = "1";
			} else {
				tableId = roles.get(0).substring(8);
				tableId = (Integer.parseInt(tableId) + 1) + "";
			}
		} else {
			tableId = "1";
		}
		String result = date1 + String.format("%1$4s", tableId);
		result = result.replace(" ", "0");
		return result;
	}
	public static String getBASE64(String s) {
		if (s == null)
			return "";
		BASE64Encoder encoder = new BASE64Encoder();
		try {
			String sb =  encoder.encode(s.getBytes());
			return sb;
		} catch (Exception e) {
			return "";
		}
	}
}

