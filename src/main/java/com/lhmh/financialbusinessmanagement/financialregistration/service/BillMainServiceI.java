package com.lhmh.financialbusinessmanagement.financialregistration.service;

import java.util.List;

import org.jeecgframework.core.common.service.CommonService;

import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillMainEntity;
import com.lhmh.financialbusinessmanagement.financialregistration.entity.BillProductEntity;

public interface BillMainServiceI extends CommonService{

	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(BillMainEntity billMain,
	        List<BillProductEntity> billProductList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(BillMainEntity billMain,
	        List<BillProductEntity> billProductList);
	public void delMain (BillMainEntity billMain);
}
