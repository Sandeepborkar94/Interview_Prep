package com.cjc.upload.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.upload.app.model.Upload;

@Repository
public interface Upload_Repository extends JpaRepository<Upload, Integer>
{
	
}
