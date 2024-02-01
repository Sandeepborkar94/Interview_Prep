package com.infy.practice.app.serviceInterface;

import java.util.List;

import com.infy.practice.app.models.Person;

public interface PersonInterface 
{
	public Person savePerson(Person person);
	
	public Person getPersonByFirstNameOrLastName(String firstName, String lastName);
	
	public List<Person> findAllPerson();

	public Person findPersonById(int id);

//	public List<Person> findHighestSalary();
	
	
}
