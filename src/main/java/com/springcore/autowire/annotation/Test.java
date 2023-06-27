package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/AutoConfig.xml");
	Emp emp1 = context.getBean("emp01",Emp.class);
	System.out.println(emp1);
	}
}
