package com.arrive.corey.barr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.arrive.corey.barr.dao.BlogResourceServices;
import com.arrive.corey.barr.dao.CheckInServices;
import com.arrive.corey.barr.dao.UserServices;
import com.arrive.corey.barr.entities.Blog;
import com.arrive.corey.barr.entities.CheckIn;
import com.arrive.corey.barr.entities.Resource;
import com.arrive.corey.barr.entities.User;
import com.arrive.corey.barr.exceptions.CustomException;



//This is the main controller. It handles all mapping with the exception of the check in CRUD
//Check in Crud is handled in the checkIn Controller

@Controller
@RequestMapping("/")
@SessionAttributes("loggedUser")
public class MainController {

	static BlogResourceServices blogResourceServices = new BlogResourceServices();
	static CheckInServices checkInServices = new CheckInServices();
	static UserServices userServices = new UserServices();
	// handlers

	@RequestMapping("/") 
	public ModelAndView landingHandler() {
		ModelAndView mav = new ModelAndView("landingPage");
		return mav; 
	}

	@RequestMapping("/blogPost") // "/" ==> this is the root or home page
	public String blogPostHandler(HttpServletRequest request) throws CustomException {
		Blog newBlog = new Blog();
		newBlog.setBlogText(request.getParameter("blogText"));
		newBlog.setImageLink(request.getParameter("bPicUrl"));
		newBlog.setTitle(request.getParameter("blogTitle"));
		blogResourceServices.addBlog(newBlog);

		return "redirect:/index"; 
	}

	@RequestMapping(value = { "/index" })
	public ModelAndView indexHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);
		List<Blog> blogList = blogResourceServices.getAllBlogs();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("blog", blogList);
		model.put("user", user);
		ModelAndView mav = new ModelAndView("index", "model", model);
		return mav; 
	}

	@RequestMapping("/checkIn")
	public ModelAndView checkInHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);
		ModelAndView mav = new ModelAndView("checkIn", "model", user);
		return mav; // view file name checkIn.jsp
	}

	@RequestMapping("/details") 
	public ModelAndView detailsHandler() {
		ModelAndView mav = new ModelAndView("details");
		return mav; 
	}

	@RequestMapping("/pixelUpdate")
	public String pixelUpdateHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);
		user.setPixelPref(request.getParameter("pixel"));
		userServices.updatePixelPref(loggedUser, user);
		return "redirect:/tracker";
	}

	@RequestMapping("/profile") 
	public ModelAndView profileHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);

		ModelAndView mav = new ModelAndView("profile", "model", user);
		return mav;
	}

	@RequestMapping("/resources")
	public ModelAndView resourcesHandler() {
		List<Resource> resourceList = blogResourceServices.getAllResources();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("resource", resourceList);
		ModelAndView mav = new ModelAndView("resources", "model", model);
		return mav; 
	}

	@RequestMapping("/tracker") 
	public ModelAndView trackerHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);
		List<CheckIn> checkInList = checkInServices.getCheckInsByUserId(loggedUser);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("checkIn", checkInList);
		model.put("user", user);
		ModelAndView mav = new ModelAndView("tracker", "model", model);
		return mav;
	}

	@RequestMapping("/logOut") 
	public String logOutHandler(HttpServletRequest request) {
		request.getSession().setAttribute("loggedInUser", 0);
		return "redirect:/"; 
	}

	@RequestMapping("/logInAttempt") 
	public String logInAttempt(HttpServletRequest request) throws CustomException {
		int userId = userServices.validateUser(request.getParameter("email"), request.getParameter("password"));
		request.getSession().setAttribute("loggedInUser", userId);
		if (userId != 0) {
			return "redirect:/index"; 
		} else {
			return "redirect:/";
		}
	}

}
