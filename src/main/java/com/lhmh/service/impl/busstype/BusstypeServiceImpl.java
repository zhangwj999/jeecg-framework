package com.lhmh.service.impl.busstype;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.busstype.BusstypeServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("busstypeService")
@Transactional
public class BusstypeServiceImpl extends CommonServiceImpl implements BusstypeServiceI {
	
}