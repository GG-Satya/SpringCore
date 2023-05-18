package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		Teacher teacher = (Teacher) context.getBean("teacher01"); 	
		
		System.out.println(teacher);
		System.out.println(teacher.getAddress());
	}
}
