package org.tain.test.t06.common;

public class Tv {

	private String name;
	
	public Tv(String name) {
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public String toString() {
		return String.format("[Car:%s]", this.name);
	}
}
