package org.tain.test.t05.test04;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
	
	public String toString() {
		return String.format("[Worker:%s]", super.toString());
	}
}
