package org.tain.test.t04.test01;

import org.tain.test.t04.common.Car;
import org.tain.test.t04.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		Box<Car> box1 = new Box<>(new Car("SM5"));
		System.out.println(">>> box1: " + box1);
		
		Box<Tv> box2 = new Box<>(new Tv("SmartTV"));
		System.out.println(">>> box2: " + box2);
		
		Box<?> box3 = new Box<>("Hello, world !!");
		System.out.println(">>> box3: " + box3);
		
		Box<?> box4 = new Box<>(new Car("K5"));
		System.out.println(">>> box4: " + box4);
	}
}
