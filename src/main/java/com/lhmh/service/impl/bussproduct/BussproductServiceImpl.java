package com.lhmh.service.impl.bussproduct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.bussproduct.BussproductServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("bussproductService")
@Transactional
public class BussproductServiceImpl extends CommonServiceImpl implements BussproductServiceI {
	
}