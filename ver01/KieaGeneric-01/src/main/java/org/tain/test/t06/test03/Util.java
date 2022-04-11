package org.tain.test.t06.test03;

public class Util {

	public static <T> Box<T> boxing(T type) {
		return new Box<>(type);
	}
	
	public static <K,V> Pair<K,V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
	
	public static boolean equals(Box<?> b1, Box<?> b2) {
		return String.valueOf(b1).equals(String.valueOf(b2));
	}
	
	public static boolean equals(Pair<?,?> p1, Pair<?,?> p2) {
		return String.valueOf(p1).equals(String.valueOf(p2));
	}
	
	public static <N extends Number> int compare(N n1, N n2) {
		double d1 = n1.doubleValue();
		double d2 = n2.doubleValue();
		return Double.compare(d1, d2);
	}
	
	
}
