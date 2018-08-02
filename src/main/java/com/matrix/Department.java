package com.matrix;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Component;

@Component
public class Department {

	private static final Logger logger = Logger.getLogger(Department.class);
	
	Properties props = new Properties();
	
	
	
	private String name;
	private String address;
	
	
	
	public void a(String name,String address) {

		try {
			props.load(getClass().getResourceAsStream("/log4j.properties"));
			PropertyConfigurator.configure(props);
		} catch (Exception e) {
			logger.error("can not find log4j.properties file");
		}
		
		
		
		System.out.println("hi from a"+name+"--" +address);

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
