package com.arrive.corey.barr.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arrive.corey.barr.dao.BlogResourceServices;
import com.arrive.corey.barr.dao.CheckInServices;
import com.arrive.corey.barr.dao.UserServices;
import com.arrive.corey.barr.entities.Blog;
import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.entities.Resource;
import com.arrive.corey.barr.exceptions.CustomException;



class TestService {
	BlogResourceServices bRS = new BlogResourceServices();
	CheckInServices cIS = new CheckInServices();
	UserServices uS = new UserServices();
	
	@Test
	public void testGetAllResources() {
		List<Resource> actualResult  = bRS.getAllResources();
		int actualResultSize = actualResult.size();
		int expectedResultSize = 4;
		assertEquals(expectedResultSize, actualResultSize);
		
		
	}
	
	
	@Test
	public void testGetAllBlogs() {
		List<Blog> actualResult  = bRS.getAllBlogs();
		int actualResultSize = actualResult.size();
		int expectedResultSize = 4;
		assertEquals(expectedResultSize, actualResultSize);
		
		
	}
	
	@Test
	public void testAddBlog() throws CustomException {
		Blog testBlog = new Blog();
		int actualResult  = bRS.addBlog(testBlog);
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
		
		
	}
	
	
	@Test
	public void testGetCheckInById() throws CustomException {

		CheckIn testCheckIn  = cIS.getCheckInById(5);
		String actualResult = testCheckIn.getFeelValue();
		String expectedResult = "Okay";
		assertEquals(expectedResult, actualResult);
		
		
	}
	
	@Test
	public void testGetCheckInsByUserId() throws CustomException {

		List<CheckIn> actualResultList  = cIS.getCheckInsByUserId(2);
		int actualResult = actualResultList.size();
		int expectedResult = 2;
		assertEquals(expectedResult, actualResult);
		
		
	}
	@Test
	public void testValidateUser() throws CustomException {

		int actualResult = uS.validateUser("admin@arrive.com", "admin");
		int expectedResult = 2;
		assertEquals(expectedResult, actualResult);
		
		
	}

	

}
