package com.infy.dto.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.app.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	public Product findByPname(String pname);
}

