package com.infy.springbootrestapicrudDocumentSaving.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudDocumentSaving.app.ServiceI.DocServiceI;
import com.infy.springbootrestapicrudDocumentSaving.app.model.ApplicantDoc;
import com.infy.springbootrestapicrudDocumentSaving.app.repository.DocsRepository;

@Service
public class DocsServiceImpl implements DocServiceI {

	@Autowired
	DocsRepository dpr;
	
	@Override
	public ApplicantDoc saveDocuments(ApplicantDoc ad) {
		
		ApplicantDoc a = dpr.save(ad);
		return a;
	}

	@Override
	public List<ApplicantDoc> getDocuments() {
		
		return dpr.findAll();
	}

	@Override
	public ApplicantDoc getSingleDoc(int singleId) 
	{
		
		return dpr.getById(singleId);
	}
}
