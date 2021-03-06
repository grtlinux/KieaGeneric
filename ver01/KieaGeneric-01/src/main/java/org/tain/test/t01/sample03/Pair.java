package org.tain.test.t01.sample03;

public class Pair<K, V> {

	private K key;
	private V value;
	
	public Pair() {}
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public String toString() {
		return "[" + String.valueOf(key) + ":" + String.valueOf(value) + "]";
	}
}
