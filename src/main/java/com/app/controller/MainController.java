package com.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",maxAge = 3600)
public class MainController {
	
	@RequestMapping("/")
	public String starter()
	{
		return "welcome to our api deployed using microsoft azure....";
	}
	@RequestMapping("/message")
	public String message()
	{
		return "thanks for visiting our webpage !!!";
	}
}
