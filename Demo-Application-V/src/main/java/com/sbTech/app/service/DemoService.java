package com.sbTech.app.service;

import java.util.List;

import com.sbTech.app.model.Student;

public interface DemoService 
{

	public Student saveStudent(Student student);

	public List<Student> getStudent();
	

}
