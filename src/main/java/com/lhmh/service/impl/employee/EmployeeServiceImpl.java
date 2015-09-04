package com.lhmh.service.impl.employee;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.employee.EmployeeServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl extends CommonServiceImpl implements EmployeeServiceI {
	
}