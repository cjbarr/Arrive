package com.arrive.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.arrive.dao.BlogResourceServices;
import com.arrive.dao.CheckInServices;
import com.arrive.entities.Blog;
import com.arrive.entities.CheckIn;
import com.arrive.entities.Resource;



@Controller
@RequestMapping("/")
public class MainController {
	
	static BlogResourceServices blogResourceServices = new BlogResourceServices();
	static CheckInServices checkInServices = new CheckInServices();
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
	public ModelAndView profileHandler() {
		ModelAndView mav = new ModelAndView("profile");
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
	public ModelAndView trackerHandler() {
		List<CheckIn> checkInList = checkInServices.getAllCheckIns();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("checkIn", checkInList);
		ModelAndView mav = new ModelAndView("tracker", "model", model);
		return mav; // view file name tracker.jsp
	}
	

	}
	


	
	
	

