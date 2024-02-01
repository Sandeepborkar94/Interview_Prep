package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.beans.Bid;
import com.infy.beans.Tender;
import com.infy.beans.Vendor;
import com.infy.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    
//    (1) Create a new Vendor.

    
    @PostMapping("/vendors")
    public ResponseEntity<Void> createVendor(@RequestBody Vendor vendor) {
        userService.createVendor(vendor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    
//    (2) View all the vendors.
    
    @GetMapping("/vendors")
    public ResponseEntity<List<Vendor>> getAllVendors() {
        List<Vendor> vendors = userService.getAllVendors();
        return new ResponseEntity<>(vendors, HttpStatus.OK);
    }
    
//    (3) Create new tenders.

    @PostMapping("/tenders")
    public ResponseEntity<Void> createTender(@RequestBody Tender tender) {
        userService.createTender(tender);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    (4) View All the Tenders.
    
    
    @GetMapping("/tenders")
    public ResponseEntity<List<Tender>> getAllTenders() {
        List<Tender> tenders = userService.getAllTenders();
        return new ResponseEntity<>(tenders, HttpStatus.OK);
    }
    
//    (5) View All the Bids of a tender.

    @GetMapping("/tenders/{id}/bids")
    public ResponseEntity<List<Bid>> getAllBids(@PathVariable("id") Integer tenderId) {
        Tender tender = new Tender();
        tender.setTid(tenderId);
        List<Bid> bids = userService.getAllBids(tender);
        return new ResponseEntity<>(bids, HttpStatus.OK);
    }

//    select a bid
    
    @PutMapping("/bids/{id}")
    public ResponseEntity<Void> selectBid(@PathVariable("id") Long bidId) {
        Bid bid = new Bid();
        bid.setBidId(bidId);
        userService.selectBid(bid);	
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
