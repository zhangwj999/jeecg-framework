package com.lhmh.service.impl.billdetail;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.billdetail.BillDetailServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("billDetailService")
@Transactional
public class BillDetailServiceImpl extends CommonServiceImpl implements BillDetailServiceI {
	
}