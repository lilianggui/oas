package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import com.jy.medusa.validator.MyPattern;
import com.jy.medusa.validator.annotation.Length;
import com.jy.medusa.validator.annotation.Validator;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:13:04
 */
@Table(name = "users")
@JsonIgnoreProperties(value={"handler"})
public class Users {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "company_id")
	private Integer companyId;

	/*用户名称*/
	@Column(name = "username")
	private String username;

	/*用户密码*/
	@Column(name = "password")
	private String password;

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

	public void setCompanyId(Integer companyId) {
		this.companyId=companyId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setUsername(String username) {
		this.username=username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String getPassword() {
		return password;
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
