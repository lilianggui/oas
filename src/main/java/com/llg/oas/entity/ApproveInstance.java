package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:12:56
 */
@Table(name = "approve_instance")
@JsonIgnoreProperties(value={"handler"})
public class ApproveInstance {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "company_id")
	private Integer companyId;

	/*流程id*/
	@Column(name = "approve_process_id")
	private Integer approveProcessId;

	/*状态，1新发起、2已完成*/
	@Column(name = "status")
	private Integer status;

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

	public void setApproveProcessId(Integer approveProcessId) {
		this.approveProcessId=approveProcessId;
	}

	public Integer getApproveProcessId() {
		return approveProcessId;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}

	public Integer getStatus() {
		return status;
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
