package com.infy.SpringbootrestapiEmailSending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SpringbootrestapiEmailSending.app.model.MailApp;
import com.infy.SpringbootrestapiEmailSending.serviceI.MailServiceI;


@RestController
public class MailController 
{
	@Autowired MailServiceI ms;
	
	@Value("${spring.mail.username}")
	String fromEmail;
	
	
	@PostMapping(value = "/sendEmail")
	public String sendMail(@RequestBody MailApp e) 
	{
		e.setFromEmail(fromEmail);
		try 
		{
			ms.sendEmail(e);
			
		} catch (Exception e2)
		{
			e2.printStackTrace();
			return "Mail not Sent";
		}

		return "Mail Sent Successfully";
		
	}
	
}
