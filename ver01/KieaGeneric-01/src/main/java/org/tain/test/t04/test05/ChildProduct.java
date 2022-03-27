package org.tain.test.t04.test05;

public class ChildProduct<T,M,C> extends Product<T,M>{

	private C company;
	
	public ChildProduct(T type, M model, C company) {
		super(type, model);
		this.company = company;
	}
	
	public C getCompany() { return this.company; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ChildProduct:");
		sb.append(super.toString());
		sb.append(",");
		sb.append(this.company);
		sb.append("]");
		return sb.toString();
	}
}
