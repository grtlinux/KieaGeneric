package org.tain.test.t02.test04;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	public String toString() {
		return "Student:" + this.getName();
	}
}
