package org.tain.test.t06.test;

public class Tv {

	private String name;
	
	public Tv(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("[Tv:%s]", this.name);
	}
}
