package com.infy.backend.app.services;

import java.util.List;

import com.infy.backend.app.entity.Customers;
import com.infy.backend.app.entity.Orders;

public interface ServiceInterface 
{

	public Orders saveOrder(Orders ord);

	public Customers saveCust(Customers customers);

}
