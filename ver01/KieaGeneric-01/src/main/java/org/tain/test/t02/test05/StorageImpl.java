package org.tain.test.t02.test05;

public class StorageImpl<T> implements Storage<T> {

	private T[] array;
	
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}
	
	@Override
	public void add(T item, int index) {
		this.array[index] = item;
	}

	@Override
	public T get(int index) {
		return this.array[index];
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (T item : array) {
			sb.append(String.valueOf(item));
			sb.append(",");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append("]");
		return sb.toString();
	}

}
