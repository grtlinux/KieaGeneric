package org.tain.test.t03.test01;

public class TestMain {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>("Hello, world");
		System.out.println(">>> box1: " + box1);
		
		Box<Car> box2 = new Box<>(new Car("SM5"));
		System.out.println(">>> box2: " + box2);
		
		Box<Tv> box3 = new Box<>(new Tv("LG smart"));
		System.out.println(">>> box3: " + box3);
		
		Box<Integer> box4 = new Box<>(1234567);
		System.out.println(">>> box4: " + box4);
	}
}
