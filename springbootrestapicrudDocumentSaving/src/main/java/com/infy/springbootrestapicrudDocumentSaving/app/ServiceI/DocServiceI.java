package com.infy.springbootrestapicrudDocumentSaving.app.ServiceI;

import java.util.List;

import com.infy.springbootrestapicrudDocumentSaving.app.model.ApplicantDoc;

public interface DocServiceI {

	ApplicantDoc saveDocuments(ApplicantDoc ad);

	List<ApplicantDoc> getDocuments();

	ApplicantDoc getSingleDoc(int singleId);

}
