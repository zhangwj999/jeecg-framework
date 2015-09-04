package com.lhmh.service.impl.cust;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.cust.CustServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("custService")
@Transactional
public class CustServiceImpl extends CommonServiceImpl implements CustServiceI {
	
}