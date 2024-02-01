package com.infy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.beans.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Integer>
{

}
