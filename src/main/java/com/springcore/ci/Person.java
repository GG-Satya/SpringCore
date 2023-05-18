package com.springcore.ci;

public class Person {
	private int pid;
	private String pname;
	private Certificate certificate;
	
	public Person(int pid, String pname, Certificate certificate) {
		this.pid = pid;
		this.pname = pname;
		this.certificate = certificate;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", certificate=" + certificate + "]";
	}
	
}
