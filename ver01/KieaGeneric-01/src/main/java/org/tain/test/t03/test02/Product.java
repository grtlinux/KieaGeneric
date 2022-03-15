package org.tain.test.t03.test02;

public class Product<T, M> {

	private T kind;
	private M model;
	
	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(String.valueOf(this.kind));
		sb.append(":");
		sb.append(String.valueOf(this.model));
		sb.append("]");
		return sb.toString();
	}
}
