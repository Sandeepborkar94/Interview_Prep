package com.infy.backend.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.backend.app.entity.Customers;
import com.infy.backend.app.entity.Orders;

@org.springframework.stereotype.Service
public class ServiceImpl implements ServiceInterface
{

	@Autowired
	private Repository repository;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Override
	public Orders saveOrder(Orders ord) 
	{
		
		return this.repository.save(ord);
	}

	@Override
	public Customers saveCust(Customers cust)
	{	
		Customers customers = customerRepo.save(cust);
		
		return customers;
	}
	

}
