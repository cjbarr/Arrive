package com.arrive.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.arrive.dao.CheckInServices;
import com.arrive.entities.CheckIn;



@Controller
@RequestMapping("/checkIn")
public class CheckInController {

	@RequestMapping(value="/addCheckIn", method=RequestMethod.POST)
	public ModelAndView createCheckInPostHandler(HttpServletRequest request) {
		System.out.println("THIS IS THE POST HANDLER");

		


		

		
		CheckIn checkIn = new CheckIn();
		checkIn.setFeelValue(request.getParameter("checkInValue"));
		checkIn.setCheckInText(request.getParameter("description"));
		checkIn.setDate(request.getParameter("checkInDate"));
		
		
	
		System.out.println(checkIn);
		
		
		
		CheckInServices checkInServices = new CheckInServices();
		checkInServices.addCheckIn(checkIn);
		return new ModelAndView("redirect:/tracker");
		
		
	
	
	
	
		
	}
	
	
	@RequestMapping(value="/details/{checkInId}", method=RequestMethod.GET)
	public ModelAndView createCheckInGetHandler(@PathVariable int checkInId) {
		System.out.println("THIS IS THE GET HANDLER");
		
		
		CheckInServices checkInServices = new CheckInServices();
		CheckIn checkIn =checkInServices.getCheckInById(checkInId);
		ModelAndView mav = new ModelAndView("details", "model",checkIn);
		System.out.println(checkIn.getFeelValue());
		return mav;
		
		
	
	
	
	
		
	}
	
	
}
