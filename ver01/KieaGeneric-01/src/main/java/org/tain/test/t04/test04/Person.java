package org.tain.test.t04.test04;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Person:");
		sb.append(this.name);
		sb.append("]");
		return sb.toString();
	}
}
