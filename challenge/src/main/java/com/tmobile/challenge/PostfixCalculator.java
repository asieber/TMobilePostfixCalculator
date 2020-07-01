package com.tmobile.challenge;

import java.util.Stack;

public class PostfixCalculator {
	
	private static boolean isOperator(String term) {
		return ("+").equals(term);
	}
	
	public static double evaluateSum(String expression) {
		Stack<Double> operands = new Stack<Double>();
		String[] terms = expression.split(" ");
		for (String term : terms) {
			if (isOperator(term)) {
				//do operator stuff
				if (("+").equals(term)) {
					double num1 = operands.pop();
					double num2 = operands.pop();
					operands.push(num1 + num2);
				}
				//-,*,/
			}
			else {
				//do operand stuff
				operands.push(Double.parseDouble(term));
			}
		}
		return operands.pop();
	}

}
