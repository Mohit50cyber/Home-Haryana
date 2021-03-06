package com.hrms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "M_PROGRAM")
public class Program implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4543664601105931061L;

	@Id
	@Column(name = "PRG_CODE")
	private String programCode;

	@Column(name = "PRG_NAME")
	private String programName;

	@Column(name = "MODULE_CODE")
	private String moduleCode;

	@Column(name = "PRG_TYPE")
	private String programType;

	@Column(name = "PRG_HREF_NAME")
	private String programHrefName;

	@Column(name = "ACTIVE_YN")
	private String activeYn;

	@Column(name = "INS_BY")
	private String insertedBy;

	@Column(name = "INS_DATE")
	private String insertedDate;

	@Column(name = "UPDATE_BY")
	private String updatedBy;

	@Column(name = "UPDATE_DATE")
	private String updatedDate;

	@Column(name = "SUB_MODULE_CODE")
	private String subModuleCode;

	@Column(name = "SEQ_NO")
	private String seqProgram;

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	public String getProgramHrefName() {
		return programHrefName;
	}

	public void setProgramHrefName(String programHrefName) {
		this.programHrefName = programHrefName;
	}

	public String getActiveYn() {
		return activeYn;
	}

	public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
	}

	public String getInsertedBy() {
		return insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	public String getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(String insertedDate) {
		this.insertedDate = insertedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getSeqProgram() {
		return seqProgram;
	}

	public void setSeqProgram(String seqProgram) {
		this.seqProgram = seqProgram;
	}

	public String getSubModuleCode() {
		return subModuleCode;
	}

	public void setSubModuleCode(String subModuleCode) {
		this.subModuleCode = subModuleCode;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

}
