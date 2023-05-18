package com.springcore.ci;

public class Certificate {
	private int serialNo;
	private String name;
	
	public Certificate(int serialNo, String name) {
		this.serialNo = serialNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [serialNo=" + serialNo + ", name=" + name + "]";
	}
	
}
