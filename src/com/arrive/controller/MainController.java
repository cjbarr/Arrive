package com.arrive.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.arrive.dao.BlogServices;
import com.arrive.entities.Blog;



@Controller
@RequestMapping("/")
@SessionAttributes("employeeKey")
public class MainController {
	
	static BlogServices blogServices = new BlogServices();
	//handlers
	
	@RequestMapping(value={"/", "/index"})  // "/" ==> this is the root or home page
	public ModelAndView indexHandler() {
		
		List<Blog> blogList = blogServices.getAllBlogs();
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
		ModelAndView mav = new ModelAndView("resources");
		return mav; // view file name resources.jsp
	}
	
	@RequestMapping("/tracker")  // this is from href value
	public ModelAndView trackerHandler() {
		ModelAndView mav = new ModelAndView("tracker");
		return mav; // view file name tracker.jsp
	}
	

	}
	


	
	
	

