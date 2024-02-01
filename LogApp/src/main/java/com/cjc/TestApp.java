 package com.cjc;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp 
{
//	3. create a logger object
	private static Logger log = Logger.getLogger(TestApp.class);
	
	
	public static void main(String[] args) throws Exception 
	{
//		1. create layout
		Layout layout= new PatternLayout("%p,%d, %C, %M,%m,%n");
//		Layout layout= new XMLLayout();
//		Layout layout= new HTMLLayout();
//		Layout layout= new SimpleLayout();
		
//		2. create appender + link layout
		Appender app = new FileAppender(layout, "C:/Users/Sandy/OneDrive/Desktop/sssssss/data.log");	 
//		Appender app = new ConsoleAppender(layout);	 
		
//		4. link appender with logger
		log.addAppender(app);
		
		
//		4. print messages
		log.debug("from debug");
		log.info("from info");
		log.warn("from warn");
		log.error("from error");
		log.fatal("from fatal");
			
	}
}  
