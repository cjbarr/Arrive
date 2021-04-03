package com.arrive.dao;

import java.util.List;

import com.arrive.entities.Blog;
import com.arrive.entities.Resource;




public class BlogResourceServices extends AbstractDao implements BlogResourceI {
	

	@Override
	public List<Blog> getAllBlogs() {
		connect();
		List<Blog> blogList = em.createQuery("SELECT e FROM Blog e",Blog.class).getResultList();
		dispose();
		
		return blogList;
	}

	@Override
	public List<Resource> getAllResources() {
		connect();
		List<Resource> resourceList = em.createQuery("SELECT e FROM Resource e",Resource.class).getResultList();
		dispose();
		return resourceList;
	}
	
	
}
