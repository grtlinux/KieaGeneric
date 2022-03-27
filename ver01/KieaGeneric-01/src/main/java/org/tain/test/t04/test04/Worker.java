package org.tain.test.t04.test04;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Worker:");
		sb.append(super.toString());
		sb.append("]");
		return sb.toString();
	}
}
