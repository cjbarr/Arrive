package com.arrive.dao;


import com.arrive.entities.User;
import com.arrive.exceptions.CustomException;



public interface UserI {

	public User getUserById(int id) throws CustomException;

	public int validateUser(String email, String password) throws CustomException;

	public int updatePixelPref(int id, User user) throws CustomException;


	

}
