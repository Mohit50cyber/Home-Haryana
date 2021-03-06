package com.hrms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Myuser")
public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -862375354973874455L;

	@Id
	@Column(name = "User_code")
	private String userCode;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "Emp_code")
	private String empCode;

	@Column(name = "User_pass")
	private String userPass;

	@Column(name = "User_active_yn")
	private String userActiveYn;

	@Column(name = "Ins_by")
	private String insBy;

	@Column(name = "ins_date")
	private String insDate;

	@Column(name = "upd_by")
	private String updBy;

	@Column(name = "upd_date")
	private String updDate;
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserActiveYn() {
		return userActiveYn;
	}

	public void setUserActiveYn(String userActiveYn) {
		this.userActiveYn = userActiveYn;
	}

	public String getInsBy() {
		return insBy;
	}

	public void setInsBy(String insBy) {
		this.insBy = insBy;
	}

	public String getInsDate() {
		return insDate;
	}

	public void setInsDate(String insDate) {
		this.insDate = insDate;
	}

	public String getUpdBy() {
		return updBy;
	}

	public void setUpdBy(String updBy) {
		this.updBy = updBy;
	}

	public String getUpdDate() {
		return updDate;
	}

	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
}