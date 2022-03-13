package org.tain.test.t02.test04;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
	
	public String toString() {
		return "Worker:" + this.getName();
	}
}
