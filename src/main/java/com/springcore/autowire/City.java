package com.springcore.autowire;

public class City {
	private String name;
	private int pin;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String name, int pin) {
		super();
		this.name = name;
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", pin=" + pin + "]";
	}
}
