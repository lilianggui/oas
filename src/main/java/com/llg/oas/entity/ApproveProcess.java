package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:12:57
 */
@Table(name = "approve_process")
@JsonIgnoreProperties(value={"handler"})
public class ApproveProcess {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "company_id")
	private Integer companyId;

	/*流程名称*/
	@Column(name = "name")
	private Integer name;

	/*备注*/
	@Column(name = "remark")
	private String remark;

	/*创建人*/
	@Column(name = "created_by")
	private Integer createdBy;

	/*编辑人*/
	@Column(name = "updated_by")
	private Integer updatedBy;

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

	public void setName(Integer name) {
		this.name=name;
	}

	public Integer getName() {
		return name;
	}

	public void setRemark(String remark) {
		this.remark=remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy=createdBy;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy=updatedBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
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
