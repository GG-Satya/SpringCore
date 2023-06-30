package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/StereoConfig.xml");
		Student student = context.getBean("stud",Student.class);
		System.out.println(student);
		System.out.println(student.getAddresses().getClass().getName());
		
		System.out.println(student.hashCode());
		
		Student student2 = context.getBean("stud",Student.class);
		System.out.println(student2.hashCode());
		
		Teacher t1 = context.getBean("teacher01",Teacher.class);
		Teacher t2 = context.getBean("teacher01",Teacher.class);
		System.out.println(t1.hashCode()+"--"+t2.hashCode());
	}

}
