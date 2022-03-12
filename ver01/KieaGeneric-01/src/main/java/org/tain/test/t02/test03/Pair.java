package org.tain.test.t02.test03;

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
	
	public String toString() {
		return String.format("[%s:%s]"
				, String.valueOf(this.key)
				, String.valueOf(this.value)
		);
	}
}
