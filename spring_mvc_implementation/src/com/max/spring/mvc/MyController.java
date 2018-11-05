package com.max.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}
	
	
	// need a controller method to process the HTML form

	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
}
