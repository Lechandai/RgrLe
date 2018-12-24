package test;

import static org.junit.Assert.*;
import org.junit.Test;
import pack.tax;

public class test {

	tax tax = new tax();

	@Test
	public void testTax() throws InterruptedException {

		double res = tax.calcTax(600000, 3, 14);
		double toch = 83188.00000000001;
		assertEquals(Double.toString(res), Double.toString(toch));
	}
}
