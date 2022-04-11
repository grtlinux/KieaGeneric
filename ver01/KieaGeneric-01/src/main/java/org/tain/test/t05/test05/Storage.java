package org.tain.test.t05.test05;

public interface Storage<T> {

	public void add(T type);
	public T get(int index);
}
