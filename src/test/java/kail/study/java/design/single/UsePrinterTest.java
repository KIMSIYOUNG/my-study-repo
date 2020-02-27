package kail.study.java.design.single;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsePrinterTest {
	@Test
	void testdoSomething() {
		FakePrinter fake = new FakePrinter();
		UsePrinter use = new UsePrinter();
		use.doSomething(fake);
		assertThat("fakeGet").isEqualTo(fake.get());
	}
}