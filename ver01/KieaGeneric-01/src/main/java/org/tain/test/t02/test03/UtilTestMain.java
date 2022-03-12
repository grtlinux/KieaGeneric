package org.tain.test.t02.test03;

public class UtilTestMain {

	public static void main(String[] args) {
		testBox();
		testEquals();
		testBounded();
	}
	
	private static void testBox() {
		Box<String> box1 = Util.<String>boxing("Hello, world");
		System.out.println(">>> box1: " + box1);
		
		Box<Integer> box2 = Util.boxing(1234567);
		System.out.println(">>> box2: " + box2);
	}
	
	private static void testEquals() {
		Pair<Integer, String> p1 = new Pair<>(1, "Apple");
		Pair<Integer, String> p2 = Util.<Integer,String>pairing(1, "Apple");
		if (Util.<Integer,String>equals(p1, p2)) {
			System.out.println(">>>> equals: " + p1 + " = " + p2);
		} else {
			System.out.println(">>>> not equals: " + p1 + " != " + p2);
		}
		
		Pair<String, String> p3 = new Pair<>("user3", "Apple");
		Pair<String, String> p4 = Util.pairing("user4", "Apple");
		if (Util.equals(p3, p4)) {
			System.out.println(">>>> equals: " + p3 + " = " + p4);
		} else {
			System.out.println(">>>> not equals: " + p3 + " != " + p4);
		}
	}
	
	private static void testBounded() {
		System.out.println(">>> test1: " + Util.<Integer>compare(3, 7));
		System.out.println(">>> test2: " + Util.compare(3.3, (double) 1.1));
	}
}
