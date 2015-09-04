package com.lhmh.financialbusinessmanagement.financialregistration;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
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

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.lhmh.entity.billdetail.BillDetailEntity;
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
import com.pub.FcBspTool;
/**   
 * @Title: Controller
 * @Description: 业务登记
 * @author zhangdaihao
 * @date 2015-06-26 08:19:30
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/billMainController")
public class BillMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillMainController.class);

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
	 * 业务登记列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "billMain")
	public ModelAndView billMain(HttpServletRequest request) {
		
		String departMentId = ResourceUtil.getDepartId();	//获取登录用户所属银行
		String hd1 = "from OfficeEntity where bankId='"+departMentId+"')";
		//理财室
		List<OfficeEntity> departList = systemService.findHql(hd1);
		request.setAttribute("departsReplace", RoletoJson.listToReplaceStr(departList, "officeeName", "officeId"));
		//业务类型
		List<BusstypeEntity> typeList = systemService.getList(BusstypeEntity.class);
		request.setAttribute("typeReplace", RoletoJson.listToReplaceStr(typeList, "busstypeName", "busstypeId"));
		//默认查询当天
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String tody = sdf.format(new Date());
		request.setAttribute("tody", tody);
		
		return new ModelAndView("com/lhmh/FinancialRegistration/billMainList");
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
			//billMain.setBStatus("0"); 应该是<>0
			
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
		    //上传状态
		    billMain.setStatus("1");
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
		    //上传状态
		    billMain.setStatus("1");
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
			String status = bill.getBStatus();
			if(!"1".equals(status)){
				message = "状态不是未开始的单据不允许再次开始！";
			}else{
				bill.setBeginTime(formatter.format(Calendar.getInstance().getTime()));
				bill.setBStatus("2");
				billMainService.updateEntitie(bill);					
			}
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
			String status = bill.getBStatus();
			if(!"2".equals(status)){
				message = "状态不是进行中的单据不允许结束！";		
			}else{
				bill.setEndTime(formatter.format(Calendar.getInstance().getTime()));
				bill.setBStatus("3");
				billMainService.updateEntitie(bill);	
			}
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
			String status = bill.getBStatus();
			if(!"3".equals(status)){
				message = "状态不是已完成的单据不允许确认！";		
			}else{
				bill.setBStatus("0");
				bill.setStatus("1");
				billMainService.updateEntitie(bill);	
			}			
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请等级补录";
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 文件上传
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "filechange")
	@ResponseBody
	public AjaxJson filechange(BillEntity bill, HttpServletRequest request) {
		SimpleDateFormat formatter; 
	    formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
	    message = "更新成功";
		AjaxJson j = new AjaxJson();
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		try {
			bill.setStatus("0");
			bill.setBStatus("0");
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
	 * 文件上传
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "filechangeAll")
	@ResponseBody
	public AjaxJson filechangeAll(BillEntity bill, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		//批量更新
		String ids = request.getParameter("ids");
		String[] entitys = ids.split(",");
	    List<BillEntity> list = new ArrayList<BillEntity>();
		for(int i=0;i<entitys.length;i++){
			bill = systemService.getEntity(BillEntity.class, entitys[i]);
	        list.add(bill);		
	        bill.setStatus("2");
			billMainService.updateEntitie(bill);
		}
		message = "更新成功";
		systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
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
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_review");  
	}
	//视频预览
	/**
	 * 视频预览
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "display")
	public ModelAndView display(BillEntity bill, HttpServletRequest req) {
		//获取选择的条目信息
		if (StringUtil.isNotEmpty(bill.getId())) {
			bill = billMainService.getEntity(BillEntity.class, bill.getId());
			req.setAttribute("billPage", bill);
		}
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
	    
	    //客户名称+客户身份证号+产品名称+银行名称+客户经理姓名+客户经理编号+流水号+单据时间
	    String custId = bill.getCustId();
	    List<CustEntity> custList = systemService.findByProperty(CustEntity.class, "custId", custId);
	    CustEntity cust = custList.get(0);
	    
	    //产品名称 需要拼接
	    List<BillProductEntity> billProductList = systemService.findByProperty(BillProductEntity.class, "billId", bill.getBillId());
	    String productName = "";
	    List<BussproductEntity> bussProductList = new ArrayList();
	    if(billProductList != null && billProductList.size()>0){
	    	for(int i = 0;i<billProductList.size(); i++){
	    		BillProductEntity billProduct  = billProductList.get(i);
	    		String productId = billProduct.getProductId();
	    		bussProductList = systemService.findByProperty(BussproductEntity.class, "productId", productId);
	    		BussproductEntity bussProduct = bussProductList.get(0);
	    		productName += bussProduct.getProductName()+",";
	    	}
	    	productName = productName.substring(0, productName.length()-1);
	    }
	    
	    //银行名称
	    String bankName = "";
	    String bankId = bill.getBankId();
	    String sql = "select departname from t_s_depart where id='"+bankId+"'";
	    List<String> departNameList = systemService.findListbySql(sql);
	    if(departNameList != null && departNameList.size()>0){
	    	bankName = departNameList.get(0);
	    }
	    
	    String cont=getBASE64(bill.getCustName()+" "+cust.getPassId()+" "+productName+" "+bankName+" "
	    		+bill.getUserName()+" "+bill.getUserId())+" "+bill.getBillId()+" "+bill.getCrtDate();
	    req.setAttribute("cont",cont);
	    req.setAttribute("cont1",getFromBASE64(cont));
	
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
	
	
	/**
	 * 删除业务登记
	 * 
	 * @return
	 */
	@RequestMapping(params = "delBill")
	@ResponseBody
	public AjaxJson delBill(BillMainEntity billMain, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		billMain = systemService.getEntity(BillMainEntity.class, billMain.getId());
		String isDel = billMain.getIsDel();
		
		if(!"2".equals(isDel) ){
			List<BillDetailEntity> detailList = systemService.findByProperty(BillDetailEntity.class, "billId", billMain.getBillId());
			boolean delSucc = true;
			if(detailList != null && detailList.size()>0){
				//调用服务删除文件
				HttpClient client = new HttpClient();
				for(BillDetailEntity detail : detailList){
					String fileUrl = detail.getFileUrl();
					boolean delDetail = deleteFile(client,fileUrl); //删除文件
					if(delDetail==false){
						delSucc = false;
					}
				}
			}
			if(delSucc){
				message = "删除成功";
				billMain.setIsDel("2");
				billMainService.updateEntitie(billMain);
				if(detailList != null && detailList.size()>0){
					for(BillDetailEntity temp : detailList){
						temp.setIsDel("2");
						systemService.updateEntitie(temp);
					}
				}
			}
		}else{
			message = "不能删除状态为已删除的单据！";
		}
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		j.setMsg(message);
		return j;
	}
	
	//删除文件
	private Boolean deleteFile(HttpClient client,String fileUrl){
		int ipIndex = fileUrl.indexOf(":",5);
		String ip = fileUrl.substring(0,ipIndex);  //如: http:127.0.0.1
		
		String sql = "select root_id from fileroot where file_url like '"+ip+"%'";	//一一对应关系
		List<String> rootList = systemService.findListbySql(sql);
		String rootId = rootList.get(0); 	//如: /doc
		
		String fileName = rootId+fileUrl.substring(ipIndex+5); //如: /doc/media/file1.mp4
		try {
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			if(logger.isInfoEnabled()){
				logger.info("fileName encode exception=="+e1.toString());
			}
		}
		try {
			String url = ip+":8080/fileoperwebs/filedel?method=deleteFile&file="+fileName;
			if(logger.isInfoEnabled()){
				logger.info("path====================="+url);
			}
			GetMethod get = new GetMethod(url);
			client.executeMethod(get);
			if (get.getStatusCode() == HttpStatus.SC_OK) {
				return true;
			}else{
				return false;
			}
		}catch (Exception e) {
			return false;
		}
	}
	/**
	 * 计算到期日期
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "getDueDate")
	public void getDueDate(HttpServletRequest request,HttpServletResponse rep) {
		String sql = "select DATE_FORMAT( date_add(CURRENT_DATE,interval bt.month month),'%Y%m%d') sss  from busstype bt"
				+"where busstype_id='"+request.getParameter("billType")+"'";
		List<String> dueDateList = systemService.findListbySql(sql);
		String dueDate = dueDateList.get(0);
		try {
			rep.getWriter().write(dueDate);
		} catch (IOException e) {
			logger.info("getDueDate++++e=="+e.toString());
		}
	}
	
	/**
	 * 视频回放保存reviewsave
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "reviewsave")
	@ResponseBody
	
	public AjaxJson reviewsave(BillEntity bill,BillMainPage billMainPage, HttpServletRequest request) {
		List<BillProductEntity> billProductList =  billMainPage.getBillProductList();
		AjaxJson j = new AjaxJson();
		//logger.info("reviewsave"+bill.toString());
		String beginTime = request.getParameter("begin");
		String endTime = request.getParameter("end");
		String id = request.getParameter("id");
	    message = "更新成功";
		bill = systemService.getEntity(BillEntity.class, bill.getId());
		//logger.info("bill"+bill.toString());
		try {
			bill.setBeginTime(beginTime);
			bill.setEndTime(endTime);
			bill.setBStatus("3");
			billMainService.updateEntitie(bill);
			//logger.info("bill"+bill.toString());
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			logger.info(e.getMessage());
			message = "更新失败，请进行补录";
		}
		j.setMsg(message);
		return j;
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
	  public static String getFromBASE64(String s) {
			if (s == null)
				return "";
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				byte[] b = decoder.decodeBuffer(s);
				return new String(b);
			} catch (Exception e) {
				return "";
			}
		}
}

