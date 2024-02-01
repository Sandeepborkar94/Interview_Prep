package com.infy.practice.app.serviceInterface;

import java.util.List;

import com.infy.practice.app.models.Student;

public interface StudentInterface 
{

	public Student saveStudent(Student student);

	public List<Student> getStudentByName(String name);
	
	public List<Student> findStudentByNameAndRollNumber(String name, String rollnumber);
	
	public List<Student> findFirst3StudentsByName(String name); // important

	public List<Student> findTop3StudentsByName(String name); // very important

	public List<Student> findStudentByNameEquals(String name);

	public List<Student> findStudentByRollNumberGreaterThan(String rollnumber);

	
}
