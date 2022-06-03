package com.generation.F220601.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//PRPJECT > New > JUnit Test Case > choose name > Browse Package... > Finish
//based on TDD methodology
class CalculatorTest {

	@Test
	//CREATE CALC ADD TEST
	void testAddition() {
		//call the function creating an instance
		Calculator calc1 = new Calculator();
		//propose the test using the variable and its type
		int resultAdd = calc1.add(5, 5);
		//check the result of the test, do not forget the type
		assertEquals(10, resultAdd);//ok
		assertNotEquals(5, resultAdd);//ok
		assertNotNull(resultAdd);//ok
		//assertNull(resultAdd);//error
		//assertSame(resultAdd, resultAdd);
	}
	@Test
	//CREATE CALC SUB TEST
	void testSubtraction() {
		//call the function creating an instance
		Calculator calc2 = new Calculator();
		//propose the test using the variable and its type
		int resultSub = calc2.sub(5, 2);
		//check the result of the test, do not forget the type
		assertEquals(3, resultSub);
	}
	@Test
	//CREATE CALC MULT TEST
	void testMultiplication() {
		//call the function creating an instance
		Calculator calc3 = new Calculator();
		//propose the test using the variable and its type
		int resultMult = calc3.mult(5, 5);
		//check the result of the test, do not forget the type
		assertEquals(25, resultMult);
	}
	@Test
	//CREATE CALC DIV TEST
	void testDivision() {
		//call the function creating an instance
		Calculator calc4 = new Calculator();
		//propose the test using the variable and its type
		String resultDiv = calc4.div(10, 10);
		//check the result of the test, do not forget the type
		assertEquals("1", resultDiv);//ok
		assertNotEquals("5", resultDiv);//ok
		assertNotNull(resultDiv);//ok
		//assertNull(resultDiv);//error
	}
}
