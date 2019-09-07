package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:12:59
 */
@Table(name = "company")
@JsonIgnoreProperties(value={"handler"})
public class Company {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "company_name")
	private Integer companyName;

	/*创建时间*/
	@Column(name = "created_at")
	private Date createdAt;

	/*更新时间*/
	@Column(name = "updated_at")
	private Date updatedAt;


	public void setId(Integer id) {
		this.id=id;
	}

	public Integer getId() {
		return id;
	}

	public void setCompanyName(Integer companyName) {
		this.companyName=companyName;
	}

	public Integer getCompanyName() {
		return companyName;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt=createdAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt=updatedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

}
