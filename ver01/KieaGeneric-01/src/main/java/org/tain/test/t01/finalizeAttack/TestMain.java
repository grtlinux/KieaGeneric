package org.tain.test.t01.finalizeAttack;

/**
 * URL: https://www.youtube.com/watch?v=6kNzL1bl1kI
 * 
 * @author kang-air
 *
 */
public class TestMain {

	public static void main(String[] args) throws Exception {
		Account account1 = new Account("kang");
		account1.transfer(12345, "kang2");
		
		//Account account2 = new Account("Hello");
		//account2.transfer(12345, "world");
		
		Account account = null;
		try {
			account = new BrokenAccount("Hello");
		} catch (Exception e) {
			System.out.println("get Exception: " + e.getMessage());
		}
		System.gc();
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
		
		account.transfer(123456, "world");
	}
}
