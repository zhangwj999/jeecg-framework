package com.lhmh.service.impl.billproduct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.billproduct.BillproductServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("billproductService")
@Transactional
public class BillproductServiceImpl extends CommonServiceImpl implements BillproductServiceI {
	
}