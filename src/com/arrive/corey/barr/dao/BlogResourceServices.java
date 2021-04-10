package com.arrive.corey.barr.dao;

import java.util.List;

import com.arrive.corey.barr.entities.Blog;
import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.entities.Resource;
import com.arrive.corey.barr.exceptions.CustomException;

//The BlogResouceServices class contains all of the methods for interacting with the blog and resource data
public class BlogResourceServices extends AbstractDao implements BlogResourceI {

//This gets all blogs
	@Override
	public List<Blog> getAllBlogs() {
		connect();
		List<Blog> blogList = em.createQuery("SELECT e FROM Blog e ORDER BY e.id DESC", Blog.class).getResultList();
		dispose();

		return blogList;
	}
//This gets all resources
	@Override
	public List<Resource> getAllResources() {
		connect();
		List<Resource> resourceList = em.createQuery("SELECT e FROM Resource e", Resource.class).getResultList();
		dispose();
		return resourceList;
	}

//This adds a blog to the blog table
	@Override
	public int addBlog(Blog blog) throws CustomException {
		int row = 0;
		try {
			connect();
			em.getTransaction().begin();
			em.persist(blog);
			em.getTransaction().commit();
			row = 1;
		} catch (Exception e) {
			throw new CustomException("Error in addBlog");

		} finally {
			dispose();
		}

		return row;
	}

}
