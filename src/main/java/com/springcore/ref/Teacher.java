package com.springcore.ref;

public class Teacher {
	private String tid;
	private String tname;
	private Address address;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tid, String tname, Address address) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.address = address;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", address=" + address + "]";
	}
	
}
