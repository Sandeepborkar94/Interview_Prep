package com.infy.springbootrestapicrudDocumentSaving.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.springbootrestapicrudDocumentSaving.app.ServiceI.DocServiceI;
import com.infy.springbootrestapicrudDocumentSaving.app.helper.FileuploadHelper;
import com.infy.springbootrestapicrudDocumentSaving.app.model.ApplicantDoc;

@RestController
public class DocsController {
	@Autowired
	DocServiceI dsi;

	@Autowired
	private FileuploadHelper fileuploadHelper;

	@PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApplicantDoc> saveDoc(@RequestPart(required = true, value = "adharCard") MultipartFile adhar,
			@RequestPart(required = true, value = "panCard") MultipartFile pan,
			@RequestPart(required = true, value = "photo") MultipartFile photo,
			@RequestPart(required = true, value = "signature") MultipartFile sign,
			@RequestPart(required = true, value = "doc") String d) throws IOException {

		ApplicantDoc ad = new ApplicantDoc();
		ad.setAdharCard(adhar.getBytes());
		ad.setPanCard(pan.getBytes());
		ad.setPhoto(photo.getBytes());
		ad.setSignature(sign.getBytes());

		ObjectMapper o = new ObjectMapper();

		ApplicantDoc ad1 = o.readValue(d, ApplicantDoc.class);

		ad.setApplicantName(ad1.getApplicantName());
		ad.setDocId(ad1.getDocId());

		ApplicantDoc a = dsi.saveDocuments(ad);

		return new ResponseEntity<ApplicantDoc>(a, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get")
	public List<ApplicantDoc> getDoc() {
		return dsi.getDocuments();
	}

	@GetMapping(value = "/getSingleDoc/{singleId}")
	public ApplicantDoc getSingleDoc(@PathVariable int singleId) {
		ApplicantDoc aa = dsi.getSingleDoc(singleId);

		return aa;
	}

	@PostMapping(value = "/file-upload")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file) {
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());

//		return ResponseEntity.ok("Working");

		try {

			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image Not Found");
			}

			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg Format is supported");
			}
			
		boolean f =	fileuploadHelper.uploadFile(file);
			if(f)
			{
				return ResponseEntity.ok("file is succesfully uploaded");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went wrong please try again");
	}

}