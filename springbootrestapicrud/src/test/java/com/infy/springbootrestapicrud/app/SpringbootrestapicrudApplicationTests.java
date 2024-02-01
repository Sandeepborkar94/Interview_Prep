package com.infy.springbootrestapicrud.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootrestapicrudApplicationTests 
{
	
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() 
	{
		
	}
	

	@Test
	@Disabled
	void testSum() 
	{
		int expectedResult = 6;
		
		int actucalResult = calculator.doSum(2, 2, 2);
		
		assertThat(actucalResult).isEqualTo(expectedResult);	
	}
	
	@Test
	void testProduct() 
	{
		int expectedResult = 800;
		
		int actualResult = calculator.doProduct(12, 4);
		
		assertThat(actualResult).isLessThan(expectedResult);
		
	}
	
	@Test
	void comapareTest()
	{
		Boolean actualResult =calculator.compareTwoNum(12, 12);
		
		assertThat(actualResult).isTrue();	
	}

}
