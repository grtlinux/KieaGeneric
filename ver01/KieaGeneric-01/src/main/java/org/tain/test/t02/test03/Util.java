package org.tain.test.t02.test03;

public class Util {

	public static <T> Box<T> boxing(T t) {
		return new Box<>(t);
	}
	
	public static <K, V> Pair<K, V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
	
	public static <K,V> boolean equals(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
