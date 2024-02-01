package com.infy.practice.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.practice.app.models.Customers;

@Repository
public interface CustomerRepo extends JpaRepository<Customers, Integer> 
{

}
