package com.infy.dto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.app.Model.Product;
import com.infy.dto.app.dto.Product_DTO;
import com.infy.dto.app.serviceI.ProductMapper;
import com.infy.dto.app.serviceI.ProductServiceI;

@RestController
@RequestMapping("/api")
public class ProductController1
{
	@Autowired
	ProductServiceI psi;

	ProductMapper mapper;

	@PostMapping(value = "/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p) 
	{
		Product pp = psi.saveProduct(p);
		return new ResponseEntity<Product>(pp, HttpStatus.CREATED);
	}

	@GetMapping(value = "/product/{pname}")
	public ResponseEntity<Product_DTO> getProductByName(@PathVariable String pname) {

		Product p = psi.getProductByName(pname);

		Product_DTO dto = mapper.INSTANCE.toProductDTO(p);

		return new ResponseEntity<Product_DTO>(dto, HttpStatus.OK);
	}

	@PostMapping(value = "/product1")
	public ResponseEntity<Product> saveProductDto(@RequestBody Product_DTO p) {
		Product pp1 = mapper.INSTANCE.toProduct(p);

		Product pp = psi.saveProduct(pp1);

		return new ResponseEntity<Product>(pp, HttpStatus.CREATED);
	}

	@GetMapping(value = "/productlist1")
	public ResponseEntity<List<Product_DTO>> getProducts() {

		List<Product> plist = psi.getProducts();

		List<Product_DTO> dtoList=mapper.INSTANCE.toProductDTO_list(plist);

		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}

}
