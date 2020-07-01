package com.tmobile.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixCalculatorTest {
	
	@Test
	public void testEvaulateSumInteger() {
		assertEquals(3.0, PostfixCalculator.evaluateSum("1 2 +"), 0.001);
	}
	
	@Test
	public void testEvaulateSumDouble() {
		assertEquals(9.75, PostfixCalculator.evaluateSum("4.5 5.25 +"), 0.001);
	}
	
	@Test
	public void testEvaulateDifferenceInteger() {
		assertEquals(-1.0, PostfixCalculator.evaluateSum("1 2 -"), 0.001);
	}
	
	@Test
	public void testEvaulateDifferenceDouble() {
		assertEquals(-0.75, PostfixCalculator.evaluateSum("4.5 5.25 -"), 0.001);
	}
	
	@Test
	public void testEvaulateProductInteger() {
		assertEquals(2.0, PostfixCalculator.evaluateSum("1 2 *"), 0.001);
	}
	
	@Test
	public void testEvaulateProductDouble() {
		assertEquals(52, PostfixCalculator.evaluateSum("8 6.5 *"), 0.001);
	}
	
	@Test
	public void testEvaulateQuotientDouble() {
		assertEquals(25, PostfixCalculator.evaluateSum("50 2 /"), 0.001);
	}

}
