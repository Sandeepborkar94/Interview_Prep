package com.infy.SpringbootrestapiEmailSending.app.model;

import lombok.Data;

@Data
public class EmailApp 
{
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textBody;
}
