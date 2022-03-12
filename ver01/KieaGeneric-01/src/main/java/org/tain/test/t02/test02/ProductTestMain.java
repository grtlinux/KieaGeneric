package org.tain.test.t02.test02;

public class ProductTestMain {

	public static void main(String[] args) {
		Product<Car, String> product1 = new Product<>(new Car(), "K9");
		System.out.println(">>> product1: " + product1);
		
		Product<Tv, String> product2 = new Product<>(new Tv(), "LG smart");
		System.out.println(">>> product2: " + product2);
	}
}
