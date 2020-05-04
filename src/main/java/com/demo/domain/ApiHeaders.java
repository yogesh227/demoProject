package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ApiHeaders {

	private String test2;

	@Column(insertable = false, updatable = false)
	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	
    
}
