package org.tain.test.t06.test;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return String.format("[Student:%s]", String.valueOf(super.toString()));
	}
}
