package org.tain.test.t06.test05;

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
		return String.format("[Product:%s,%s]", String.valueOf(this.type), String.valueOf(this.model));
	}
}
