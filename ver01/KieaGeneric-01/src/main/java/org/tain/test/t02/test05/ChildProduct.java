package org.tain.test.t02.test05;

public class ChildProduct<T, M, C> extends Product<T, M> {

	private C company;
	
	public ChildProduct(T kind, M model, C company) {
		super(kind, model);
		this.company = company;
	}
	
	public void setCompany(C company) { this.company = company; }
	public C getCompany() { return this.company; }
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(super.toString());
		sb.append(this.company);
		sb.append("]");
		return sb.toString();
	}
}
