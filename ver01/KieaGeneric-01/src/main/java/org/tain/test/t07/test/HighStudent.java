package org.tain.test.t07.test;

public class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}
	
	public String toString() {
		return String.format("[HighStudent:%s]", super.toString());
	}
}
