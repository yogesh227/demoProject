package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class DeptId {

	@Column( name = "DeptId_name")
	private String name;
	
	@Column( name = "DeptId_label")
	private String label;
	
	@Column( name = "DeptId_description")
	private String description;
	
	private String dataTypeDefnId;
	
    @Embedded
    private DataTypeDefn dataTypeDefn;
    @Embedded
    private DataTypeDefnParameters dataTypeDefnParameters;
    
    private String sequence;
    private String searchableFlag;
    private String deletedFlag;
    private String primaryKeyFlag;
    private String uniqueKeyFlag;
    private String nullableFlag;
    
    @Column( name = "DeptId_tenantId")
    private String tenantId;
    private String localizedFlag;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDataTypeDefnId() {
		return dataTypeDefnId;
	}
	public void setDataTypeDefnId(String dataTypeDefnId) {
		this.dataTypeDefnId = dataTypeDefnId;
	}
	public DataTypeDefn getDataTypeDefn() {
		return dataTypeDefn;
	}
	public void setDataTypeDefn(DataTypeDefn dataTypeDefn) {
		this.dataTypeDefn = dataTypeDefn;
	}
	public DataTypeDefnParameters getDataTypeDefnParameters() {
		return dataTypeDefnParameters;
	}
	public void setDataTypeDefnParameters(DataTypeDefnParameters dataTypeDefnParameters) {
		this.dataTypeDefnParameters = dataTypeDefnParameters;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getSearchableFlag() {
		return searchableFlag;
	}
	public void setSearchableFlag(String searchableFlag) {
		this.searchableFlag = searchableFlag;
	}
	public String getDeletedFlag() {
		return deletedFlag;
	}
	public void setDeletedFlag(String deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	public String getPrimaryKeyFlag() {
		return primaryKeyFlag;
	}
	public void setPrimaryKeyFlag(String primaryKeyFlag) {
		this.primaryKeyFlag = primaryKeyFlag;
	}
	public String getUniqueKeyFlag() {
		return uniqueKeyFlag;
	}
	public void setUniqueKeyFlag(String uniqueKeyFlag) {
		this.uniqueKeyFlag = uniqueKeyFlag;
	}
	public String getNullableFlag() {
		return nullableFlag;
	}
	public void setNullableFlag(String nullableFlag) {
		this.nullableFlag = nullableFlag;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getLocalizedFlag() {
		return localizedFlag;
	}
	public void setLocalizedFlag(String localizedFlag) {
		this.localizedFlag = localizedFlag;
	}

	
}
