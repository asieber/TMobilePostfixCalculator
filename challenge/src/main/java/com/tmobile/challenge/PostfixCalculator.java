package com.tmobile.challenge;

import java.util.Stack;

public class PostfixCalculator {
	
	private static boolean isOperator(String term) {
		return "+".equals(term) || "-".equals(term) || "*".equals(term) || "/".equals(term);
	}
	
	public static double evaluateSum(String expression) {
		Stack<Double> operands = new Stack<Double>();
		String[] terms = expression.split(" ");
		for (String term : terms) {
			if (isOperator(term)) {
				//do operator stuff
				if ("+".equals(term)) {
					operands.push(operands.pop() + operands.pop());
				}
				if ("-".equals(term)) {
					operands.push(-operands.pop() + operands.pop());
				}
				if ("*".equals(term)) {
					operands.push(operands.pop() * operands.pop());
				}
				if ("/".equals(term)) {
					double denominator = operands.pop();
					operands.push(operands.pop() / denominator);
				}
			}
			else {
				//do operand stuff
				operands.push(Double.parseDouble(term));
			}
		}
		return operands.pop();
	}

}
