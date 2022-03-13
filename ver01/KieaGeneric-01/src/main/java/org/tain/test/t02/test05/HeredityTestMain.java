package org.tain.test.t02.test05;

public class HeredityTestMain {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product1 = new ChildProduct<>(new Tv(), "LG Smart", "LG");
		System.out.println(">>> product1: " + product1);
		
		ChildProduct<Car, String, String> product2 = new ChildProduct<>(new Car(), "K9", "KIA");
		System.out.println(">>> product2: " + product2);
		
		Storage<Tv> storage = new StorageImpl<>(10);
		storage.add(new Tv(), 3);
		System.out.println(">>> storage: " + storage);
	}
}
