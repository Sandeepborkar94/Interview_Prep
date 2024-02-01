package com.infy.practice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrudUsingDifferentMethodsApplication

{
	public static void main(String[] args)
	{

		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(CrudUsingDifferentMethodsApplication.class, args);

	}

}
