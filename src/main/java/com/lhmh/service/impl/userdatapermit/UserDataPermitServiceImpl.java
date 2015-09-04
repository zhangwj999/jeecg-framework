package com.lhmh.service.impl.userdatapermit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.userdatapermit.UserDataPermitServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("userDataPermitService")
@Transactional
public class UserDataPermitServiceImpl extends CommonServiceImpl implements UserDataPermitServiceI {
	
}