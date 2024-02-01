package com.infy.springbootrestapicrudDocumentSaving.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrudDocumentSaving.app.model.ApplicantDoc;

@Repository
public interface DocsRepository extends JpaRepository<ApplicantDoc,Integer> 
{
	
}
