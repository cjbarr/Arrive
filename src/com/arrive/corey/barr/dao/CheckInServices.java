package com.arrive.corey.barr.dao;

import java.util.List;

import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.exceptions.CustomException;
//This class contains the methods for interacting with checkIn data
public class CheckInServices extends AbstractDao implements CheckInI {

	
	//This adds a checkIn
	@Override
	public int addCheckIn(CheckIn checkIn) throws CustomException {
		int row = 0;
		try {
			connect();
			em.getTransaction().begin();
			em.persist(checkIn);
			em.getTransaction().commit();
			row = 1;
		} catch (Exception e) {
			throw new CustomException("Error in addCheckIn");
		} finally {
			dispose();
		}

		return row;
	}

	//This gets a checkin by id
	@Override
	public CheckIn getCheckInById(int id) throws CustomException {
		CheckIn result = null;

		try {
			connect();
			result = em.find(CheckIn.class, id);

		} catch (Exception e) {
			throw new CustomException("Error in dgetCheckInById");
		} finally {
			dispose();
		}
		return result;
	}

	
	//this uses an id to delete the corresponding checkIn
	@Override
	public CheckIn deleteCheckInById(int id) throws CustomException {
		CheckIn result = null;

		try {
			connect();
			result = em.find(CheckIn.class, id);
			em.getTransaction().begin();
			em.remove(result);
			em.getTransaction().commit();

		} catch (Exception e) {
			throw new CustomException("Error in deleteCheckInById");
		} finally {
			dispose();
		}
		return result;
	}

	//This grabs all checkins tied to the userId given
	@Override
	public List<CheckIn> getCheckInsByUserId(int idParam) {
		connect();
		List<CheckIn> employeeList = em
				.createQuery("SELECT e FROM CheckIn e WHERE e.userId=:userId ORDER BY e.id DESC", CheckIn.class)
				.setParameter("userId", idParam).getResultList();
		dispose();

		return employeeList;
	}

	//This updates a checkin by id with the sent checkin object values
	@Override
	public int updateCheckInById(Integer id, CheckIn checkIn) throws CustomException {
		try {
			connect();
			em.getTransaction().begin();
			CheckIn updateCheck = em.find(CheckIn.class, id);
			updateCheck.setFeelValue(checkIn.getFeelValue());
			updateCheck.setCheckInText(checkIn.getCheckInText());
			em.getTransaction().commit();

		} catch (Exception e) {
			throw new CustomException("Error in updateCheckInById");
		} finally {
			dispose();
		}

		return 0;
	}

}
