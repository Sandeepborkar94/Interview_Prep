package com.infy.practice.app.serviceImplements;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.practice.app.dto.AppointmentFormDto;
import com.infy.practice.app.models.Appointment;
import com.infy.practice.app.models.Patient;
import com.infy.practice.app.repository.AppointmentRepo;
import com.infy.practice.app.repository.PatientRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookAppointmentService 
{
	@Autowired private AppointmentRepo appointmentRepo;
	
	@Autowired private PatientRepo patientRepo;

	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) 
	{
		Patient patient = new ObjectMapper().convertValue(appointmentFormDto, Patient.class);

		Long patientNo = patientRepo.save(patient).getPatientNo();

		System.out.println("Patient saved Successfully : " + patientNo);

//		System.out.println(10/0);

		Appointment appointment = Appointment.builder().date(new Date(System.currentTimeMillis())).doctorNo(102l)
				.patientNo(patientNo).build();

		Long appointmentNo = appointmentRepo.save(appointment).getAppointmentNo();

		return "Appointment Booked Successfully:  " + appointmentNo;
	}
}
