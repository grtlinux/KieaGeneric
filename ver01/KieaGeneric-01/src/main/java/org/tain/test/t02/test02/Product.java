package org.tain.test.t02.test02;

public class Product<T, M> {

	private T kind;
	private M model;
	
	public Product() {}
	
	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public String toString() {
		return String.format("[%s:%s]", String.valueOf(this.kind), this.model);
	}
}
