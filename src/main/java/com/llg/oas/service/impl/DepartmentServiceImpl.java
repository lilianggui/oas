package com.llg.oas.service.impl;

import com.llg.oas.entity.Department;
import javax.annotation.Resource;
import com.llg.oas.persistence.DepartmentMapper;
import com.llg.oas.service.DepartmentService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:13:00
 */
@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService {

	@Resource
	private DepartmentMapper departmentMapper;

}