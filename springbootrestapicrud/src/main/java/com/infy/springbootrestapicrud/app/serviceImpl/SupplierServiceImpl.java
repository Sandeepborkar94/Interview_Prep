package com.infy.springbootrestapicrud.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrud.app.model.Supplier;
import com.infy.springbootrestapicrud.app.repository.SupplierRepository;
import com.infy.springbootrestapicrud.app.serviceI.SupplierServiceI;
@Service
public class SupplierServiceImpl implements SupplierServiceI {

	@Autowired
	SupplierRepository spr;
	
	@Override
	public Supplier saveSupplier(Supplier s) 
	{
		return spr.save(s);
	}

	@Override
	public List<Supplier> getSupplier()
	{
		return spr.findAll();
	}

	@Override
	public List<Supplier> getsupplier()
	{
		return spr.findAll();
	}

}
