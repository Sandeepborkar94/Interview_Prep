package com.infy.backend.app.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.backend.app.entity.Customers;

public interface CustomerRepo extends JpaRepository<Customers, Integer> 
{

}
