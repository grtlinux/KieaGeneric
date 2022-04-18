package org.tain.test.t08.test;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public String toString() {
		return String.format("[Person:%s]", this.name);
	}
}
