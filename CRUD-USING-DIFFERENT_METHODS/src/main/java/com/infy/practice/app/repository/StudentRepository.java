package com.infy.practice.app.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.infy.practice.app.models.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>
{
		
	public List<Student> findByName(String name);

	public List<Student> getByName(String name);

	public List<Student> queryByName(String name);

	public List<Student> countByName(String name);

	public List<Student> readByName(String name);

	public List<Student> findByNameAndRollNumber(String name, String rollnumber);

	public List<Student> findFirst3ByName(String name); // important

	public List<Student> findTop3ByName(String name); // very important

	/*
	 * Rule 5 – We can write the query method if we want to restrict the number of
	 * records by directly providing the number as the digit in method name. We need
	 * to add the First or the Top keyword before the by and after find.
	 * 
	 * public List<Student> findFirst3ByName(String name);
	 * 
	 * public List<Student> findTop3ByName(String name);
	 * 
	 * Both query methods will return only first 3 records.
	 * 
	 * List of keywords used to write custom repository methods.
	 * 
	 * And, Or, Is, Equals, Between, LessThan, LessThanEqual, GreaterThan,
	 * GreaterThanEqual, After, Before, IsNull, IsNotNull, NotNull, Like, NotLike,
	 * StartingWith, EndingWith, Containing, OrderBy, Not, In, NotIn, True, False,
	 * IgnoreCase.
	 */
	
	public List<Student> findByNameEquals(String name);

	public List<Student> findByRollNumber(String rollNumber);

	public List<Student> findByUniversity(String university);

	public List<Student> findByRollNumberIn(List<String> rollNumbers);

	public List<Student> findByRollNumberNotIn(List<String> rollNumbers);

	public List<Student> findByRollNumberBetween(String start, String end);

	public List<Student> findByNameNot(String name);

	public List<Student> findByNameContainingIgnoreCase(String name);

	public List<Student> findByNameLike(String name);

	public List<Student> findByRollNumberGreaterThan(String rollnumber);

	public List<Student> findByRollNumberLessThan(String rollnumber);

}
