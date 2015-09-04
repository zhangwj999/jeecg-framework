package com.lhmh.service.impl.channell;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.channell.ChannellServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("channellService")
@Transactional
public class ChannellServiceImpl extends CommonServiceImpl implements ChannellServiceI {
	
}