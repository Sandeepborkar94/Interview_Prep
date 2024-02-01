//package com.infy.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.infy.beans.Bid;
//import com.infy.beans.Tender;
//import com.infy.service.VendorService;
//
//@RestController
//@RequestMapping("/vendor")
//public class VendorController {
//
//    @Autowired
//    private VendorService vendorService;
//
//    @GetMapping("/tenders")
//    public ResponseEntity<List<Tender>> getAllTenders() {
//        List<Tender> tenders = vendorService.getAllTenders();
//        return new ResponseEntity<>(tenders, HttpStatus.OK);
//    }
//
//    @PostMapping("/bids")
//    public ResponseEntity<Void> placeBid(@RequestBody Bid bid) {
//        vendorService.placeBid(bid);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    @GetMapping("/bids/{id}/status")
//    public ResponseEntity<String> getBidStatus(@PathVariable("id") Long bidId) {
//        String status = vendorService.getBidStatus(bidId);
//        return new ResponseEntity<>(status, HttpStatus.OK);
//    }
//
//    @GetMapping("/bids")
//    public ResponseEntity<List<Bid>> getBidHistory() {
//        List<Bid> bidHistory = vendorService.getBidHistory();
//        return new ResponseEntity<>(bidHistory, HttpStatus.OK);
//    }
//}
