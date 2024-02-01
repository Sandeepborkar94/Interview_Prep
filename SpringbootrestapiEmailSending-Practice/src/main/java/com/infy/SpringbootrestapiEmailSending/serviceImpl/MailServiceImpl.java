package com.infy.SpringbootrestapiEmailSending.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.infy.SpringbootrestapiEmailSending.app.model.MailApp;
import com.infy.SpringbootrestapiEmailSending.serviceI.MailServiceI;

@Service
public class MailServiceImpl implements MailServiceI
{
	@Autowired JavaMailSender jms;

	@Override
	public void sendEmail(MailApp e) 
	{
		try 
		{
			SimpleMailMessage smm = new SimpleMailMessage();
			smm.setFrom(e.getFromEmail());
			smm.setTo(e.getToEmail());
			smm.setSubject(e.getSubject());
			smm.setText(e.getTextBody());
			
			jms.send(smm);
			
		} catch (Exception e2)
		{
			e2.printStackTrace();
			System.out.println("Mail not Sent");
		}
		System.out.println("Sent successfully");
	}
}
