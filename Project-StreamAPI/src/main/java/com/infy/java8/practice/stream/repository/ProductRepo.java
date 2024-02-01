package com.infy.java8.practice.stream.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.java8.practice.stream.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long>
{
	List<Product> findAll();
}
