package com.arrive.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="blog") 
public class Blog {
@Id
int id;
String imageLink;
String blogText;
String title;

public Blog() {
	super();
}

public Blog(int id, String imageLink, String blogText, String title) {
	super();
	this.id = id;
	this.imageLink = imageLink;
	this.blogText = blogText;
	this.title = title;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getImageLink() {
	return imageLink;
}

public void setImageLink(String imageLink) {
	this.imageLink = imageLink;
}

public String getBlogText() {
	return blogText;
}

public void setBlogText(String blogText) {
	this.blogText = blogText;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}



}
