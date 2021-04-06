package com.arrive.dao;


import com.arrive.entities.User;



public interface UserI {

	public User getUserById(int id);

	public int getUserByEmail(String email);


	

}
