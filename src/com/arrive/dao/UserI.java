package com.arrive.dao;


import com.arrive.entities.User;



public interface UserI {

	public User getUserById(int id);

	public int validateUser(String email, String password);

	public int updatePixelPref(int id, User user);


	

}
