package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Messages {
    private String test3;

    @Column(insertable = false, updatable = false)
	public String getTest3() {
		return test3;
	}

	public void setTest3(String test3) {
		this.test3 = test3;
	}
    
}
