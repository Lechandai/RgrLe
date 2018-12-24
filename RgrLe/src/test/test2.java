package test;

import static org.junit.Assert.*;
import pack.MetodCalc;

public class test2 {

	@org.junit.Test
	public void testPlus() {
		MetodCalc mc = new MetodCalc();
		double res = mc.calc(20, "+", 10);
		assertEquals(Double.toString(30), Double.toString(res));
	}

	@org.junit.Test
	public void test_Minus() {
		MetodCalc mc = new MetodCalc();
		double res = mc.calc(20, "-", 1);
		assertEquals(Double.toString(19), Double.toString(res));
	}

	@org.junit.Test
	public void test_Multiply() {
		MetodCalc mc = new MetodCalc();
		double res = mc.calc(1, "*", 1);
		assertEquals(Double.toString(1), Double.toString(res));
	}

	@org.junit.Test
	public void test_Divide() {
		MetodCalc mc = new MetodCalc();
		double res = mc.calc(25, "/", 25);
		assertEquals(Double.toString(1), Double.toString(res));
	}
}
