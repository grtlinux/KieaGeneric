package org.tain.test.t05.common;

public class Tv {

	private String name;
	
	public Tv(String name) {
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public String toString() {
		return String.format("[Tv:%s]", this.name);
	}
}
