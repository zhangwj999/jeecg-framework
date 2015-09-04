package com.lhmh.service.impl.terminal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.terminal.TerminalServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("terminalService")
@Transactional
public class TerminalServiceImpl extends CommonServiceImpl implements TerminalServiceI {
	
}