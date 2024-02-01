package com.infy.practice.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.practice.app.dto.AppointmentFormDto;
import com.infy.practice.app.serviceImplements.BookAppointmentService;

@RestController
public class BookAppointmentController 
{
	
	@Autowired private BookAppointmentService  appointmentService;
	
	@PostMapping(value = "/book")
	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) 
	{
		return this.appointmentService.bookAppointment(appointmentFormDto);
	}

}
