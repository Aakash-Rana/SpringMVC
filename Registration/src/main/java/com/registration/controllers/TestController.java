package com.registration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	@ResponseBody
	@RequestMapping("/test")
	public String hello()
	{
		System.out.println("Herer i am");
		return "Or bhai !!!!";
	}
	

	@RequestMapping("/testing")
	public String hello2()
	{
		System.out.println("Herer i am on 2 page");
		return "hello-world";
	}
}
