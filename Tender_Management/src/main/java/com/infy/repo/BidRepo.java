package com.infy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.beans.Bid;
import com.infy.beans.Tender;

public interface BidRepo extends JpaRepository<Bid, Integer>
{

	List<Bid> findByTender(Tender tender);

}
