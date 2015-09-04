package com.lhmh.financialbusinessmanagement.financialregistration;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

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
@RequestMapping("/billFileMainController")
public class BillFileMainController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BillFileMainController.class);

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
	 * 文件上传页面
	 * 
	 * @return
	 */
	@RequestMapping(params = "billfile")
	public ModelAndView billfile(HttpServletRequest request) {
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
		return new ModelAndView("com/lhmh/FinancialRegistration/billfile");
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
		//文件上传
		if("002".equals(bstatus)){
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
		message = "删除成功";
		billMainService.delete(billMain);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
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
			e.printStackTrace();
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
	        bill.setStatus("0");
	        bill.setBStatus("0");
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
		    
			//获取IP地址 20150702增加
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
		}else{
			 SimpleDateFormat formatter; 
		 	//理财时间
		    formatter = new SimpleDateFormat ("yyyyMMdd"); 
		    req.setAttribute("time", formatter.format(Calendar.getInstance().getTime()));
		}
		
		
		//1、先取主通道select CHANNEL_ID from office_channel where IS_MAIN='0' and officeId='';
		//2、获取文件地址select TERMINAL_IP,TERMINAL_PORT from terminal where terminal_id='';
		//3、根据 主通道好CHANNEL_ID，TERMINAL_IP，TERMINAL_PORT，我在需要页面上有添加开始时间，结束时间
		
		return new ModelAndView("com/lhmh/FinancialRegistration/bill_fillreview");  
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

