package com.tmobile.challenge;

import java.util.Stack;

public class PostfixCalculator {
	
	private static boolean isOperator(String term) {
		return "+".equals(term) || "-".equals(term) || "*".equals(term) || "/".equals(term);
	}
	
	public static double evaluateExpression(String expression) {
		Stack<Double> operands = new Stack<Double>();
		String[] terms = expression.split(" ");
		for (String term : terms) {
			if (isOperator(term)) {
				//do operator stuff
				if ("+".equals(term)) {
					operands.push(operands.pop() + operands.pop());
				}
				else if ("-".equals(term)) {
					operands.push(-operands.pop() + operands.pop());
				}
				else if ("*".equals(term)) {
					operands.push(operands.pop() * operands.pop());
				}
				else if ("/".equals(term)) {
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
	
	public static String convertPostfixToInfix(String expression) {
		Stack<String> expressions = new Stack<String>();
		String[] terms = expression.split(" ");
		for (String term : terms) {
			if (isOperator(term)) {
				//do operator stuff
				if ("+".equals(term)) {
					String second = expressions.pop();
					expressions.push("(" + expressions.pop() + " + " + second + ")");
				}
				else if ("-".equals(term)) {
					String second = expressions.pop();
					expressions.push("(" + expressions.pop() + " - " + second + ")");
				}
				else if ("*".equals(term)) {
					String second = expressions.pop();
					expressions.push("(" + expressions.pop() + " * " + second + ")");
				}
				else if ("/".equals(term)) {
					String denominator = expressions.pop();
					expressions.push("(" + expressions.pop() + " / " + denominator + ")");
				}
			}
			else {
				//do operand stuff
				expressions.push(term);
			}
		}
		String result = expressions.pop();
		return result.substring(1, result.length()-1);
	}

}
