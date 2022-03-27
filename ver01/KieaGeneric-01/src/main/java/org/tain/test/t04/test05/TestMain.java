package org.tain.test.t04.test05;

import org.tain.test.t04.common.Car;
import org.tain.test.t04.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		ChildProduct<?,?,?> product = null;
		product = new ChildProduct<>(new Car("SM5"), "SamsungMoters", "Samsung");
		System.out.println(">> product: " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LGD", "LG");
		System.out.println(">>> product: " + product);
		
		Storage<Car> storage = null;
		storage = new StorageImpl<>("Car-storage");
		storage.add(new Car("SM5"));
		storage.add(new Car("SM6"));
		storage.add(new Car("K5"));
		storage.add(new Car("K9"));
		System.out.println(">> storage: " + storage);
		
		storage = new StorageImpl<>("Tv-storage");
		storage.add(new Car("SmartTV"));
		storage.add(new Car("QLED"));
		System.out.println(">>> storage: " + storage);
	}
}
