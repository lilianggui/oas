package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:12:58
 */
@Table(name = "approve_process_node")
@JsonIgnoreProperties(value={"handler"})
public class ApproveProcessNode {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*流程id*/
	@Column(name = "process_id")
	private Integer processId;

	/*序号*/
	@Column(name = "num")
	private Integer num;

	/*节点审批人*/
	@Column(name = "staff_id")
	private Integer staffId;

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

	public void setProcessId(Integer processId) {
		this.processId=processId;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setNum(Integer num) {
		this.num=num;
	}

	public Integer getNum() {
		return num;
	}

	public void setStaffId(Integer staffId) {
		this.staffId=staffId;
	}

	public Integer getStaffId() {
		return staffId;
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
