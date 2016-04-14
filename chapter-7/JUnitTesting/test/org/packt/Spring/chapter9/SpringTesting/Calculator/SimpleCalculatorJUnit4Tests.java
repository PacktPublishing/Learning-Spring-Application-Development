package org.packt.Spring.chapter9.SpringTesting.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorJUnit4Tests {

	private SimpleCalculator simpleCalculator;

	@Before
	public void init() {
		simpleCalculator = new SimpleCalculatorImpl();
	}

	@Test
	public void verifyAdd() {
		long sum = simpleCalculator.add(3, 7);
		assertEquals(10, sum);
	}
	
	@Test
	public void verifyAddFail() {
		long sum = simpleCalculator.add(3, 7);
		assertEquals(11, sum);
	}
}
