package com.lhmh.service.impl.storage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhmh.service.storage.StorageServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("storageService")
@Transactional
public class StorageServiceImpl extends CommonServiceImpl implements StorageServiceI {
	
}