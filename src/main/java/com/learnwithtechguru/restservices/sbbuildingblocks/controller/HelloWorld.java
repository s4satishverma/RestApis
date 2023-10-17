package com.learnwithtechguru.restservices.sbbuildingblocks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	//simple method
	@RequestMapping(method=RequestMethod.GET, path = "/hello")
	public String getMessage() {
		return "Learn with tech Guru";
	}
	
	@GetMapping("/home")
	public String getMess() {
		return "Learn with tech Guru";
	}
	
	@GetMapping("/userdetails")
	public UserDetails getUserDetails() {
		return new UserDetails("Satish","Verma","Cambridge");
	}
	
	@PostMapping("/setUser")
	public String setUserDetails(@RequestBody UserDetails user) {
		System.out.println("FirstNAme is "+user.getFirstName());
		return "Name: "+user.getFirstName();
	}
	
}
