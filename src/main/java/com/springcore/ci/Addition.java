package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	Addition(double a, double b){
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double , double - Constructor");
	}

	Addition(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("int , int - Constructor");
	}
	
	Addition(String a, String b){
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String , String - Constructor");
	}

	public int doSum() {
		System.out.println("Value of a = "+this.a);
		System.out.println("Value of b = "+this.b);
		return this.a +this.b;
	}
}
