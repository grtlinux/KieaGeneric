package org.tain.test.t03.test03;

public class Box<T> {

	private T type;
	
	public Box(T type) {
		this.type = type;
	}
	
	public void setType(T type) { this.type = type; }
	public T getType() { return this.type; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("Box");
		sb.append(":");
		sb.append(String.valueOf(this.type));
		sb.append("]");
		return sb.toString();
	}
}
