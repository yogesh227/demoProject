package com.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {

	@Embedded
	private DeptDivId deptDivId;

//	@Embedded
//	private DeptId deptId;
//
//	@Embedded
//	private DivId divId;

	public DeptDivId getDeptDivId() {
		return deptDivId;
	}

	public void setDeptDivId(DeptDivId deptDivId) {
		this.deptDivId = deptDivId;
	}

//	public DeptId getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(DeptId deptId) {
//		this.deptId = deptId;
//	}
//
//	public DivId getDivId() {
//		return divId;
//	}
//
//	public void setDivId(DivId divId) {
//		this.divId = divId;
//	}
	
	

}
