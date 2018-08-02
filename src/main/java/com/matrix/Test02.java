package com.matrix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {

	public static void main(String[] args) {


		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		/**
		 * in case if i did not  prepare log4j.properties then 
		 * i have to use BasicConfigurator.configure() to 
		 * instruct log4j that you have to load basic configuration 
		 * by using BasicConfigurator.configure
		 * as there is no log4j.properties available
		 */
		
		//BasicConfigurator.configure();

		Department d = ctx.getBean("department", Department.class);
		Person p = ctx.getBean("person", Person.class);

		d.a("shiva", "omnipresent");
		p.d();
	}

}
