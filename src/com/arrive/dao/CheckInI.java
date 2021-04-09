package com.arrive.dao;

import java.util.List;

import com.arrive.entities.CheckIn;
import com.arrive.exceptions.CustomException;


public interface CheckInI {

	public int addCheckIn(CheckIn checkIn) throws CustomException;
	public List<CheckIn> getCheckInsByUserId(int id);
	public CheckIn getCheckInById(int id) throws CustomException;
	public CheckIn deleteCheckInById(int id) throws CustomException;
	public int updateCheckInById(Integer id, CheckIn checkIn) throws CustomException;		
		


}
