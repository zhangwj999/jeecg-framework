package com.lhmh.service.impl.channel;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.channel.ChannelServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("channelService")
@Transactional
public class ChannelServiceImpl extends CommonServiceImpl implements ChannelServiceI {
	
}