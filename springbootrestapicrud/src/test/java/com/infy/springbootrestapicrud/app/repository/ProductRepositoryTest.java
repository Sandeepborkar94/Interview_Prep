package com.infy.springbootrestapicrud.app.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.springbootrestapicrud.app.model.Product;

@SpringBootTest
class ProductRepositoryTest {
	
	
	@Autowired private ProductRepository pr;

	@Test
	void testIsPersonExistByProductId()
	{
		Product product = new Product(123, "Sony", "BAD", "2434");
		
		pr.save(product); 
		
		Boolean actualResult =pr.isPersonExistByProductId(product.getProductId());
		
		assertThat(actualResult).isTrue();
			
	}

}
