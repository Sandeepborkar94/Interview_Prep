package com.infy.springbootrestapicrud.app.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerAPI
{
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/hello")
	public String sayHello() 
	{
		return "Hello Boys";
	}
	
	@GetMapping(value = "/getApi")
	public String consumApi() 
	{
		
		String uri = "http://localhost:9090/hello";
		
		String result = restTemplate.getForObject(uri, String.class);
		
		String[] s = result.split(" ");
		
		String rev = " ";
		
		for (int i = 0; i < s.length; i++) 
		{
			rev = rev+" "+s[i];
		}
		
		
		return rev;	
	}

}
