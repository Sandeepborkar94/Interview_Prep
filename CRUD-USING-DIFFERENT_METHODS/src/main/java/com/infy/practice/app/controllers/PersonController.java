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

import com.infy.practice.app.models.Person;
import com.infy.practice.app.serviceInterface.PersonInterface;

@RestController
@RequestMapping(value = "/person")
public class PersonController 
{
	@Autowired
	PersonInterface personInterface;

	public PersonController(PersonInterface personInterface)
	{
		this.personInterface = personInterface;
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Person> savePerson(@RequestBody Person person) 
	{
		Person person2 = personInterface.savePerson(person);

		return new ResponseEntity<Person>(person2, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get/{firstname}/{lastname}")
	public ResponseEntity<Person> getPersonByFirstNameOrLastName(@PathVariable String firstname, @PathVariable String lastName)
	{
		Person personByFirstNameOrLastName = this.personInterface.getPersonByFirstNameOrLastName(firstname, lastName);
		
		return new ResponseEntity<Person>(personByFirstNameOrLastName,HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value = "/find")
	public ResponseEntity<List<Person>> findAllPersons()
	{	
		List<Person> findAllPersons = this.personInterface.findAllPerson();
		
		return new ResponseEntity<List<Person>>(findAllPersons, HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value = "/find/byname/{id}")
	public ResponseEntity<Person> findPersonById(@PathVariable int id)
	{	
		Person findById = this.personInterface.findPersonById(id);
		
		return new ResponseEntity<Person>(findById,HttpStatus.ACCEPTED);	
	}
	
//	@GetMapping(value = "/findSalary")
//	public ResponseEntity<List<Person>> findHighestSalary()
//	{
//		List<Person> listSalary =this.personInterface.findHighestSalary();
//		return new ResponseEntity<List<Person>>(listSalary,HttpStatus.OK);
//		
//	}
	

}
