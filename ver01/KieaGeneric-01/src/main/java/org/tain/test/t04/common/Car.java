package org.tain.test.t04.common;

public class Car {

	private String name;
	
	public Car() { this.name = "NO_NAME"; }
	
	public Car(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Car:");
		sb.append(this.name);
		sb.append("]");
		return sb.toString();
	}
}
