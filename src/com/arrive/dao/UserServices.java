package com.arrive.dao;




import com.arrive.entities.CheckIn;
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
	
	
	
	

	@Override
	public int validateUser(String email, String password) {
		int gotUser = 0;
		try {
			connect();
		
			gotUser = (int) em.createQuery("SELECT e.id FROM User e WHERE e.email=:email AND e.password=:password").setParameter("email", email).setParameter("password", password).getSingleResult();

			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		return gotUser;
	}
	

	@Override
	public int updatePixelPref(int id, User user) {
		try {
			connect();
			em.getTransaction().begin();
			User updateUser = em.find(User.class, id);
			updateUser.setPixelPref(user.getPixelPref());
			em.getTransaction().commit();

		}catch(Exception e) {

		} finally {
			dispose();			
		}

		return 0;
	}
	}
	

