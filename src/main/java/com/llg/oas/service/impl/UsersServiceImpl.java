package com.llg.oas.service.impl;

import com.llg.oas.entity.Users;
import javax.annotation.Resource;
import com.llg.oas.persistence.UsersMapper;
import com.llg.oas.service.UsersService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:13:04
 */
@Service
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService {

	@Resource
	private UsersMapper usersMapper;

}