package org.tain.test.t03.test02;

public class TestMain {

	public static void main(String[] args) {
		Product<Car, String> product1 = new Product<>(new Car("SM5"), "Samsung");
		System.out.println(">>> product1: " + product1);
		
		Product<Tv, String> product2 = new Product<>(new Tv("LG-Smart"), "LG");
		System.out.println(">>> product2: " + product2);
	}
}
