package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:13:03
 */
@Table(name = "staff_role")
@JsonIgnoreProperties(value={"handler"})
public class StaffRole {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*员工id*/
	@Column(name = "staff_id")
	private Integer staffId;

	/*角色id*/
	@Column(name = "role_id")
	private Integer roleId;

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

	public void setStaffId(Integer staffId) {
		this.staffId=staffId;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId=roleId;
	}

	public Integer getRoleId() {
		return roleId;
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
