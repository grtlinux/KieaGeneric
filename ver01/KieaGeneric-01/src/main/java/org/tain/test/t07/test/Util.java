package org.tain.test.t07.test;

public class Util {

	public static <T> Box<T> boxing(T type) {
		return new Box<>(type);
	}
	
	public static <K,V> Pair<K,V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
	
	public static <T> boolean equals(Box<T> b1, Box<T> b2) {
		return String.valueOf(b1).equals(String.valueOf(b2));
	}
	
	public static <K,V> boolean equals(Pair<K,V> p1, Pair<K,V> p2) {
		return String.valueOf(p1).equals(String.valueOf(p2));
	}
	
	public static <N extends Number>int compare(N n1, N n2) {
		double d1 = n1.doubleValue();
		double d2 = n2.doubleValue();
		return Double.compare(d1, d2);
	}
	
	///////////////////////////////////////////////////////
	
	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course);
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course);
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course);
	}
}
