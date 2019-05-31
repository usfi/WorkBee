package com.workbee.userRestApi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="writer")
public class Writer{
	
	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String cv;
	 private Date birth_day;
	 
	 private String study_lavel;
	 private boolean is_valid;
	 private Long nbr_bids;
	 
}
