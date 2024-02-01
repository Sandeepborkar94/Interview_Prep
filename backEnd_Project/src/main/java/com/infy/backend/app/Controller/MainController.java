package com.infy.backend.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.backend.app.entity.Customers;
import com.infy.backend.app.entity.Orders;
import com.infy.backend.app.services.ServiceInterface;

@RestController
public class MainController 
{
	@Autowired
	private ServiceInterface serviceInterface;
	
	@PostMapping("/saveProduct")
	public Orders saveProduct(@RequestBody Orders ord) 
	{
		Orders list = this.serviceInterface.saveOrder(ord);
		
		return list;
	}
	
	@PostMapping("saveCustomer")
	public Customers saveCustomer(@RequestBody Customers customers) 
	{
		
		Customers customers2 = this.serviceInterface.saveCust(customers);
		
		return customers2;
		
	}
}
