package org.tain.test.t02.test05;

import java.util.Arrays;

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
		System.out.println(">>> " + Arrays.toString(this.array));
		if (!Boolean.TRUE) {
			String seperator = ", ";
			sb.append("[");
			for (T item : array) {
				sb.append(String.valueOf(item));
				sb.append(seperator);
			}
			sb.setLength(sb.length() - seperator.length());
			//sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append("]");
		} else {
			sb.append("[");
			String prefix = "";
			for (T item : array) {
				sb.append(prefix);
				prefix = ",";
				sb.append(String.valueOf(item));
			}
			sb.append("]");
		}
		return sb.toString();
	}

}
