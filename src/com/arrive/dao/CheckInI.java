package com.arrive.dao;

import java.util.List;

import com.arrive.entities.CheckIn;


public interface CheckInI {

	public int addCheckIn(CheckIn checkIn);
	public List<CheckIn> getAllCheckIns();
	public CheckIn getCheckInById(int id);
	public CheckIn deleteCheckInById(int id);
	public int updateCheckInById(Integer id, CheckIn checkIn);		
		


}
