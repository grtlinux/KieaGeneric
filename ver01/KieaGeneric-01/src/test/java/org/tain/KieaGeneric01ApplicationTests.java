package org.tain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.tain.test.t01.finalizeAttack.Account;
import org.tain.test.t01.finalizeAttack.BrokenAccount;

@SpringBootTest
class KieaGeneric01ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void Hello() {
		Account account = null;
		try {
			account = new BrokenAccount("Hello");
		} catch (Exception e) {
			System.out.println("get Exception: " + e.getMessage());
		}
		System.gc();
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
	}

}
