package com.infy.dto.app.entity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.app.entity.User;

@RestController
@RequestMapping("/api")
public class UserController
{

	@PostMapping(value = "/save")
	public ResponseEntity<User> postUser(@RequestBody User u) 
	{
		
		System.out.println(u);

		return new ResponseEntity<User>(HttpStatus.CREATED);

	}

}
