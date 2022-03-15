package org.tain.test.t03.test03;

public class TestMain {

	public static void main(String[] args) {
		testBox();
		testEquals();
		testCompare();
	}
	
	private static void testBox() {
		Box<Car> box1 = new Box<>(new Car("SM5"));
		System.out.println(">>> box1: " + box1);
		
		Box<Tv> box2 = new Box<>(new Tv("LG"));
		System.out.println(">>> box2: " + box2);
		
		Box<String> box3 = Util.<String>boxing("Hello, world");
		System.out.println(">>> box3: " + box3);
	}
	
	private static void testEquals() {
		Pair<Integer, String> p1 = new Pair<>(123, "Apple");
		Pair<Integer, String> p2 = Util.<Integer, String>pairing(123, "Apple");
		System.out.println(">>> equals1: " + Util.<Integer, String>equals(p1, p2));
		
		Pair<String, String> p3 = new Pair<>("user3", "Apple");
		Pair<String, String> p4 = Util.pairing("user4", "Apple");
		System.out.println(">>> equals2: " + Util.equals(p3, p4));
	}
	
	private static void testCompare() {
		System.out.println(">>> test1: " + Util.<Integer>compare(3, 7));
		System.out.println(">>> test2: " + Util.compare(3.3, (double) 1.1));
	}
}
