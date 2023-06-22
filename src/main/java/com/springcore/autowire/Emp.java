package com.springcore.autowire;

public class Emp {
	private City city;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(City city) {
		super();
		this.city = city;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emp [city=" + city + "]";
	}
	
}
