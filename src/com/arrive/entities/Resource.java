package com.arrive.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="resource") 
public class Resource {
@Id
int id;


String logoPic;
String description;
String web;

public Resource() {
	super();
}

public Resource(int id, String logoPic, String description, String web) {
	super();
	this.id = id;
	this.logoPic = logoPic;
	this.description = description;
	this.web = web;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLogoPic() {
	return logoPic;
}

public void setLogoPic(String logoPic) {
	this.logoPic = logoPic;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getWeb() {
	return web;
}

public void setWeb(String web) {
	this.web = web;
}



}
