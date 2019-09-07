package com.llg.oas.service.impl;

import com.llg.oas.entity.Company;
import javax.annotation.Resource;
import com.llg.oas.persistence.CompanyMapper;
import com.llg.oas.service.CompanyService;

import org.springframework.stereotype.Service;

/**
 * Created by llg on 2018-04-02 22:12:59
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService {

	@Resource
	private CompanyMapper companyMapper;

}