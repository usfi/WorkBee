package com.workbee.userRestApi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bid")
public class Bid {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  private Long code;
	  private String description;
	  private Date deadline;
	  private String preview;
	  private float price;
	  
	  
}
