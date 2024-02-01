package com.infy.practice.app.serviceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.practice.app.models.Person;
import com.infy.practice.app.repository.PersonRepository;
import com.infy.practice.app.serviceInterface.PersonInterface;

@Service
public class PersonImplement implements PersonInterface
{

	@Autowired
	private PersonRepository personRepository;
	
	public PersonImplement(PersonRepository personRepository) 
	{
		this.personRepository = personRepository;
	}

	@Override
	public Person savePerson(Person person) 
	{
		return this.personRepository.save(person);
	}

	@Override
	public Person getPersonByFirstNameOrLastName(String firstName, String lastName)
	{
		return this.getPersonByFirstNameOrLastName(firstName, lastName);
	}

	@Override
	public List<Person> findAllPerson() 
	{
		return this.personRepository.findAll();
	}

	@Override
	public Person findPersonById(int id) 
	{
		return this.personRepository.findByPersonId(id);
	}

//	@Override
//	public List<Person> findHighestSalary()
//	{
//		return this.personRepository.findBySalary();
//	}
	

}
