package org.tain.test.t03.test05;

public class TestMain {

	public static void main(String[] args) {
		ChildProduct<Car,String,String> product1 = new ChildProduct<>(new Car("SM5"), "Samsung", "Samsung moters");
		System.out.println(">>> product1: " + product1);
		
		ChildProduct<Tv,String,String> product2 = new ChildProduct<>(new Tv("SmartTV"), "LG", "LG company");
		System.out.println(">>> product2: " + product2);
		
		Storage<Tv> storage1 = new StorageImpl<>("TV-storage", 5);
		storage1.add(new Tv("LG-Smart"), 3);
		System.out.println(">>> storage1: " + storage1);
	}
}
