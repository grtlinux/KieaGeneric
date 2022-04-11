package org.tain.test.t05.test05;

import java.util.Vector;

public class StorageImpl<T> implements Storage<T>{

	private String name;
	private Vector<T> vector;
	
	public StorageImpl(String name) {
		this.name = name;
		this.vector = new Vector<>();
	}
	
	public String getName() {
		return this.name;
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
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("[StorageImpl:%s,", this.name));
		String seperator = "";
		for (T type : this.vector) {
			sb.append(seperator);
			sb.append(String.valueOf(type));
			seperator = ",";
		}
		sb.append("]");
		
		return sb.toString();
	}
}
