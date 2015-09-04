package com.lhmh.service.impl.office;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.lhmh.service.office.OfficeServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.util.MyBeanUtils;
import com.lhmh.entity.office.OfficeEntity;
import com.lhmh.entity.office.OfficeChannelEntity;
@Service("officeService")
@Transactional
public class OfficeServiceImpl extends CommonServiceImpl implements OfficeServiceI {

	
	public void addMain(OfficeEntity office,
	        List<OfficeChannelEntity> officeChannelList){
			//保存主信息
			this.save(office);
		
			/**保存-通道*/
			for(OfficeChannelEntity officeChannel:officeChannelList){
				//外键设置
				officeChannel.setId(office.getId());
				//外键设置
				officeChannel.setOfficeId(office.getOfficeId());
				this.save(officeChannel);
			}
	}

	
	public void updateMain(OfficeEntity office,
	        List<OfficeChannelEntity> officeChannelList) {
		//保存订单主信息
		this.saveOrUpdate(office);
		
		
		//===================================================================================
		//获取参数
		//Object id0 = office.getId();
		Object id1 = office.getOfficeId();
		//===================================================================================
		//1.查询出数据库的明细数据-通道
	    String hql0 = "from OfficeChannelEntity where 1 = 1  AND officeId = ? ";
	    List<OfficeChannelEntity> officeChannelOldList = this.findHql(hql0,id1);
		//2.筛选更新明细数据-通道
		for(OfficeChannelEntity oldE:officeChannelOldList){
			boolean isUpdate = false;
				for(OfficeChannelEntity sendE:officeChannelList){
					//需要更新的明细数据-通道
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-通道
		    		super.delete(oldE);
	    		}
	    		
			}
		//3.持久化新增的数据-通道
		for(OfficeChannelEntity officeChannel:officeChannelList){
			if(officeChannel.getId()==null){
				//外键设置
				officeChannel.setId(office.getId());
				officeChannel.setOfficeId(office.getOfficeId());
				this.save(officeChannel);
			}
		}
		
	}

	
	public void delMain(OfficeEntity office) {
		//删除主表信息
		this.delete(office);
		
		//===================================================================================
		//获取参数
		//Object id0 = office.getId();
		Object id1 = office.getOfficeId();
		//===================================================================================
		//删除-通道
	    String hql0 = "from OfficeChannelEntity where 1 = 1  AND officeId = ? ";
	    List<OfficeChannelEntity> officeChannelOldList = this.findHql(hql0,id1);
		this.deleteAllEntitie(officeChannelOldList);
	}
	
}