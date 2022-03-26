package org.tain.test.t04.test03;

public class Util {

	public static <T> Box<T> boxing(T type) {
		return new Box<>(type);
	}
	
	public static <K,V> Pair<K,V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
	
	public static <K,V> boolean equals(Pair<?,?> p1, Pair<?,?> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
		return keyCompare && valueCompare;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
}
