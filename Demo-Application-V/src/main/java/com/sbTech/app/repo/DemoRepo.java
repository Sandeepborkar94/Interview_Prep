package com.sbTech.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbTech.app.model.Student;

public interface DemoRepo extends JpaRepository<Student, Integer>
{

}
