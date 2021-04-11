package com.arrive.corey.barr.dao;

import com.arrive.corey.barr.entities.User;
import com.arrive.corey.barr.exceptions.CustomException;

//This class contains the methods for interacting with the user data
public class UserServices extends AbstractDao implements UserI {

	// this gets a user by id
	@Override
	public User getUserById(int id) throws CustomException {
		User result = null;

		try {
			connect();
			result = em.find(User.class, id);

		} catch (Exception e) {
			throw new CustomException("Error in getUserById");
		} finally {
			dispose();
		}
		return result;
	}

	// this takes in an email and password in order to make sure they exist in the
	// db and log into the app
	@Override
	public int validateUser(String email, String password) throws CustomException {
		int gotUser = 0;
		try {
			connect();

			gotUser = (int) em.createQuery("SELECT e.id FROM User e WHERE e.email=:email AND e.password=:password")
					.setParameter("email", email).setParameter("password", password).getSingleResult();

		} catch (Exception e) {
			throw new CustomException("Error in validateUser");
		} finally {
			dispose();
		}
		return gotUser;
	}

	// this updates the users pixel display preference on the tracker page
	@Override
	public int updatePixelPref(int id, User user) throws CustomException {
		try {
			connect();
			em.getTransaction().begin();
			User updateUser = em.find(User.class, id);
			updateUser.setPixelPref(user.getPixelPref());
			em.getTransaction().commit();

		} catch (Exception e) {
			throw new CustomException("Error in updatePixelPref");
		} finally {
			dispose();
		}

		return 0;
	}
}
