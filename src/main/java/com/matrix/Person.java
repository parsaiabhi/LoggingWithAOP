package com.matrix;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private static final Logger logger = Logger.getLogger(Person.class);

	Properties props = new Properties();
	
	public void d() {
		
		try {
			props.load(getClass().getResourceAsStream("/log4j.properties"));
		} catch (Exception e) {
			logger.error("can not find log4j.properties file");
		}
		System.out.println("hi from d");
	}

}
