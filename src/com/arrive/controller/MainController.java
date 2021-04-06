package com.arrive.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.arrive.dao.BlogResourceServices;
import com.arrive.dao.CheckInServices;
import com.arrive.dao.UserServices;
import com.arrive.entities.Blog;
import com.arrive.entities.CheckIn;
import com.arrive.entities.Resource;
import com.arrive.entities.User;



@Controller
@RequestMapping("/")
@SessionAttributes("loggedUser")
public class MainController {
	
	static BlogResourceServices blogResourceServices = new BlogResourceServices();
	static CheckInServices checkInServices = new CheckInServices();
	static UserServices userServices = new UserServices();
	//handlers
	
	@RequestMapping(value={"/", "/index"})  // "/" ==> this is the root or home page
	public ModelAndView indexHandler() {
		
		List<Blog> blogList = blogResourceServices.getAllBlogs();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("blog", blogList);
		ModelAndView mav = new ModelAndView("index", "model",model);
		return mav; // view file name index.jsp
	}


	@RequestMapping("/checkIn")  // this is from href value
	public ModelAndView checkInHandler() {
		ModelAndView mav = new ModelAndView("checkIn");
		return mav; // view file name checkIn.jsp
	}
	
	@RequestMapping("/details")  // this is from href value
	public ModelAndView detailsHandler() {
		ModelAndView mav = new ModelAndView("details");
		return mav; // view file name details.jsp
	}
	
	@RequestMapping("/profile")  // this is from href value
	public ModelAndView profileHandler(HttpServletRequest request) {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user =userServices.getUserById(loggedUser);
		
		ModelAndView mav = new ModelAndView("profile", "model", user);
		return mav; // view file name profile.jsp
	}
	
	@RequestMapping("/resources")  // this is from href value
	public ModelAndView resourcesHandler() {
		List<Resource> resourceList = blogResourceServices.getAllResources();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("resource", resourceList);
		ModelAndView mav = new ModelAndView("resources", "model", model);
		return mav; // view file name resources.jsp
	}
	
	@RequestMapping("/tracker")  // this is from href value
	public ModelAndView trackerHandler(HttpServletRequest request) {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		List<CheckIn> checkInList = checkInServices.getCheckInsByUserId(loggedUser);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("checkIn", checkInList);
		ModelAndView mav = new ModelAndView("tracker", "model", model);
		return mav; // view file name tracker.jsp
	}
	
	@RequestMapping("/logOut")  // this is from href value
	public String logOutHandler(HttpServletRequest request) {
	  request.getSession().setAttribute("loggedInUser", 0);
		return "redirect:/index"; // view file name profile.jsp
	}
//	
	@RequestMapping("/logIn")  // this is from href value
	public String logInHandler(HttpServletRequest request) {
		request.getSession().setAttribute("loggedInUser", 1);
	
		return "redirect:/tracker"; // view file name profile.jsp
	}
//	
//	
	
	}
	


	
	
	

