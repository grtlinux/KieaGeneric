package org.tain.test.t08.test;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	public String toString() {
		return String.format("[Student:%s]", super.toString());
	}
}
