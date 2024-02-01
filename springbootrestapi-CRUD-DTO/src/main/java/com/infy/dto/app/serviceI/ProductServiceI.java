package com.infy.dto.app.serviceI;

import java.util.List;

import com.infy.dto.app.Model.Product;

public interface ProductServiceI {

	public Product saveProduct(Product p);

	public Product getProductByName(String pname);

	public List<Product> getProducts();

}
