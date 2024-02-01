package com.infy.practice.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientNo;
	
	private String name;
	
	private String gender;
	
	private String mobile;
	
	private Integer age;

}
