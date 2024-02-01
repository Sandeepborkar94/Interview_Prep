package com.infy.practice.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.practice.app.models.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> 
{
	
}
