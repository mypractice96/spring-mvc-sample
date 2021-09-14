package com.sample.springbootsample.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {


	
	@RequestMapping(path = {"","/","/home"},method=RequestMethod.GET)
	public String showHomePage(ModelMap model) {
				
		try {
			model.addAttribute("hostAddress", InetAddress.getLocalHost().getHostAddress());
			model.addAttribute("hostName", InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
            System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping(value = "/kill")
	public void showHomePage() {
		System.exit(0);
	}
	
	
	
	/* Unit Testing Example */
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}
	
	
	
	/* Integration Testing Example */
	
	public String registerUser(String username, String password, String email,String mobile){		
		addDetailsToDB(username,password,email,mobile);
		sendWelcomeMail(email);
		sendWelcomeMessage(mobile);		
		return "Success";
	}
	
	
	void addDetailsToDB(String username, String password, String email, String mobile){
		//Code : Add the userdetails to database
		System.out.println("Added "+username+"'s details to database");
	}
	
	void sendWelcomeMail(String email){
		// Code : Use SMTP server and send email
		System.out.println("Welcome mail sent to "+email);
	}
	
	void sendWelcomeMessage(String mobile){
		// Code : Use SMS gateway and send welcome message
		System.out.println("Welcome message sent to "+mobile);
	}
}
