package com.infy.java8.practice.stream.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.java8.practice.stream.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> 
{
	List<Customer> findAll();
	
}
