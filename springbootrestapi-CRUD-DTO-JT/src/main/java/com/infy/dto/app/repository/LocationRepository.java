package com.infy.dto.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.app.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location,Long>
{

}
