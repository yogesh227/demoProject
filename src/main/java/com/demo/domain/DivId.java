package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class DivId {

	@Column( name = "DivId_name")
	private String name;
	
	@Column( name = "DivId_label")
	private String label;
	
	@Column( name = "DivId_description")
	private String description;
	
	@Column( name = "DivId_dataTypeDefnId")
	private String dataTypeDefnId;
	
    @Embedded
    private DataTypeDefn dataTypeDefn;
    
    @Embedded
    private DataTypeDefnParameters dataTypeDefnParameters;
    
    @Column( name = "DivId_sequence")
    private String sequence;
    
    @Column( name = "DivId_searchableFlag")
    private String searchableFlag;
    
    @Column( name = "DivId_deletedFlag")
    private String deletedFlag;
    
    @Column( name = "DivId_primaryKeyFlag")
    private String primaryKeyFlag;
    
    @Column( name = "DivId_uniqueKeyFlag")
    private String uniqueKeyFlag;
    
    @Column( name = "DivId_nullableFlag")
    private String nullableFlag;
    
    @Column( name = "DeptId_tenantId")
    private String tenantId;
    
    @Column( name = "DivId_localizedFlag")
    private String localizedFlag;

	
}
