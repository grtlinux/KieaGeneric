package org.tain.test.t06.test;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return String.format("[Worker:%s]", String.valueOf(super.toString()));
	}
}
