package org.tain.test.t02.test02;

public class Product<T, M> {

	private T kind;
	private String model;
	
	public Product() {}
	
	public Product(T kind, String model) {
		this.kind = kind;
		this.model = model;
	}
	
	public T getKind() { return this.kind; }
	public String getModel() { return this.model; }
	
	public String toString() {
		return String.format("[%s:%s]", String.valueOf(this.kind), this.model);
	}
}
