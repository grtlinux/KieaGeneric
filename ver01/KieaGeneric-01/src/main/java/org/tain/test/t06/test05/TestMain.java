package org.tain.test.t06.test05;

import org.tain.test.t06.common.Car;
import org.tain.test.t06.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		ChildProduct<?,?,?> product = null;
		product = new ChildProduct<>(new Car("K5"), "KIA", "KIA moters");
		System.out.println(">>> " + product);
		
		product = new ChildProduct<>(new Tv("SmartTV"), "LG", "LGD");
		System.out.println(">>> " + product);
		
		StorageImpl<Car> carStorage = new StorageImpl<>("Car-Storage");
		carStorage.add(new Car("SM5"));
		carStorage.add(new Car("K5"));
		carStorage.add(new Car("QM6"));
		carStorage.add(new Car("Sonata"));
		System.out.println(">>> " + carStorage);
		
		StorageImpl<Tv> tvStorage = new StorageImpl<>("Tv-Storage");
		tvStorage.add(new Tv("SmartTV"));
		tvStorage.add(new Tv("QLED"));
		System.out.println(">>> " + tvStorage);
	}
}
