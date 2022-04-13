package org.tain.test.t07.test;

public interface Storage<T> {

	public void add(T type);
	public T get(int index);
}
