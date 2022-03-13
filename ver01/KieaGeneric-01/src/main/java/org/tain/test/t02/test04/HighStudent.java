package org.tain.test.t02.test04;

public class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}
	
	public String toString() {
		return "HighStudent:" + this.getName();
	}
}
