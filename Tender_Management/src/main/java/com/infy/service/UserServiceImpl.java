package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.beans.Bid;
import com.infy.beans.Tender;
import com.infy.beans.Vendor;
import com.infy.repo.BidRepo;
import com.infy.repo.TenderRepo;
import com.infy.repo.VendorRepo;

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	private VendorRepo venderRepo;
	
	
	@Autowired
	private TenderRepo tenderRepo;
	
	
	@Autowired
	private BidRepo bidRepo;
	
	

	@Override
	public void createVendor(Vendor vendor) 
	{
		
		// TODO Auto-generated method stub
		this.venderRepo.save(vendor);
		
	}

	@Override
	public List<Vendor> getAllVendors()
	{
		
		return venderRepo.findAll();
	}

	@Override
	public void createTender(Tender tender) 
	{
		// TODO Auto-generated method stub
		
		this.tenderRepo.save(tender);
		
	}

	@Override
	public List<Tender> getAllTenders()
	{
		// TODO Auto-generated method stub
		return this.tenderRepo.findAll();
	}

	  @Override
	    public List<Bid> getAllBids(Tender tender)
	  {
	        return bidRepo.findByTender(tender);
	    }

	@Override
	public void selectBid(Bid bid) 
	{
		this.bidRepo.save(bid);
	}
	

}
