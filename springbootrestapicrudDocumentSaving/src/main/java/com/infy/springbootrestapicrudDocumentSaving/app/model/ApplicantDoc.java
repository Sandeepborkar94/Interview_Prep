package com.infy.springbootrestapicrudDocumentSaving.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ApplicantDoc 
{
//  basic data
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer applicantId;
	private String applicantName;
	private Integer docId;
	
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	
}
