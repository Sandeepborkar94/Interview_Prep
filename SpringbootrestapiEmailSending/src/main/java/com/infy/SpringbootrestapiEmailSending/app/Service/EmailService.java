package com.infy.SpringbootrestapiEmailSending.app.Service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.infy.SpringbootrestapiEmailSending.app.model.EmailApp;

@Service
public class EmailService 
{
	@Autowired JavaMailSender jms;

	public void sendEmail(EmailApp e) 
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
			System.out.println("Mail Not Sent");
		}
		
		System.out.println("MAIL Sent from services");
	}

	public void sendEmailWithAttachment(EmailApp em, MultipartFile f) 
	{
		MimeMessage mm = jms.createMimeMessage();
		try 
		{
			MimeMessageHelper mmh = new MimeMessageHelper(mm,true);
			
			mmh.setFrom(em.getFromEmail());
			mmh.setTo(em.getToEmail());
			mmh.setSubject(em.getSubject());
			mmh.setText(em.getTextBody());
			
			mmh.addAttachment(f.getOriginalFilename(), f);
			
			jms.send(mm);
			
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Not sent");
		}
		
		System.out.println("sent successfully");
	}
}
