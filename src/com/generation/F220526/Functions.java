package com.generation.F220526;

import java.util.Scanner;

public class Functions {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//FUNCTIONS (public, private, protected)
		//4 main types, 2 return and 2 not return
		//you CANNOT CREATE methods, instances or functions inside another one
		//however you CAN CALL OR SUMMON inside another one
		////////////////////////////////////////////
		//Now, to call or summon function B
		//static to access the method or function or instance (adds tag 'static void' to the function)
		anyaForger();
		//Now, to call or summon function A
		calcSumEven(3, "3", true, 5l, "Anya, WAKU WAKU!");
		//Now, to call or summon function C
		//from 'Integer to int' to avoid conflicts
		int age = getAge();
		System.out.println(age);
		//Now, to call or summon function D using the 'int age' from C
		//boolean, Boolean, etc; to capture the result of the call
		Boolean ageHighLow = validateLegalAge (age);
		//to validate the age using the boolean
		if (ageHighLow == true) {
			//true confirmation print
			System.out.println("18 or older, welcome.");
		} else {
			//false confirmation print
			System.out.println("Under age, not welcome.");
		}
				
	}
	//access type + return type + function name + (parameter to get and must be defined)
	//'void' does not return, just executes code
	//first letter of the function name must be not CAP
	//A all the parameter you want, but every single one must be defined, if inside (), returns
	//static to access the method or function or instance
	public static void calcSumEven(int num1, String num2, boolean on, Long num3, String wakuWaku) {
		//optional syso to print anything
		System.out.println(num1 + num3 + wakuWaku + Integer.parseInt(num2));
	}
	//B simply prints, executes code and does not return or gets any data
	//static to access the method or function or instance
	public static void anyaForger() {
		System.out.println("Waku Waku");
	}
	//C returns or gets a type of data (instead of void, the access type is the data to return)
	//static to access the method or function or instance
	@SuppressWarnings("resource")
	public static Integer getAge() {
		//add scanner, import library and print a syso to ask the user's age
		Scanner userAge = new Scanner(System.in);
		System.out.println("Enter your age");
		//the return, in this case, is an object '18'
		//'userAge.nextInt();' to capture their age and overwrite the 'Integer age ='
		Integer age = userAge.nextInt();
		//this returns the value of the variable 'Integer age ='
		return age;		
	}
	//D this function returns a boolean based on the 'Integer age ='
	//static to access the method or function or instance
	public static Boolean validateLegalAge (Integer age) {
		//conditional to validate the value
		if (age >= 18) {
			//optionally prints a confirmation syso
			System.out.println("Legal Age TRUE");
			return true;
		//else in case the if is not true
		} else {
			//optionally prints a confirmation syso
			System.out.println("Legal Age FALSE");
			return false;
		}	
	}
}
