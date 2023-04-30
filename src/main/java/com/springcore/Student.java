package com.springcore;

public class Student {
	private int id;
	private String name;
	private String Address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting student id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting student name");
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		System.out.println("Setting student address");
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
}
