package com.arrive.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="checkIn") 
public class CheckIn {
@Id
int id;
String date;
String feelValue;
String checkInText;

public CheckIn() {
	super();
}

public CheckIn(int id, String date, String feelValue, String checkInText) {
	super();
	this.id = id;
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
