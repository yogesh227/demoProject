package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class Content {
	
	private String apiConnectionDefnId;
	private String apiPath;
	@Column( name = "Content_name")
	private String name;
	private String label;
	private String description;
	private String version;
	private String activeFlag;
	private String type;
	private String tenantId;
    @Embedded
    private ApiHeaders apiHeaders;
    
    private String apiConnectionDefn;
	private String baseMasterDataDefnId;
	private String objectDefn;
	@Embedded
	private Fields fields;

	public String getApiConnectionDefnId() {
		return apiConnectionDefnId;
	}
	public void setApiConnectionDefnId(String apiConnectionDefnId) {
		this.apiConnectionDefnId = apiConnectionDefnId;
	}
	public String getApiPath() {
		return apiPath;
	}
	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public ApiHeaders getApiHeaders() {
		return apiHeaders;
	}
	public void setApiHeaders(ApiHeaders apiHeaders) {
		this.apiHeaders = apiHeaders;
	}
	public String getApiConnectionDefn() {
		return apiConnectionDefn;
	}
	public void setApiConnectionDefn(String apiConnectionDefn) {
		this.apiConnectionDefn = apiConnectionDefn;
	}
	public String getBaseMasterDataDefnId() {
		return baseMasterDataDefnId;
	}
	public void setBaseMasterDataDefnId(String baseMasterDataDefnId) {
		this.baseMasterDataDefnId = baseMasterDataDefnId;
	}
	public String getObjectDefn() {
		return objectDefn;
	}
	public void setObjectDefn(String objectDefn) {
		this.objectDefn = objectDefn;
	}
	public Fields getFields() {
		return fields;
	}
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	
}
