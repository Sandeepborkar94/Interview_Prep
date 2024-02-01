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
public class Orders
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer order_id;
	
	private String product;
	
	private Integer total;
	
	

}
