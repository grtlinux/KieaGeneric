package org.tain.test.t07.test;

public class Company {

	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public String toString() {
		return String.format("[Company:%s]", this.name);
	}
}
