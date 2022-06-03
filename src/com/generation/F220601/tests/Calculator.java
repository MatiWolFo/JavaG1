package com.generation.F220601.tests;

public class Calculator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int mult(int num1, int num2) {
		return num1 * num2;
	}
	public String div(int num1, int num2) {
		if (num2 != 0) {
			String quotient = Integer.toString(num1 / num2);
			return quotient;
		} else {
			return "Incorrect data.";
		}	
	}
	
	//modelar como objetos un usuario, profesor y un alumno (debe decir presente con test)
	//objetos, herencia, lista usuarios
	//11.45
}
