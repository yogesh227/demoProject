package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTypeDefn {

    
	@Column( name = "DataTypeDefn_dataTypeDefnId")
    private String dataTypeDefnId;
	
	@Column( name = "DataTypeDefn_name")
    private String name;
	
//	@ElementCollection 
//    private List<ParameterDefns> parameterDefns;
//    
    @Embedded
    private DataTypeDefnParameters dataTypeDefnParameters;
    
	public String getDataTypeDefnId() {
		return dataTypeDefnId;
	}
	public void setDataTypeDefnId(String dataTypeDefnId) {
		this.dataTypeDefnId = dataTypeDefnId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public DataTypeDefnParameters getDataTypeDefnParameters() {
		return dataTypeDefnParameters;
	}
//	public List<ParameterDefns> getParameterDefns() {
//		return parameterDefns;
//	}
//	public void setParameterDefns(List<ParameterDefns> parameterDefns) {
//		this.parameterDefns = parameterDefns;
//	}
	public void setDataTypeDefnParameters(DataTypeDefnParameters dataTypeDefnParameters) {
		this.dataTypeDefnParameters = dataTypeDefnParameters;
	}
   
    
}
