package org.tain.test.t01.sample05;

public class HeredityExampleMain {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product1 = new ChildProduct<>();
		product1.setKind(new Tv());
		product1.setModel("Samsung Tv");
		product1.setCompany("Samsung");
		System.out.println(">>> product1: " + product1);
		
		Storage<Tv> storage1 = new StorageImpl<Tv>(10);
		storage1.add(new Tv(), 0);
		System.out.println(">>> storage1[0]: " + storage1.get(0));
		
		ChildProduct<Car, String, String> product2 = new ChildProduct<>(new Car(), "K5", "KIA");
		System.out.println(">>> product2: " + product2);
	}
}
