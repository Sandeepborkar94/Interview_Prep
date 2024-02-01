package com.infy.beans;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bid
{
	@Id
	private Long bidId;
	private String vendorId;
	private String tenderId;
	private int bidAmount;
	private Date bidDeadline;
	private String bidStatus ;

}
