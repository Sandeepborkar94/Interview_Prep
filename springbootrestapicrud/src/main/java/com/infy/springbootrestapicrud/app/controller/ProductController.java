package com.infy.springbootrestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.model.Supplier;
import com.infy.springbootrestapicrud.app.serviceI.ProductServiceI;
import com.infy.springbootrestapicrud.app.serviceI.SupplierServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class ProductController
{
	@Autowired
	ProductServiceI psi;
	
	@Autowired
	SupplierServiceI si;
	
//	post api data
	
	@PostMapping(value = "/product/{supplierId}")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p,@PathVariable int supplierId) 
	{
		
		List<Supplier> supplierList = si.getsupplier();
		
		for(Supplier s: supplierList) 
		{
			if(supplierId==s.getSupplierId()) 
			{
				p.setSupplier(s);
			}
		}
		
		Product product = psi.saveProduct(p);

		return new ResponseEntity<Product>(product,HttpStatus.CREATED);	
	}
	
//	get data
	@GetMapping(value = "/product")
	public ResponseEntity<List<Product>> getProducts()
	{
		List<Product> list = psi.getProducts();
		if(list.isEmpty()) 
		{
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/product/{productId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable Integer productId) 
	{
		psi.deleteProduct(productId);
		return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping(value = "/product/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product p,@PathVariable Integer productId) 
	{
		Product product=psi.updateProduct(p,productId);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/product/{productName}")
	public ResponseEntity<Product> getProduct(@PathVariable String productName)
	{
		Product p = psi.getProduct(productName);
//		if(p!=null) 
//		{
			return new ResponseEntity<Product>(p,HttpStatus.OK);
//		}
//		else
//		{
//			throw new ProductNotFoundException("stock nahi hai");
//		}
	}
	
//	@ExceptionHandler(ProductNotFoundException.class)
//	public ResponseEntity<String> productNotFoundExceptionHandler(ProductNotFoundException e)
//	{
//		System.out.println("Handle Exception");
//		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
//	}
	
	@PostMapping(value = "/upload-file")
	public ResponseEntity<String> uploadFile()
	{
		return ResponseEntity.ok("Working");
		
	}
}
