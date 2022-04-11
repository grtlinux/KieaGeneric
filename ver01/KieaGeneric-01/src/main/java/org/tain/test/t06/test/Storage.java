package org.tain.test.t06.test;

public interface Storage<T> {

	public void add(T type);
	public T get(int index);
}
