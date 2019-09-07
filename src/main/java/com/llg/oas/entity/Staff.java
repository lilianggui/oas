package com.llg.oas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jy.medusa.stuff.annotation.Column;
import com.jy.medusa.stuff.annotation.Table;
import com.jy.medusa.stuff.annotation.Id;

import java.util.Date;

/**
 * Created by llg on 2018-04-02 22:13:02
 */
@Table(name = "staff")
@JsonIgnoreProperties(value={"handler"})
public class Staff {

	/*自增id*/
	@Id
	@Column(name = "id")
	private Integer id;

	/*公司id*/
	@Column(name = "company_id")
	private Integer companyId;

	/*部门id*/
	@Column(name = "dept_id")
	private Integer deptId;

	/*账户*/
	@Column(name = "account")
	private String account;

	/*密码*/
	@Column(name = "password")
	private String password;

	/*姓名*/
	@Column(name = "name")
	private Integer name;

	/*工号*/
	@Column(name = "job_number")
	private String jobNumber;

	/*职务*/
	@Column(name = "duty")
	private String duty;

	/*性别*/
	@Column(name = "sex")
	private Integer sex;

	/*生日*/
	@Column(name = "birthday")
	private Date birthday;

	/*状态*/
	@Column(name = "status")
	private Integer status;

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

	public void setDeptId(Integer deptId) {
		this.deptId=deptId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setAccount(String account) {
		this.account=account;
	}

	public String getAccount() {
		return account;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setName(Integer name) {
		this.name=name;
	}

	public Integer getName() {
		return name;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber=jobNumber;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setDuty(String duty) {
		this.duty=duty;
	}

	public String getDuty() {
		return duty;
	}

	public void setSex(Integer sex) {
		this.sex=sex;
	}

	public Integer getSex() {
		return sex;
	}

	public void setBirthday(Date birthday) {
		this.birthday=birthday;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}

	public Integer getStatus() {
		return status;
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
