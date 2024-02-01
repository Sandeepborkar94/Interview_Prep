package com.infy.SpringbootrestapiEmailSending.app.model;

import lombok.Data;

@Data
public class MailApp
{
	private String fromEmail;
	private String toEmail;
	private String subject;
	private String textBody;
}
