package org.tain.test.t01.finalizeAttack;

public class BrokenAccount extends Account {

	public BrokenAccount(String name) throws Exception {
		super(name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		@SuppressWarnings("unused")
		Account account = null;
		try {
			account = new BrokenAccount("Hello");
		} catch (Exception e) {
			System.out.println("get Exception: " + e.getMessage());
		}
		System.gc();
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
		
		//this.transfer(123456, "world");
	}
}
