package org.tain.test.t09.test;

public class Util {

	public static <T> Box<T> boxing(T type) {
		return new Box<>(type);
	}
	
	public static <K,V> Pair<K,V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
}
