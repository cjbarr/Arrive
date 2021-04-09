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
import com.arrive.exceptions.CustomException;



@Controller
@RequestMapping("/")
@SessionAttributes("loggedUser")
public class MainController {
	
	static BlogResourceServices blogResourceServices = new BlogResourceServices();
	static CheckInServices checkInServices = new CheckInServices();
	static UserServices userServices = new UserServices();
	//handlers
	
	
	@RequestMapping("/")  // this is from href value
	public ModelAndView landingHandler() {
		ModelAndView mav = new ModelAndView("landingPage");
		return mav; // view file name details.jsp
	}
	
	
	@RequestMapping("/blogPost")  // "/" ==> this is the root or home page
	public String blogPostHandler(HttpServletRequest request) throws CustomException {
		Blog newBlog = new Blog();
		newBlog.setBlogText(request.getParameter("blogText"));
		newBlog.setImageLink(request.getParameter("bPicUrl"));
		newBlog.setTitle(request.getParameter("blogTitle"));
		blogResourceServices.addBlog(newBlog);
		

		return "redirect:/index"; // view file name index.jsp
	}

	
	
	
	
	@RequestMapping(value={"/index"})  // "/" ==> this is the root or home page
	public ModelAndView indexHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user =userServices.getUserById(loggedUser);
		List<Blog> blogList = blogResourceServices.getAllBlogs();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("blog", blogList);
		model.put("user", user);
		ModelAndView mav = new ModelAndView("index", "model",model);
		return mav; // view file name index.jsp
	}


	@RequestMapping("/checkIn")  // this is from href value
	public ModelAndView checkInHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user =userServices.getUserById(loggedUser);
		ModelAndView mav = new ModelAndView("checkIn", "model", user);
		return mav; // view file name checkIn.jsp
	}
	
	@RequestMapping("/details")  // this is from href value
	public ModelAndView detailsHandler() {
		ModelAndView mav = new ModelAndView("details");
		return mav; // view file name details.jsp
	}
	
	@RequestMapping("/pixelUpdate")
	public String pixelUpdateHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user  =userServices.getUserById(loggedUser);
		user.setPixelPref(request.getParameter("pixel"));
		userServices.updatePixelPref(loggedUser, user);
		return "redirect:/tracker";
	}
	
	
	@RequestMapping("/profile")  // this is from href value
	public ModelAndView profileHandler(HttpServletRequest request) throws CustomException {
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
	public ModelAndView trackerHandler(HttpServletRequest request) throws CustomException {
		int loggedUser = (int) request.getSession().getAttribute("loggedInUser");
		User user = userServices.getUserById(loggedUser);
		List<CheckIn> checkInList = checkInServices.getCheckInsByUserId(loggedUser);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("checkIn", checkInList);
		model.put("user", user);
		ModelAndView mav = new ModelAndView("tracker", "model", model);
		return mav; // view file name tracker.jsp
	}
	
	@RequestMapping("/logOut")  // this is from href value
	public String logOutHandler(HttpServletRequest request) {
	  request.getSession().setAttribute("loggedInUser", 0);
		return "redirect:/"; // view file name profile.jsp
	}
//	
	

	@RequestMapping("/logInAttempt")  // this is from href value
	public String logInAttempt(HttpServletRequest request) throws CustomException {
		int userId = userServices.validateUser(request.getParameter("email"),request.getParameter("password"));
		request.getSession().setAttribute("loggedInUser", userId);
	if(userId !=0) {
		return "redirect:/index"; // view file name profile.jsp
	}
	else {
		return "redirect:/";
	}
//	
//	
	
	}
	
}
	


	
	
	

