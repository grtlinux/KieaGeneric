package org.tain.test.t01.sample01;

public class BoxExampleMain {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("Hello");
		System.out.println(">>>>> box1: " + box1.get());
		
		Box<Integer> box2 = new Box<>();
		box2.set(1234567);
		System.out.println(">>>>> box2: " + box2.get());
	}
}
