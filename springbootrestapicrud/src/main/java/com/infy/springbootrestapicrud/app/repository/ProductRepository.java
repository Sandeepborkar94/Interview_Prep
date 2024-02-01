package com.infy.springbootrestapicrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrud.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	
	public Product findByProductName(String productName);

	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Product s WHERE s.productId = :pid")
	public Boolean isPersonExistByProductId(Integer pid);
}
