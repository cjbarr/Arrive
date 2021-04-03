package com.arrive.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="checkIn") 
public class CheckIn {
@Id
int id;


int feelValue;
String checkInText;

public CheckIn() {
	super();
}


public CheckIn(int id, int feelValue, String checkInText) {
	super();
	this.id = id;
	this.feelValue = feelValue;
	this.checkInText = checkInText;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getFeelValue() {
	return feelValue;
}

public void setFeelValue(int feelValue) {
	this.feelValue = feelValue;
}

public String getCheckInText() {
	return checkInText;
}

public void setCheckInText(String checkInText) {
	this.checkInText = checkInText;
}

}
