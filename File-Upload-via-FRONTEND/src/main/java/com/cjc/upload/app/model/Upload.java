package com.cjc.upload.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Upload
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer upload_Id;
	
	
	@Lob
	private byte[] photo;
}
