package org.tain.test.t03.test05;

public interface Storage<T> {

	public void add(T t, int index);
	public T get(int index);
}
