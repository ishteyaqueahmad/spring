package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//Controller level request mapping
@RequestMapping("/hello")
public class HelloWorldController {
	
	//neead a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//neead a controller method to process the  HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest req, Model model) {
		
		//read the request parameter from the HTML form
		String theName=req.getParameter("studentName");
		
		//convert the data to all caps
		theName=theName.toUpperCase();
		
		//create message
		String result="YO "+theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeThree(@RequestParam("studentName") String theName, Model model) {
		//theName = req.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey my friend from v3 " + theName;
		
		//add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
