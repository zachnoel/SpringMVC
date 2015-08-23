package com.springmvc.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//returns home page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	//returns a static page
	@RequestMapping(value = "/page2", method = RequestMethod.GET)
	public String page2() {
		return "page2";
	}
	
	//returns a static page
	@RequestMapping(value = "/page3", method = RequestMethod.GET)
	public String page3() {
		return "page3";
	}
	
	
	
}
