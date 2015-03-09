package com.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

public class SpringApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Contact contact = context.getBean(Contact.class);
		System.out.println(contact);
		ConversionService conversionService = context.getBean(ConversionService.class);
		System.out.println(conversionService.convert(contact.date, String.class));
	}
}
