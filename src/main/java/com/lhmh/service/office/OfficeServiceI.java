package com.lhmh.service.office;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.entity.office.OfficeChannelEntity;

public interface OfficeServiceI extends CommonService{

	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(OfficeEntity office,
	        List<OfficeChannelEntity> officeChannelList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(OfficeEntity office,
	        List<OfficeChannelEntity> officeChannelList);
	public void delMain (OfficeEntity office);
}
