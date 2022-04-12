package org.tain.test.t07.test;

public class Pair<K,V> {

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return this.key; }
	public V getValue() { return this.value; }
	
	public String toString() {
		return String.format("[Pair:%s,%s]", String.valueOf(this.key), String.valueOf(this.value));
	}
}
