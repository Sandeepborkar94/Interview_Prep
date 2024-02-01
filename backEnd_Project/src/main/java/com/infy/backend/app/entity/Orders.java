package com.infy.backend.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders 
{
	@Id
	@Column(name = "OrderID")
	private Integer orderID;
	
	@Column(name = "CustomerID")
	private Integer customerID;
	
	@Column(name = "EmployeeID")
	private Integer employeeID;
	
	@Column(name = "ShipperID")
	private Integer shipperID;
	

}
