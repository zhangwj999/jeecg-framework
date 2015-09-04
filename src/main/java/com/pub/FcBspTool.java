package com.pub;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;

import com.lhmh.entity.userdatapermit.UserDataPermitEntity;

public class FcBspTool {
	
	static final String DATA_PERMIT_PERSON = "1";
	static final String DATA_PERMIT_ORG = "2";
	
	/**
	 * 获取登录用户对应的数据权限 返回list
	 * @param logger
	 * @param systemService
	 * @param type	1：人员 2:部门
	 * @return
	 */
	public static List<String> getDataPermit(Logger logger,SystemService systemService,String type){
		TSUser user = ResourceUtil.getSessionUserName();
		String userId = user.getId();
		List<UserDataPermitEntity> dataPermitList = systemService.findByProperty(UserDataPermitEntity.class, "userId", userId);
		dataPermitList = dataPermitList == null ? new ArrayList<UserDataPermitEntity>() : dataPermitList;
		List<String> organList = new ArrayList<String>();
		for(int i = 0;i<dataPermitList.size();i++){
			UserDataPermitEntity tmp = dataPermitList.get(i);
			if("1".equals(type)){
				organList.add(tmp.getDataUserId());				
			}else{
				organList.add(tmp.getDataOrgId());
			}
		}
		if("1".equals(type)){
			organList.add(userId);
		}else{
			TSDepart tsDepart = user.getTSDepart();
			organList.add(tsDepart.getId());			
		}

		Set<String> set = new HashSet<String>(organList);
		logger.info("FcBspTool+getDatePermit+set=="+set);
		return new ArrayList<String>(set);
	}
	
	/**
	 * 用户数据权限
	 * @param logger
	 * @param systemService
	 * @return
	 */
	public static List getUserDataPermit(Logger logger,SystemService systemService){
		return  getDataPermit(logger,systemService,"1");
	}
	
	/**
	 * 部门数据权限
	 * @param logger
	 * @param systemService
	 * @return
	 */
	public static List getDepartDataPermit(Logger logger,SystemService systemService){
		return  getDataPermit(logger,systemService,"2");
	}	
}
