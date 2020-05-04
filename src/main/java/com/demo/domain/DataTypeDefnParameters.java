package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class DataTypeDefnParameters {
	private String tes1;

	@Column(insertable = false, updatable = false)
	public String getTes1() {
		return tes1;
	}

	public void setTes1(String tes1) {
		this.tes1 = tes1;
	}
    
}
