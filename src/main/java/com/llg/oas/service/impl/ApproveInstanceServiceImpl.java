package com.llg.oas.service.impl;

import com.llg.oas.entity.ApproveInstance;
import javax.annotation.Resource;
import com.llg.oas.persistence.ApproveInstanceMapper;
import com.llg.oas.service.ApproveInstanceService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:12:56
 */
@Service
public class ApproveInstanceServiceImpl extends BaseServiceImpl<ApproveInstance> implements ApproveInstanceService {

	@Resource
	private ApproveInstanceMapper approveInstanceMapper;

}