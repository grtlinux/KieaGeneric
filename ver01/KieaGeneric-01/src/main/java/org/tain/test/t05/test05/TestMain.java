package org.tain.test.t05.test05;

import org.tain.test.t05.common.Car;
import org.tain.test.t05.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		ChildProduct<?,?,?> product = null;
		
		product = new ChildProduct<>(new Car("SM5"), "SamsungMoters", "Samsung");
		System.out.println(">>> product: " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LGD", "LG");
		System.out.println(">>> product: " + product);
		
		Storage<Car> carStorage = new StorageImpl<>("Car-storage");
		carStorage.add(new Car("SM5"));
		carStorage.add(new Car("K5"));
		carStorage.add(new Car("Sonata"));
		System.out.println(">>> carStorage: " + carStorage);
		
		Storage<Tv> tvStorage = new StorageImpl<>("TV-storage");
		tvStorage.add(new Tv("SmartTV"));
		tvStorage.add(new Tv("QLED"));
		System.out.println(">>> tvStorage: " + tvStorage);
		
		Storage<Car> storage = new StorageImpl<>("Car-storage");
		storage.add(new Car("SM5"));
	}
}
