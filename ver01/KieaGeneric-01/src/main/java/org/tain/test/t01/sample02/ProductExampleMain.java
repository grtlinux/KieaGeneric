package org.tain.test.t01.sample02;

public class ProductExampleMain {

	public static void main(String[] args) {
		Product<Car, String> product1 = new Product<>();
		product1.setKind(new Car());
		product1.setModel("SM5");
		System.out.println(">>> product1: " + product1);
		
		Product<Tv, String> product2 = new Product<>();
		product2.setKind(new Tv());
		product2.setModel("Samsung");
		System.out.println(">>> product2: " + product2);
	}
}
