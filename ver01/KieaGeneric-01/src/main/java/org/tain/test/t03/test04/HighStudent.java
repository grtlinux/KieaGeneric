package org.tain.test.t03.test04;

public class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[HighStudent:");
		sb.append(super.toString());
		sb.append("]");
		return sb.toString();
	}
}
