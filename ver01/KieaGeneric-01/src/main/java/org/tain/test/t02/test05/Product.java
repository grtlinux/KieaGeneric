package org.tain.test.t02.test05;

public class Product<T, M> {

	private T kind;
	private M model;
	
	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public String toString() {
		return "[" + String.valueOf(this.kind)
			+ ":" + String.valueOf(this.model) + "]";
	}
}
