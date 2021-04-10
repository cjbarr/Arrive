package com.arrive.corey.barr.dao;

import java.util.List;

import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.exceptions.CustomException;

public interface CheckInI {

	public int addCheckIn(CheckIn checkIn) throws CustomException;

	public List<CheckIn> getCheckInsByUserId(int id);

	public CheckIn getCheckInById(int id) throws CustomException;

	public CheckIn deleteCheckInById(int id) throws CustomException;

	public int updateCheckInById(Integer id, CheckIn checkIn) throws CustomException;

}
