package com.llg.oas.service.impl;

import com.llg.oas.entity.Staff;
import javax.annotation.Resource;
import com.llg.oas.persistence.StaffMapper;
import com.llg.oas.service.StaffService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:13:02
 */
@Service
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService {

	@Resource
	private StaffMapper staffMapper;

}