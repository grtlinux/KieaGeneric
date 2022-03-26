package org.tain.test.t04.test02;

import org.tain.test.t04.common.Car;
import org.tain.test.t04.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		Product<?,?> product1 = new Product<>(new Car("SM5"), "Samsung");
		System.out.println(">>> product1: " + product1);
		
		Product<?,?> product2 = new Product<>(new Tv("SmartTV"), "LG");
		System.out.println(">>> product2: " + product2);
		
		Product<Car,String> product3 = new Product<>();
		product3.setType(new Car("K5"));
		product3.setModel("KIA");
		System.out.println(">>> product3: " + product3);
	}
}
