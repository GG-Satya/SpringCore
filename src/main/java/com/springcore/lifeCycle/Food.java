package com.springcore.lifeCycle;

public class Food {
	private double price;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(double price) {
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
		return "Food [price=" + price + "]";
	}
	public void hey() {
		System.out.println("executing init method :How are you ?");
	}
	public void bye() {
		System.out.println("executing destroy method (clean activity)");
	}
}
