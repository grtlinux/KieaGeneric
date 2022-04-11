package org.tain.test.t06.test03;

import org.tain.test.t06.common.Car;
import org.tain.test.t06.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		testBox();
		testPair();
		testEquals();
		testCompare();
	}
	
	private static void testBox() {
		Box<?> box = null;
		
		box = new Box<>(new Car("SM5"));
		System.out.println(">>> box: " + box);
		
		box = new Box<>(new Tv("SmartTV"));
		System.out.println(">>> box: " + box);
		
		box = Util.boxing(new Car("K5"));
		System.out.println(">>> box: " + box);
		
		box = Util.boxing("Hello, world !!");
		System.out.println(">>> box: " + box);
	}
	
	private static void testPair() {
		Pair<?,?> pair = null;
		
		pair = new Pair<>("Samsung", new Car("SM5"));
		System.out.println(">>> pair: " + pair);
		
		pair = new Pair<>("LG", new Car("SmartTV"));
		System.out.println(">>> pair: " + pair);
		
		pair = Util.pairing("KIA", new Car("K5"));
		System.out.println(">>> pair: " + pair);
	}
	
	private static void testEquals() {
		Pair<?,?> p1 = null;
		Pair<?,?> p2 = null;
		
		p1 = Util.pairing("KIA", new Car("K5"));
		p2 = Util.pairing("KIA", new Car("K5"));
		System.out.println(">>> equals: " + Util.equals(p1, p2));
		
		p1 = Util.pairing("KIA", new Car("K5"));
		p2 = Util.pairing("KIA", new Car("SM5"));
		System.out.println(">>> equals: " + Util.equals(p1, p2));
	}
	
	private static void testCompare() {
		Box<Integer> b1 = Util.boxing(new Integer(1));
		Box<Double> b2 = Util.boxing(new Double(1.1));
		System.out.println(">>> compare: " + Util.compare(b1.getType(), b2.getType()));
		
		System.out.println(">>> compare: " + Util.compare(1, 1.0));
	}
	
}
