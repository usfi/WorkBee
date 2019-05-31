package com.workbee.userRestApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="theme")
public class Theme {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theme(Long id, Long code, String label) {
		super();
		this.id = id;
		this.code = code;
		this.label = label;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	private Long code;
	   private String label;
	   
	   
}
