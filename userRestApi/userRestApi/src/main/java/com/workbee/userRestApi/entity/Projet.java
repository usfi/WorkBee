package com.workbee.userRestApi.entity;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="projet")
public class Projet {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
private String titre;
private String  description;
private String thematique;
private float prix;
private Long nbrMot;
private Date duree;





public Date getDuree() {
	return duree;
}


public void setDuree(Date duree) {
	this.duree = duree;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getTitre() {
	return titre;
}


public void setTitre(String titre) {
	this.titre = titre;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getThematique() {
	return thematique;
}


public void setThematique(String thematique) {
	this.thematique = thematique;
}


public float getPrix() {
	return prix;
}


public void setPrix(float prix) {
	this.prix = prix;
}


public Long getNbrMot() {
	return nbrMot;
}


public void setNbrMot(Long nbrMot) {
	this.nbrMot = nbrMot;
}


}
































