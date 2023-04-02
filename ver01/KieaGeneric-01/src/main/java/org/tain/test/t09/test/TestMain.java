package org.tain.test.t09.test;

public class TestMain {

	public static void main(String[] args) throws Exception {
		System.out.println(">>> main : <<<");
		
		if (Boolean.TRUE) test01();
	}
	
	@SuppressWarnings("unused")
	private static void test01() throws Exception {
		System.out.println("--- test01 : ---");
		
		Box<?> box = null;
		Pair<?,?> pair = null;
		
		System.out.println(">>> " + new Box<>(new Car("SM5")));
		System.out.println(">>> " + new Box<>(new Tv("SmartTV")));
		
		System.out.println(">>> " + Util.boxing(new Car("Sonata")));
		System.out.println(">>> " + Util.boxing(new Tv("QLED")));
		
		System.out.println(">>> " + new Pair<>("foo", new Car("QM5")));
		System.out.println(">>> " + Util.pairing("bar", new Tv("LED")));
	}
}
