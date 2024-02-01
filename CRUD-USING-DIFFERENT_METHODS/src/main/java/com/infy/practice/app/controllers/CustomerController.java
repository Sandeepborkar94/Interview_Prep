package com.infy.practice.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.practice.app.models.Customers;
import com.infy.practice.app.repository.CustomerRepo;

@RestController
public class CustomerController 
{
	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping(value = "/save")
	public Customers saveCustomer(@RequestBody Customers customers) 
	{
		return this.customerRepo.save(customers);	
	}
	
	@GetMapping(value = "/get")
	public List<Customers> getCustomers()
	{
		return this.customerRepo.findAll();
		
	}
	
}
