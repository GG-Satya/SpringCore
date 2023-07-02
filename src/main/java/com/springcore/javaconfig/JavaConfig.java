package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"temp","con"})
	public Student getStudent() {
		return new Student(getSamosa());
	}
}
