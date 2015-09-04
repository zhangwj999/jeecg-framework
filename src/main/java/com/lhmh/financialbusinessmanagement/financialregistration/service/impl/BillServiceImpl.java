package com.lhmh.financialbusinessmanagement.financialregistration.service.impl;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.financialbusinessmanagement.financialregistration.service.BillServiceI;

@Service("billService")
@Transactional
public class BillServiceImpl extends CommonServiceImpl implements BillServiceI {
	
}