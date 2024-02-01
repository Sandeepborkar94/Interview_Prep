package com.infy.practice.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infy.practice.app.models.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> 
{
//	public Todo findByPersonId(int personId);
	
//	public Optional<Todo> findByPersonId(int personId);
	
	public Optional<Person> findByFirstNameOrLastName(String firstName, String lastName);

	public Person findByPersonId(int id);

//	public List<Person> findBySalary();
}
