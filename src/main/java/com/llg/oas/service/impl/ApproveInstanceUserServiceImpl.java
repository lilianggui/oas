package com.llg.oas.service.impl;

import com.llg.oas.entity.ApproveInstanceUser;
import javax.annotation.Resource;
import com.llg.oas.persistence.ApproveInstanceUserMapper;
import com.llg.oas.service.ApproveInstanceUserService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:12:56
 */
@Service
public class ApproveInstanceUserServiceImpl extends BaseServiceImpl<ApproveInstanceUser> implements ApproveInstanceUserService {

	@Resource
	private ApproveInstanceUserMapper approveInstanceUserMapper;

}