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
	
	
	
	

	@Override
	public int getUserByEmail(String email) {
		int gotUser = 0;
		try {
			connect();
		
			gotUser = (int) em.createQuery("SELECT e.id FROM User e WHERE e.email=:email").setParameter("email", email).getSingleResult();

			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}
		return gotUser;
	}
	
	
}
