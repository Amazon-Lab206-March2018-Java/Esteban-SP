package com.poesteba.calculator;

import java.io.Serializable;

class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private Character operation;
	private double results;
	public Calculator() {  //initializes a Calculator object with default operands to be 0, default operation is '+'
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operation = '+';
	}
	public Calculator(double operand1, double operand2 ) {  // initializes a Calculator object with operands 1 and 2, and default operation as "+"
		this.operandOne = operand1;
		this.operandTwo = operand2;
		this.operation = '+';
	}
	public Calculator(double operand1, Character op, double operand2 ) { // initializes a Calculator object with operands 1 and 2, and custom operation '+' or '-'
		this.operandOne = operand1;
		this.operandTwo = operand2;
		this.operation = op;
	}
	public void performOperation() {
		double result = 0;
		if (operation == '+') {
			result = (operandOne + operandTwo);
		}else if (operation == '-') {
			result = (operandOne - operandTwo);
		}else if (operation == '*') {  // added option to multiply
			result = (operandOne * operandTwo);
		}else if (operation == '/') {  // added option to divide
			result = (operandOne / operandTwo);
		}
		results = result;
	}
	public double getResults() {
		return results;
	}
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public Character getOperation() {
		return operation;
	}
	public void setOperation(Character operation) {
		this.operation = operation;
	}
	
}
