package org.tain.test.t01.finalizeAttack;

public class Account {

	private String name;
	
	public Account(String name) throws Exception {
		this.name = name;
		
		if (this.name.equals("Hello")) {
			throw new Exception("Hello is not allowed..");
		}
		//this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public void transfer(long money, String to) {
		System.out.println(">>> transfer the money " + money + " to " + to);
	}
}
