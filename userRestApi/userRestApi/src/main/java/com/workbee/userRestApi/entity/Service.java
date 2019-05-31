package com.workbee.userRestApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	  private Long code;
	  private String label;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
	  public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	  public Long getCode() {
		return  code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	
	
	
	
	  public String getLabel() {
			return  label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
