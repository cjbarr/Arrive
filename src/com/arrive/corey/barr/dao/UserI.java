package com.arrive.corey.barr.dao;

import com.arrive.corey.barr.entities.User;
import com.arrive.corey.barr.exceptions.CustomException;


////This is the User Interface, used for implementing the User Methods
public interface UserI {

	public User getUserById(int id) throws CustomException;

	public int validateUser(String email, String password) throws CustomException;

	public int updatePixelPref(int id, User user) throws CustomException;

}
