package com.infy.dto.app.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.app.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{

}
