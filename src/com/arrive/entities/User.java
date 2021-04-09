package com.arrive.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import jpa.entitymodels.Course;

@Entity
public class User {
	@Id
	private int id;
	@Basic
	private String firstName;
	@Basic
	private String lastName;
	@Basic
	private String email;
	@Basic 
	private String password;
	@Basic
	private String pixelPref;
	@Basic 
	private boolean admin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPixelPref() {
		return pixelPref;
	}
	public void setPixelPref(String pixelPref) {
		this.pixelPref = pixelPref;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	
	
	
	
}
