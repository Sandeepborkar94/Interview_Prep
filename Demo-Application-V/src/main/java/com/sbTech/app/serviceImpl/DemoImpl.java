package com.sbTech.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbTech.app.model.Student;
import com.sbTech.app.repo.DemoRepo;
import com.sbTech.app.service.DemoService;

@Service
public class DemoImpl implements DemoService 
{
	@Autowired
	private DemoRepo demoRepo;

	@Override
	public Student saveStudent(Student student)
	{
		return this.demoRepo.save(student);
	}

	@Override
	public List<Student> getStudent()
	{
		return this.demoRepo.findAll();
	}
	
	
}
