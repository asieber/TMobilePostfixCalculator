package com.tmobile.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixCalculatorTest {
	
	@Test
	public void testEvaulateSumInteger() {
		assertEquals(3.0, PostfixCalculator.evaluateExpression("1 2 +"), 0.001);
	}
	
	@Test
	public void testEvaulateSumDouble() {
		assertEquals(9.75, PostfixCalculator.evaluateExpression("4.5 5.25 +"), 0.001);
	}
	
	@Test
	public void testEvaulateDifferenceInteger() {
		assertEquals(-1.0, PostfixCalculator.evaluateExpression("1 2 -"), 0.001);
	}
	
	@Test
	public void testEvaulateDifferenceDouble() {
		assertEquals(-0.75, PostfixCalculator.evaluateExpression("4.5 5.25 -"), 0.001);
	}
	
	@Test
	public void testEvaulateProductInteger() {
		assertEquals(2.0, PostfixCalculator.evaluateExpression("1 2 *"), 0.001);
	}
	
	@Test
	public void testEvaulateProductDouble() {
		assertEquals(52, PostfixCalculator.evaluateExpression("8 6.5 *"), 0.001);
	}
	
	@Test
	public void testEvaulateQuotientDouble() {
		assertEquals(25, PostfixCalculator.evaluateExpression("50 2 /"), 0.001);
	}
	
	@Test
	public void testEvaulateManyOperandsAndOperators() {
		assertEquals(-11.5, PostfixCalculator.evaluateExpression("3.5 2 + 4.25 4 * -"), 0.001);
	}
	
	@Test
	public void testConvertPostfixToInfix() {
		assertEquals("(3.5 + 2) - (4.25 * 4)", PostfixCalculator.convertPostfixToInfix("3.5 2 + 4.25 4 * -"));
	}

}
