package org.tain.test.t08.test;

import java.util.Vector;

public class StorageImpl<A> implements Storage<A>{

	private String name;
	private Vector<A> items;
	
	public StorageImpl(String name) {
		this.name = name;
		this.items = new Vector<A>();
	}
	
	public String getName() { return this.name; }
	public Vector<A> getItems() { return this.items; }
	
	@Override
	public void add(A a) {
		this.items.add(a);
	}
	@Override
	public A get(int index) {
		return this.items.get(index);
	}
	
	public String toString() {
		return String.format("[StorageImpl:%s,%s]", this.name, String.valueOf(this.items));
	}
}
