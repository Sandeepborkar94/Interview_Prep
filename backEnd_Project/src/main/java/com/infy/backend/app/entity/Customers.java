package com.infy.backend.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers
{
	@Id
	private Integer customerid;
	
	private String customername;
	
	private String contactname;
	
	private String address;
	
	private String city;
	
	private Integer postalcode;
	
	private String country;

}
