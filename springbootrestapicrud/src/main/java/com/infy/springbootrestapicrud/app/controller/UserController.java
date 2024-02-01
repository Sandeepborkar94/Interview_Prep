package com.infy.springbootrestapicrud.app.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.User;

@RestController
public class UserController 
{
	@PostMapping(value = "/save")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User u)
	{
		System.out.println("saveUser() calls"+u);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
}
