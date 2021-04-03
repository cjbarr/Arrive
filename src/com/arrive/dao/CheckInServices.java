package com.arrive.dao;

import java.util.List;

import com.arrive.entities.CheckIn;

public class CheckInServices extends AbstractDao implements CheckInI {

	

		@Override
		public int addCheckIn(CheckIn checkIn) {
			int row = 0;

			//1. connect ==> create entityManagerFactory & entityManager
			//2. execute
			//3. close
			try {
				connect();
				em.getTransaction().begin();
				em.persist(checkIn);
				em.getTransaction().commit();
				row = 1;
			}catch(Exception e) {
				row =0;
			} finally {
				dispose();			
			}

			return row;
		}



		@Override
		public List<CheckIn> getAllCheckIns() {
			connect();
			List<CheckIn> employeeList = em.createQuery("SELECT e FROM CheckIn e",CheckIn.class).getResultList();
			dispose();
			
			return employeeList;
		}

	}


