package org.tain.test.t01.sample05;

public interface Storage<T> {

	public void add(T item, int index);
	public T get(int index);
}
