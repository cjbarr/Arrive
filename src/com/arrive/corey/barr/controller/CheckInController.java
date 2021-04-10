package com.arrive.corey.barr.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

import com.arrive.corey.barr.dao.CheckInServices;
import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.exceptions.CustomException;

@Controller
@RequestMapping("/checkIn")
public class CheckInController {

	@RequestMapping(value = "/addCheckIn", method = RequestMethod.POST)
	public ModelAndView createCheckInPostHandler(HttpServletRequest request) throws CustomException {
		CheckIn checkIn = new CheckIn();
		checkIn.setFeelValue(request.getParameter("checkInValue"));
		checkIn.setCheckInText(request.getParameter("description"));
		LocalDate date = java.time.LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = date.format(myFormatObj);
		checkIn.setDate(formattedDate);
		checkIn.setUserId((int) request.getSession().getAttribute("loggedInUser"));
		CheckInServices checkInServices = new CheckInServices();
		checkInServices.addCheckIn(checkIn);
		return new ModelAndView("redirect:/tracker");

	}

	@RequestMapping(value = "/details/editCheckIn/edit", method = RequestMethod.POST)
	public ModelAndView createCheckInEditHandler(HttpServletRequest request)
			throws NumberFormatException, CustomException {
		CheckInServices checkInServices = new CheckInServices();
		CheckIn checkInToUpdate = new CheckIn();
		checkInToUpdate.setFeelValue(request.getParameter("checkInValue"));
		checkInToUpdate.setCheckInText(request.getParameter("description"));
		checkInServices.updateCheckInById(Integer.parseInt(request.getParameter("id")), checkInToUpdate);
		return new ModelAndView("redirect:/tracker");

	}

	@RequestMapping(value = "/details/deleteCheckIn/{checkInId}", method = RequestMethod.POST)
	public ModelAndView createCheckInDeleteHandler(@PathVariable int checkInId) throws CustomException {
		CheckInServices checkInServices = new CheckInServices();
		checkInServices.deleteCheckInById(checkInId);
		return new ModelAndView("redirect:/tracker");

	}

	@RequestMapping(value = "/details/editCheckIn/{checkInId}", method = RequestMethod.GET)
	public ModelAndView createCheckInEditHandler(@PathVariable int checkInId) throws CustomException {
		CheckInServices checkInServices = new CheckInServices();
		CheckIn checkIn = checkInServices.getCheckInById(checkInId);
		ModelAndView mav = new ModelAndView("editCheckIn", "model", checkIn);
		System.out.println(checkIn.getFeelValue());
		return mav;

	}

	@RequestMapping(value = "/details/{checkInId}", method = RequestMethod.GET)
	public ModelAndView createCheckInGetHandler(@PathVariable int checkInId) throws CustomException {
		CheckInServices checkInServices = new CheckInServices();
		CheckIn checkIn = checkInServices.getCheckInById(checkInId);
		ModelAndView mav = new ModelAndView("details", "model", checkIn);
		return mav;

	}

}
