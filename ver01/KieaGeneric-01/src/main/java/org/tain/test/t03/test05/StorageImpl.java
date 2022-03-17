package org.tain.test.t03.test05;

import java.util.Arrays;

public class StorageImpl<T> implements Storage<T> {

	private String name;
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public StorageImpl(String name, int capacity) {
		this.name = name;
		this.array = (T[]) new Object[capacity];
	}
	
	@Override
	public void add(T t, int index) {
		this.array[index] = t;
	}

	@Override
	public T get(int index) {
		return this.array[index];
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(this.name);
		sb.append(":");
		sb.append(Arrays.toString(this.array));
		sb.append("]");
		return sb.toString();
	}

}
