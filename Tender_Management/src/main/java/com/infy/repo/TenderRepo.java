package com.infy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.beans.Tender;

public interface TenderRepo extends JpaRepository<Tender, Integer> 
{

}
