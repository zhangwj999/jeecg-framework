package com.lhmh.financialbusinessmanagement.financialregistration.service.impl;

import java.util.List;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillMainEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillProductEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.service.BillMainServiceI;
@Service("billMainService")
@Transactional
public class BillMainServiceImpl extends CommonServiceImpl implements BillMainServiceI {

	
	public void addMain(BillMainEntity billMain,
	        List<BillProductEntity> billProductList){
			//保存主信息
			this.save(billMain);
		
			/**保存-产品明细*/
			for(BillProductEntity billProduct:billProductList){
				//外键设置
				billProduct.setBillId(billMain.getId());
				this.save(billProduct);
			}
	}

	
	public void updateMain(BillMainEntity billMain,
	        List<BillProductEntity> billProductList) {
		//保存订单主信息
		this.saveOrUpdate(billMain);
		
		
		//===================================================================================
		//获取参数
		Object id0 = billMain.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-产品明细
	    String hql0 = "from BillProductEntity where 1 = 1 AND billId = ? ";
	    List<BillProductEntity> billProductOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-产品明细
		for(BillProductEntity oldE:billProductOldList){
			boolean isUpdate = false;
				for(BillProductEntity sendE:billProductList){
					//需要更新的明细数据-产品明细
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
		    		//如果数据库存在的明细，前台没有传递过来则是删除-产品明细
		    		super.delete(oldE);
	    		}
	    		
			}
		//3.持久化新增的数据-产品明细
		for(BillProductEntity billProduct:billProductList){
			if(billProduct.getId()==null){
				//外键设置
				billProduct.setBillId(billMain.getId());
				this.save(billProduct);
			}
		}
		
	}

	
	public void delMain(BillMainEntity billMain) {
		//删除主表信息
		this.delete(billMain);
		
		//===================================================================================
		//获取参数
		Object id0 = billMain.getId();
		//===================================================================================
		//删除-产品明细
	    String hql0 = "from BillProductEntity where 1 = 1 AND billId = ? ";
	    List<BillProductEntity> billProductOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(billProductOldList);
	}
	
}