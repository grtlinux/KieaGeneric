package org.tain.test.t06.test05;

public class ChildProduct<T,M,C> extends Product<T,M> {

	private C company;
	
	public ChildProduct(T type, M model, C company) {
		super(type, model);
		this.company = company;
	}
	
	public C getCompany() { return this.company; }
	
	public String toString() {
		return String.format("[ChildProduct:%s,%s]", super.toString(), this.company);
	}
}
