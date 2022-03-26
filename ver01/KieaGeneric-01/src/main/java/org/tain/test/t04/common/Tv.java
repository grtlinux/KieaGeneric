package org.tain.test.t04.common;

public class Tv {

	private String name;
	
	public Tv() { this.name = "NO_NAME"; }
	
	public Tv(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Tv:");
		sb.append(this.name);
		sb.append("]");
		return sb.toString();
	}
}
