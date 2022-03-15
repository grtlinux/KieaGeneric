package org.tain.test.t03.test02;

public class Car {

	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("[Car:%s]", this.name);
	}
}
