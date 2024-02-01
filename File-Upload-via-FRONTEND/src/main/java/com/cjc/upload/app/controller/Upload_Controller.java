package com.cjc.upload.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.upload.app.ServiceI.Service_Interace;
import com.cjc.upload.app.model.Upload;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class Upload_Controller {
	@Autowired
	Service_Interace si;

	@PostMapping(value = "/save", consumes = MediaType.ALL_VALUE)
	public Upload saveDoc(@RequestPart(required = true, value = "photo") MultipartFile photo) throws IOException, InterruptedException 
	{
		Upload u1 = new Upload();
		u1.setPhoto(photo.getBytes());
		
		Upload uu = si.saveDoc(u1);
		
		Thread.sleep(5000);

		return uu;
	}
}
