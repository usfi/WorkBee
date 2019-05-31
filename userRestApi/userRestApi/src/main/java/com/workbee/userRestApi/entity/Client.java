package com.workbee.userRestApi.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="client")
public class Client{
	

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	    private Long id;
private String compagnie_name;
private float  mat_fiscal;
private String representative_post;
private String website;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
}
