package com.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean,DisposableBean{
	private double price;

	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drinks(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drinks [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking Pepsi: init");
	}

	public void destroy() throws Exception {
		System.out.println("Clean up code executing: destroy");
	}
	
}
