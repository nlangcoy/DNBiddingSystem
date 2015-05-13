package com.fpt.biddingsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = "/sign_up", method =RequestMethod.GET)
	public ModelAndView sign_up() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("sign_up");
		return model;
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView profile() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("profile");
		return model;
	}
	
	@RequestMapping(value = "/biditemlist", method = RequestMethod.GET)
	public ModelAndView biditemlist() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("biditemlist");
		return model;
	}
	
	@RequestMapping(value = "/pop_up", method = RequestMethod.POST)
	public ModelAndView pop_up() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("pop_up");
		//System.out.println(RequestMethod.valueOf("firstname"));
		return model;
	}
	
	@RequestMapping(value = "/biditem", method = RequestMethod.GET)
	public ModelAndView biditem() {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("biditem");
		//System.out.println(RequestMethod.valueOf("firstname"));
		return model;
	}
	
}
