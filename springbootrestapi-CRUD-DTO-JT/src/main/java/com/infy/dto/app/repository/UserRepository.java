package com.infy.dto.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

}
