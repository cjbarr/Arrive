package com.arrive.dao;


import com.arrive.entities.User;




public class UserServices extends AbstractDao implements UserI {
	
	@Override
	public User getUserById(int id) {
		User result = null;

		try {
			connect();
			result = em.find(User.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		return result;
	}
	
}
