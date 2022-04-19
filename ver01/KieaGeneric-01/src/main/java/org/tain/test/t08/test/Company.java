package org.tain.test.t08.test;

public class Company {

	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("[Company:%s]", this.name);
	}
}
