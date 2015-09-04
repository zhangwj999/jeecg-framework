package com.lhmh.service.impl.warncenter;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.warncenter.WarncenterServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("warncenterService")
@Transactional
public class WarncenterServiceImpl extends CommonServiceImpl implements WarncenterServiceI {
	
}