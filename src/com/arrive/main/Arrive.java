package com.arrive.main;

import com.arrive.dao.BlogServices;

public class Arrive {
	
	static BlogServices blogServices = new BlogServices();

	
	public static void main(String[] args) {
		
		System.out.println(blogServices.getAllBlogs());
		
		
	}


}
