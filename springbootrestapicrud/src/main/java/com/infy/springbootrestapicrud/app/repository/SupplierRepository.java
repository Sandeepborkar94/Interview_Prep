package com.infy.springbootrestapicrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrud.app.model.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer>
{

}
