package com.infy.springbootrestapicrud.app.serviceI;

import java.util.List;

import com.infy.springbootrestapicrud.app.model.Product;

public interface ProductServiceI
{
	public Product saveProduct(Product p);

	public List<Product> getProduct();

	public Product saveDoc(Product product1);

	public Product getProductByName(String pname);
}
