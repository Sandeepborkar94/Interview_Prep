package com.infy.practice.app.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentNo;
	
	private Date date;
	
	private Long doctorNo;
	
	private Long patientNo;

}
