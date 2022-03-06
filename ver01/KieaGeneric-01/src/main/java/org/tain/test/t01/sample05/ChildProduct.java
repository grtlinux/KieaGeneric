package org.tain.test.t01.sample05;

public class ChildProduct<T, M, C> extends Product<T, M> {

	private C company;
	
	public C getCompany() {
		return this.company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(String.valueOf(this.getKind())).append(":");
		sb.append(String.valueOf(this.getModel())).append(":");
		sb.append(String.valueOf(this.getCompany()));
		sb.append("]");
		return sb.toString();
	}
}
