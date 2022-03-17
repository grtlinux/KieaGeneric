package org.tain.test.t03.test04;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Student:");
		sb.append(super.toString());
		sb.append("]");
		return sb.toString();
	}
}
