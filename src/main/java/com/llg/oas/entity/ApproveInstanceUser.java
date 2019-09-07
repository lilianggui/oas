package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:12:56
 */
@Table(name = "approve_instance_user")
@JsonIgnoreProperties(value={"handler"})
public class ApproveInstanceUser {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "approve_instance_id")
	private Integer approveInstanceId;

	/*节点审批人*/
	@Column(name = "staff_id")
	private Integer staffId;

	/*顺序*/
	@Column(name = "num")
	private Integer num;

	/*是否是当前审批人*/
	@Column(name = "is_curr")
	private Integer isCurr;

	/*是否实际审批人，因为一个节点可能会有多个审批人，但只有一个实际审批的人*/
	@Column(name = "is_approve_person")
	private Integer isApprovePerson;

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

	public void setApproveInstanceId(Integer approveInstanceId) {
		this.approveInstanceId=approveInstanceId;
	}

	public Integer getApproveInstanceId() {
		return approveInstanceId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId=staffId;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setNum(Integer num) {
		this.num=num;
	}

	public Integer getNum() {
		return num;
	}

	public void setIsCurr(Integer isCurr) {
		this.isCurr=isCurr;
	}

	public Integer getIsCurr() {
		return isCurr;
	}

	public void setIsApprovePerson(Integer isApprovePerson) {
		this.isApprovePerson=isApprovePerson;
	}

	public Integer getIsApprovePerson() {
		return isApprovePerson;
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
