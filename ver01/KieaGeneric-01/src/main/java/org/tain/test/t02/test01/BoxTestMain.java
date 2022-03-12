package org.tain.test.t02.test01;

public class BoxTestMain {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>("Hello, world");
		System.out.println(">>> box1: " + box1);
		
		Box<Integer> box2 = new Box<>(123456);
		System.out.println(">>> box2: " + box2);
	}
}
