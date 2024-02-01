package com.infy.SpringbootrestapiEmailSending.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.SpringbootrestapiEmailSending.app.Service.EmailService;
import com.infy.SpringbootrestapiEmailSending.app.model.EmailApp;


@RestController
public class EmailController 
{
	@Autowired EmailService es;
	
	@Value("${spring.mail.username}")
	String fromEmail;
	
	@GetMapping(value = "/hello")
	public String hello() 
	{
		return "Happy Diwali";
		
	}
	@PostMapping(value = "/sendEmail")
	public String sendEmail(@RequestBody EmailApp e) 
	{
		e.setFromEmail(fromEmail);
		try 
		{
			es.sendEmail(e);
		} catch (Exception e2) 
		{
			e2.printStackTrace();
			return "Mail Not Sent";
		}	
		return "Mail Sent Successfully from Controller";
	}
	@PostMapping(value = "/sendWithAttach",consumes = MediaType.ALL_VALUE)
	public String sendMailWithAttachMent(@RequestPart(required = true,value ="attachment")MultipartFile f,
			@RequestPart("email")String email) throws IOException
	{		
		try 
		{
			EmailApp em = new EmailApp();
			em.setFromEmail(fromEmail);
			
			ObjectMapper o = new ObjectMapper();
			
			EmailApp e2	 =o.readValue(email, EmailApp.class);
		
			em.setSubject(e2.getSubject());
			em.setToEmail(e2.getToEmail());
			em.setTextBody(e2.getTextBody());
			
			es.sendEmailWithAttachment(em,f);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return "Email not sent";
		}
		return "Email Sent successfully";
	} 
}
