package org.tain.test.t01.sample03;

public class Box<T> {

	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public String toString() {
		return String.valueOf(t);
	}
}
