package com.arrive.corey.barr.dao;

import java.util.List;

import com.arrive.corey.barr.entities.Blog;
import com.arrive.corey.barr.entities.Resource;
import com.arrive.corey.barr.exceptions.CustomException;

public interface BlogResourceI {

	public List<Blog> getAllBlogs();

	public List<Resource> getAllResources();

	public int addBlog(Blog blog) throws CustomException;

}
