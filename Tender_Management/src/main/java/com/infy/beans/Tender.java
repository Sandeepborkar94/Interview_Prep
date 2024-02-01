package com.infy.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tender
{
	@Id
	private Integer tid;
	
	private String tname;
	
	private String tprice;
	
	private String tDesc;
	
	private String tLoc;

}
