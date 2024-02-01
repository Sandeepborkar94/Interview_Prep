package com.infy.dto.app.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	private String pname;
	private String pprice;
	private String pdesc;
}