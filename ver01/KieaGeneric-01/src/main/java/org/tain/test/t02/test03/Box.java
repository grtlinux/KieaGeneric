package org.tain.test.t02.test03;

public class Box<T> {

	private T t;
	
	public Box() {}
	
	public Box(T t) {
		this.t = t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
	
	public String toString() {
		return String.valueOf(this.t);
	}
}
