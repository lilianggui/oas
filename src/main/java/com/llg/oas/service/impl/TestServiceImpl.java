package com.llg.oas.service.impl;

import com.llg.oas.entity.Test;
import javax.annotation.Resource;
import com.llg.oas.persistence.TestMapper;
import com.llg.oas.service.TestService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-01-23 10:14:48
 */
@Service
public class TestServiceImpl extends BaseServiceImpl<Test> implements TestService {

	@Resource
	private TestMapper testMapper;

}