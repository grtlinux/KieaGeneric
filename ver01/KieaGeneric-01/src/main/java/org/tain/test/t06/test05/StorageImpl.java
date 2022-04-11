package org.tain.test.t06.test05;

import java.util.Vector;

public class StorageImpl<T> implements Storage<T>{

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
		return this.get(index);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String seperator = ",";
		
		sb.append(String.format("[StorageImpl:%s,", this.name));
		for (T type : this.vector) {
			sb.append(String.valueOf(type)).append(seperator);
		}
		sb.setLength(sb.length() - seperator.length());
		sb.append("]");
		
		return sb.toString();
	}
}
