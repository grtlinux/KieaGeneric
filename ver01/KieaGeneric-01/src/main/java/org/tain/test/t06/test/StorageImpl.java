package org.tain.test.t06.test;

import java.util.Vector;

public class StorageImpl<T> implements Storage<T> {

	private String name;
	private Vector<T> vector;
	
	public StorageImpl(String name) {
		this.name = name;
		this.vector = new Vector<>();
	}
	
	@Override
	public void add(T type) {
		this.vector.add(type);
	}

	@Override
	public T get(int index) {
		return this.vector.get(index);
	}

	public String toString() {
		return String.format("[StorageImpl:%s,%s]", this.name, this.vector);
	}
}
