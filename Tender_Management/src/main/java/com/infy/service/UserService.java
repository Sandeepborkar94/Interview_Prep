package com.infy.service;

import java.util.List;

import com.infy.beans.Bid;
import com.infy.beans.Tender;
import com.infy.beans.Vendor;

public interface UserService {

	public void createVendor(Vendor vendor);

	public List<Vendor> getAllVendors();

	public void createTender(Tender tender);

	public List<Tender> getAllTenders();

	public List<Bid> getAllBids(Tender tender);

	public void selectBid(Bid bid);

}
