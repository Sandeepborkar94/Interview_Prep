package com.infy.springbootrestapicrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrud.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{

	public Product findByPname(String pname);

}