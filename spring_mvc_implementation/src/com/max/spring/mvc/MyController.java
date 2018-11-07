package com.max.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // parent mapping , so all other requestMappings in this class will be relative
							// to this one (to avoid collision), when we add it we must modify also in
							// "main-menu"
public class MyController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form"; // to go to the hello hello-form jsp
	}

	// need a controller method to process the HTML form

	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}

	// new a controller method to read form data and
	// add data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {

		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hey! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "hello"; // to go to the hello jsp
	}

	@RequestMapping("/processFormVersionThree") // another way but using requestParams 
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hola Amigos V3! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "hello"; // to go to the hello jsp
	}
}
