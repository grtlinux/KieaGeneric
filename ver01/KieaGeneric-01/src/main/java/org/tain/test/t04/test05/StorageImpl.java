package org.tain.test.t04.test05;

import java.util.Vector;

public class StorageImpl<T> implements Storage<T>{

	private String name;
	private Vector<T> items;
	
	public StorageImpl(String name) {
		this.name = name;
		this.items = new Vector<>();
	}
	
	public String getName() { return this.name; }
	public Vector<?> getItems() { return this.items; }
	
	@Override
	public void add(T type) {
		this.items.add(type);
	}

	@Override
	public T get(int index) {
		return this.items.get(index);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(this.name);
		sb.append(":");
		String seperator = ",";
		this.items.stream().forEach(itm -> {
			sb.append(itm);
			sb.append(seperator);
		});
		sb.setLength(sb.length() - seperator.length());
		sb.append("]");
		return sb.toString();
	}
}
