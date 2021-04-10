package com.arrive.corey.barr.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//This is the checkIn entity object constructor and setters and getters
@Entity
@Table(name = "checkIn")
public class CheckIn {
	@Id
	int id;
	int userId;
	String date;
	String feelValue;
	String checkInText;

	public CheckIn() {
		super();
	}

	public CheckIn(int id, int userId, String date, String feelValue, String checkInText) {
		super();
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.feelValue = feelValue;
		this.checkInText = checkInText;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFeelValue() {
		return feelValue;
	}

	public void setFeelValue(String feelValue) {
		this.feelValue = feelValue;
	}

	public String getCheckInText() {
		return checkInText;
	}

	public void setCheckInText(String checkInText) {
		this.checkInText = checkInText;
	}

}
