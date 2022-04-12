package org.tain.test.t07.test;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
	
	public String toString() {
		return String.format("[Worker:%s]", super.toString());
	}
}
