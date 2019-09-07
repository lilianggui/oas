package com.llg.oas.service.impl;

import com.llg.oas.entity.Role;
import javax.annotation.Resource;
import com.llg.oas.persistence.RoleMapper;
import com.llg.oas.service.RoleService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:13:01
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

	@Resource
	private RoleMapper roleMapper;

}