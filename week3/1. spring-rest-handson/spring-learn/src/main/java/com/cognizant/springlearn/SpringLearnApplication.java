package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(SpringLearnApplication.class, args);

		displayDate();
	}

	public static void displayDate() throws Exception {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat format =
				context.getBean("dateFormat", SimpleDateFormat.class);

		// Parse string into Date object
		Date date = format.parse("08/10/2005");

		// Print parsed date
		System.out.println(date);

	}

}