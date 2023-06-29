package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/standalone/collections/AloneConfig.xml");
		
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeeStructue().getClass().getName());
	}

}
