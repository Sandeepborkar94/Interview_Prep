package com.infy.practice.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.practice.app.models.Student;
import com.infy.practice.app.serviceInterface.StudentInterface;

@RestController
@RequestMapping(value = "/student")
public class StudentContoller {
	@Autowired
	private StudentInterface studentInterface;

	public StudentContoller(StudentInterface studentInterface) {
		this.studentInterface = studentInterface;
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student stu = this.studentInterface.saveStudent(student);

		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable String name) {
		List<Student> stu1 = this.studentInterface.getStudentByName(name);

		return new ResponseEntity<List<Student>>(stu1, HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/get/{name}/{rollnumber}")
	public ResponseEntity<List<Student>> getStudentByNameAndRollNumber(@PathVariable String name,@PathVariable String rollnumber)
	{
		List<Student> stu1 = this.studentInterface.findStudentByNameAndRollNumber(name, rollnumber);
		
		return new ResponseEntity<List<Student>>(stu1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/get/first/{name}")
	public ResponseEntity<List<Student>> findFirst3StudentsByName(@PathVariable String name)
	{
		List<Student> stu1 = this.studentInterface.findFirst3StudentsByName(name);
		
		return new ResponseEntity<List<Student>>(stu1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/get/top/{name}")
	public ResponseEntity<List<Student>> findTop3StudentsByName(@PathVariable String name)
	{
		List<Student> stu1 = this.studentInterface.findTop3StudentsByName(name);
		
		return new ResponseEntity<List<Student>>(stu1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/get/equals/{name}")
	public ResponseEntity<List<Student>> findStudentByNameEquals(@PathVariable String name)
	{
		List<Student> stu1 = this.studentInterface.findStudentByNameEquals(name);
		
		return new ResponseEntity<List<Student>>(stu1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/get/greater/{rollnumber}")
	public ResponseEntity<List<Student>> findStudentByRollNumberGreaterThan(@PathVariable String rollnumber)
	{
		List<Student> stu1 = this.studentInterface.findStudentByRollNumberGreaterThan(rollnumber);
		
		return new ResponseEntity<List<Student>>(stu1,HttpStatus.ACCEPTED);
	}
	
	
	
	
	

}
