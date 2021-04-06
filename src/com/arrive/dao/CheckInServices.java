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
				System.out.println("WHY");
				e.printStackTrace();
				row =0;
			} finally {
				dispose();			
			}

			return row;
		}


		@Override
		public CheckIn getCheckInById(int id) {
			CheckIn result = null;

			try {
				connect();
				result = em.find(CheckIn.class, id);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dispose();
			}
			return result;
		}
		
		
		
		@Override
		public CheckIn deleteCheckInById(int id) {
			CheckIn result = null;

			try {
				connect();
				result = em.find(CheckIn.class, id);
				em.getTransaction().begin();
				em.remove(result);
				em.getTransaction().commit();
				

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dispose();
			}
			return result;
		}
		
		
		
		

		@Override
		public List<CheckIn> getCheckInsByUserId(int idParam) {
			connect();
			List<CheckIn> employeeList = em.createQuery("SELECT e FROM CheckIn e WHERE e.userId=:userId ORDER BY e.id DESC",CheckIn.class).setParameter("userId", idParam).getResultList();
			dispose();
			
			return employeeList;
		}
		
		
		

		@Override
		public int updateCheckInById(Integer id, CheckIn checkIn) {
			try {
				connect();
				em.getTransaction().begin();
				CheckIn updateCheck = em.find(CheckIn.class, id);
				updateCheck.setFeelValue(checkIn.getFeelValue());
				updateCheck.setCheckInText(checkIn.getCheckInText());
				em.getTransaction().commit();

			}catch(Exception e) {

			} finally {
				dispose();			
			}

			return 0;
		}

	}


