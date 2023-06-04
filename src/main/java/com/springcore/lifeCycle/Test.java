package com.springcore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/lifeCycle/Config.xml");
		
		Food f1 = (Food) context.getBean("food01");
		System.out.println(f1);
		
		//registering shutdown hook
		context.registerShutdownHook();
		System.out.println("===================");
		
		Drinks drink01 = (Drinks) context.getBean("drink01");
		System.out.println(drink01);
		
		Example ex01 = (Example) context.getBean("ex01");
		System.out.println(ex01);
	}
}
