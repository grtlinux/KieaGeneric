package org.tain.test.t06.test;

public class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return String.format("[HighStudent:%s]", String.valueOf(super.toString()));
	}
}
