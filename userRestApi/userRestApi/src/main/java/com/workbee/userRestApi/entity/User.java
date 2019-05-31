package com.workbee.userRestApi.entity;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;


@Entity
@Table(name = "users")
     
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private Long numtel;
    private String password;
    private Long cin;
    private String adresse;
    private String Sex;
    private Long codePostal;
    private String confPassword;
  //  @Temporal(TemporalType.DATE)
   //private Date dateNaiss;
    
/*    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "avatar_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Avatar avatar;
*/

   
 
	public String getConfPassword() {
		return confPassword;
	}



	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}



	public Long getId() {
		return id;
	}



	public User(Long id, String name, String lastname, String email, Long numtel, String password, 
			Long cin, String adresse, String sex, Long codePostal, Date dateNaiss) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.numtel = numtel;
		this.password = password;
		
		this.cin = cin;
		this.adresse = adresse;
		Sex = sex;
		this.codePostal = codePostal;
		//this.dateNaiss = dateNaiss;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}






	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getNumtel() {
		return numtel;
	}



	public void setNumtel(Long numtel) {
		this.numtel = numtel;
	}




	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}









	public Long getCin() {
		return cin;
	}



	public void setCin(Long cin) {
		this.cin = cin;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getSex() {
		return Sex;
	}



	public void setSex(String sex) {
		Sex = sex;
	}



	public Long getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}



	public User(Long id,   String name,  String lastname,
			 String username,  String email, Long numtel,
			Avatar avatar,  String password, String ville, Long cin,
			String adresse, String sex, Long codePostal, String confPassword) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		
		this.email = email;
		this.numtel = numtel;
		
		this.password = password;

		this.confPassword = confPassword;
		this.cin = cin;
		this.adresse = adresse;
		this.Sex = sex;
		this.codePostal = codePostal;
		
	}
}