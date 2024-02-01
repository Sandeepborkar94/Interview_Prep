package com.infy.springbootrestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.Supplier;
import com.infy.springbootrestapicrud.app.serviceI.SupplierServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class SupplierController
{
	@Autowired
	SupplierServiceI ssi;
	
//	post supplier Data
	
	@PostMapping(value = "/supplier")
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier s) 
	{
		Supplier supplier = ssi.saveSupplier(s);
		return new ResponseEntity<Supplier>(supplier,HttpStatus.CREATED);	
	}
	
//	get supplier data
	@GetMapping(value = "/supplier")
	public ResponseEntity<List<Supplier>> getSupplier()
	{
		List<Supplier> list = ssi.getSupplier();
		if(list.isEmpty()) 
		{
			return new ResponseEntity<List<Supplier>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Supplier>>(list,HttpStatus.OK);
	}

}
