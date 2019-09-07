package com.llg.oas.service.impl;

import com.llg.oas.entity.StaffRole;
import javax.annotation.Resource;
import com.llg.oas.persistence.StaffRoleMapper;
import com.llg.oas.service.StaffRoleService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:13:03
 */
@Service
public class StaffRoleServiceImpl extends BaseServiceImpl<StaffRole> implements StaffRoleService {

	@Resource
	private StaffRoleMapper staffRoleMapper;

}