package com.infy.springbootrestapicrud.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.springbootrestapicrud.app.model.Product;
import com.infy.springbootrestapicrud.app.serviceI.ProductServiceI;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductServiceI psi;

	@PostMapping(value = "/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p) {
		Product product = psi.saveProduct(p);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	@GetMapping(value = "/product")
	public ResponseEntity<List<Product>> getProduct() {
		List<Product> list = psi.getProduct();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);

	}

	@PostMapping(value = "/saveDoc", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Product> saveDoc(@RequestPart(required = true, value = "photo") MultipartFile photo,
			@RequestPart(required = true, value = "pname") String s) throws IOException {
		Product product1 = new Product();

		product1.setPhoto(photo.getBytes());

		ObjectMapper o = new ObjectMapper();

		Product product2 = o.readValue(s, Product.class);

		product1.setPname(product2.getPname());

		Product pp = psi.saveDoc(product1);

		return new ResponseEntity<Product>(pp, HttpStatus.CREATED);

	}

	@GetMapping(value = "getByName/{pname}")
	public ResponseEntity<Product> getProductByName(@PathVariable String pname) {
		System.out.println("In controller");
		Product pp = psi.getProductByName( pname);

		return new ResponseEntity<Product>(pp, HttpStatus.ACCEPTED);

	}

}
