package com.arrive.dao;

import java.util.List;

import com.arrive.entities.Blog;
import com.arrive.entities.CheckIn;
import com.arrive.entities.Resource;
import com.arrive.exceptions.CustomException;




public class BlogResourceServices extends AbstractDao implements BlogResourceI {
	

	@Override
	public List<Blog> getAllBlogs() {
		connect();
		List<Blog> blogList = em.createQuery("SELECT e FROM Blog e ORDER BY e.id DESC",Blog.class).getResultList();
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
	
	
	
	@Override
	public int addBlog(Blog blog) throws CustomException {
		int row = 0;	
		//1. connect ==> create entityManagerFactory & entityManager
		//2. execute
		//3. close
		try {
			connect();
			em.getTransaction().begin();
			em.persist(blog);
			em.getTransaction().commit();
			row = 1;
		}catch(Exception e) {
			throw new CustomException("Error in addBlog");

		} finally {
			dispose();			
		}

		return row;
	}

	
}
