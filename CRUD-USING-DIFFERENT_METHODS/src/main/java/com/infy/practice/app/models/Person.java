package com.infy.practice.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	
	private String firstName;
	
	private String lastName;
	
	private Long mobileNumber;
	
	private Integer age;
	
	private Double salary;
	
	

}