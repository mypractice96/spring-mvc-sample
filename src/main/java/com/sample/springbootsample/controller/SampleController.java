package com.sample.springbootsample.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {


	
	@RequestMapping(value = {"","/","/home"})
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
}
