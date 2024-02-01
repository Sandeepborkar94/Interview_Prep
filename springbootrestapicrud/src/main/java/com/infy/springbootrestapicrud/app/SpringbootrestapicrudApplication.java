package com.infy.springbootrestapicrud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootrestapicrudApplication {
	public static void main(String[] args)
	{
		System.out.println("Hello");

		SpringApplication.run(SpringbootrestapicrudApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;

	}

}
