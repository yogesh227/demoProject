package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ParameterDefns {
    private String test4;

    @Column(insertable = false, updatable = false)
	public String getTest4() {
		return test4;
	}

	public void setTest4(String test4) {
		this.test4 = test4;
	}
    
    
}
