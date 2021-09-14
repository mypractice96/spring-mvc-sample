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
	
	
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}
}
