package org.tain.test.t08.test;

public interface Storage<A> {

	public void add(A a);
	public A get(int index);
}
