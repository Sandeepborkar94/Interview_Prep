package com.infy.springbootrestapicrud.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Supplier 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer supplierId;
	private String supplierName;
	private String supplierAdress;
	private String supplierContact;

}
