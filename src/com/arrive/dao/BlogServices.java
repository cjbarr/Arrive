package com.arrive.dao;

import java.util.List;

import com.arrive.entities.Blog;




public class BlogServices extends AbstractDao implements BlogI {
	

	@Override
	public List<Blog> getAllBlogs() {
		connect();
		List<Blog> employeeList = em.createQuery("SELECT e FROM Blog e",Blog.class).getResultList();
		dispose();
		
		return employeeList;
	}
	
	
}
