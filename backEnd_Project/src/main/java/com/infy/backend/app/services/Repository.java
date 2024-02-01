package com.infy.backend.app.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.backend.app.entity.Orders;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Orders, Integer>
{

}
