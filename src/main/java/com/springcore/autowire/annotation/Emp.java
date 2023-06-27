package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("city000")
	private City city;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(City city) {
		super();
		System.out.println("through constructor");
		this.city = city;
	}

	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		System.out.println("through setter method");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emp [city=" + city + "]";
	}
	
}
