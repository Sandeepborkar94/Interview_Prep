package com.infy.dto.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.app.Model.Product;
import com.infy.dto.app.repository.ProductRepository;
import com.infy.dto.app.serviceI.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI
{

	@Autowired
	ProductRepository pr;
	
	@Override
	public Product saveProduct(Product p) {
		
		return pr.save(p);
	}

	@Override
	public Product getProductByName(String pname) {
		
		return pr.findByPname(pname);
	}

	@Override
	public List<Product> getProducts() 
	{
		return pr.findAll();
	}

}
