package com.arrive.dao;

import java.util.List;

import com.arrive.entities.Blog;
import com.arrive.entities.Resource;
import com.arrive.exceptions.CustomException;

public interface BlogResourceI {


		public List<Blog> getAllBlogs();	
		public List<Resource> getAllResources();
		public int addBlog(Blog blog) throws CustomException;

}
