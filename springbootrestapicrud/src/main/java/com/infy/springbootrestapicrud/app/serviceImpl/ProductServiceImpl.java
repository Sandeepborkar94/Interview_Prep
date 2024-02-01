package com.infy.springbootrestapicrud.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrud.app.exception.ProductNotFoundException;
import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.repository.ProductRepository;
import com.infy.springbootrestapicrud.app.serviceI.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI {

	@Autowired
	ProductRepository pr;
	
	@Override
	public Product saveProduct(Product p) 
	{	
		return pr.save(p);
	}
	@Override
	public List<Product> getProducts()
	{
		
		return pr.findAll();
	}
	@Override
	public void deleteProduct(Integer productId)
	{
		pr.deleteById(productId);
	}
	@Override
	public Product updateProduct(Product p, Integer productId) 
	{
		Optional<Product> op=pr.findById(productId);
		if(op.isPresent()) 
		{
			Product product = op.get();
			product.setProductName(p.getProductName());
			product.setProductDescription(p.getProductDescription());
			product.setProductPrice(p.getProductPrice());
			
			return pr.save(product);		
		}
//		System.out.println("Product Not Available");
		throw new ProductNotFoundException("Product Not Found Exception");

	}
	@Override
	public Product getProduct(String productName) 
	{
		Product p = pr.findByProductName(productName);
		if(p!=null)
		{
			return p;
		}else 
		{
			throw new ProductNotFoundException("Product Name Not Found Exception");
		}
		
	}
}
