package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	/*Note that both the @PostConstruct and @PreDestroy 
	 * annotations are part of Java EE. 
	 * Since Java EE was deprecated in Java 9, 
	 * and removed in Java 11, we have to add 
	 * an additional dependency to use these annotations:*/
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}
