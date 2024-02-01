package com.infy.practice.app.serviceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.practice.app.models.Student;
import com.infy.practice.app.repository.StudentRepository;
import com.infy.practice.app.serviceInterface.StudentInterface;

@Service
public class StudentImpl implements StudentInterface {

	@Autowired
	private StudentRepository studentRepository;

	public StudentImpl(StudentRepository studentRepository) 
	{
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) 
	{
		return this.studentRepository.save(student);
	}

	@Override
	public List<Student> getStudentByName(String name)
	{
//		return this.studentRepository.findByName(name);
//		return this.studentRepository.getByName(name);
		return this.studentRepository.queryByName(name);
//		return this.studentRepository.countByName(name);
//		return this.studentRepository.readByName(name);
	}

	@Override
	public List<Student> findStudentByNameAndRollNumber(String name, String rollnumber)
	{
		return this.studentRepository.findByNameAndRollNumber(name, rollnumber);
	}

	@Override
	public List<Student> findFirst3StudentsByName(String name) 
	{
		return this.studentRepository.findFirst3ByName(name);
	}

	@Override
	public List<Student> findTop3StudentsByName(String name)
	{
		return this.studentRepository.findTop3ByName(name);
	}

	@Override
	public List<Student> findStudentByNameEquals(String name)
	{
		List<Student> findByNameEquals = this.studentRepository.findByNameEquals("Vedant");
		
		for (Student student : findByNameEquals) 
		{
			System.out.println(student.getName());
		}
			
		System.out.println("Hello admin");
		
		return findByNameEquals;
//		return this.studentRepository.findByNameEquals(name);
	}

	@Override
	public List<Student> findStudentByRollNumberGreaterThan(String rollnumber) 
	{
		return this.studentRepository.findByRollNumberGreaterThan(rollnumber);
	}
	


}
