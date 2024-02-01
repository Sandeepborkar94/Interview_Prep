package com.infy.springbootrestapicrud.app.serviceI;

import java.util.List;

import com.infy.springbootrestapicrud.app.model.Product;

public interface ProductServiceI {

	Product saveProduct(Product p);

	List<Product> getProducts();

	void deleteProduct(Integer productId);

	Product updateProduct(Product p, Integer productId);

	Product getProduct(String productName);

}
