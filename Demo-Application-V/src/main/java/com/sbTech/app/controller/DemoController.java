package com.sbTech.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbTech.app.model.Student;
import com.sbTech.app.service.DemoService;

@RestController
public class DemoController 
{
	@Autowired
	private DemoService demoService;
	
	@GetMapping(value = "/hello")
//	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String helloWorld() 
	{
		return "Hello World";
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{	
		Student student2 =demoService.saveStudent(student);
		
		return new ResponseEntity<Student>(student2,HttpStatus.CREATED);
	
	}
	
	@GetMapping(value = "/save")
	public ResponseEntity<List<Student>> getStudent()
	{	
		List<Student> student =demoService.getStudent();
		
		return new ResponseEntity<>(student,HttpStatus.CREATED);
		
	}
	
}
