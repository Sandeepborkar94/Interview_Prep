package com.infy.springbootrestapicrud.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlller 
{
	@GetMapping(value = "/")
	public String helloWorld() 
	{
		return "Sandeep Borkar";		
	}

}
