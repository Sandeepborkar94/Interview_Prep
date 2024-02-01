package com.infy.springbootrestapicrud.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.repository.ProductRepository;
import com.infy.springbootrestapicrud.app.serviceI.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI 
{
	@Autowired
	ProductRepository pr;

	@Override
	public Product saveProduct(Product p) 
	{
		return pr.save(p);
	}

	@Override
	public List<Product> getProduct()
	{
		List<Product> list = pr.findAll();
		return list;
	}

	@Override
	public Product saveDoc(Product product1)
	{
		Product product = pr.save(product1);
		return product;
	}

	@Override
	public Product getProductByName( String pname) 
	{
		System.out.println("In controller");
		return pr.findByPname(pname);
	}

}
