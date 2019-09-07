package com.llg.oas.service.impl;

import com.llg.oas.entity.ApproveProcessNode;
import javax.annotation.Resource;
import com.llg.oas.persistence.ApproveProcessNodeMapper;
import com.llg.oas.service.ApproveProcessNodeService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:12:58
 */
@Service
public class ApproveProcessNodeServiceImpl extends BaseServiceImpl<ApproveProcessNode> implements ApproveProcessNodeService {

	@Resource
	private ApproveProcessNodeMapper approveProcessNodeMapper;

}