package com.llg.oas.service.impl;

import com.llg.oas.entity.ApproveProcess;
import javax.annotation.Resource;
import com.llg.oas.persistence.ApproveProcessMapper;
import com.llg.oas.service.ApproveProcessService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:12:57
 */
@Service
public class ApproveProcessServiceImpl extends BaseServiceImpl<ApproveProcess> implements ApproveProcessService {

	@Resource
	private ApproveProcessMapper approveProcessMapper;

}