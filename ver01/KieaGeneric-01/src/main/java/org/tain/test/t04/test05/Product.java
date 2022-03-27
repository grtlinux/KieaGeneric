package org.tain.test.t04.test05;

public class Product<T,M> {

	private T type;
	private M model;
	
	public Product(T type, M model) {
		this.type = type;
		this.model = model;
	}
	
	public T getType() { return this.type; }
	public M getModel() { return this.model; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Product:");
		sb.append(this.type);
		sb.append(",");
		sb.append(this.model);
		sb.append("]");
		return sb.toString();
	}
}
