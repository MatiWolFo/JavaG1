package com.generation.F220525;

import java.util.Scanner;

public class SwitchConditional {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//import scanner
		Scanner sc = new Scanner(System.in);
		//offer menu and options
		System.out.println("Choose an option:");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		//get user's choice
		int userOption = sc.nextInt();	
		//
		switch (userOption) {
		case 1:
			//execute action 1	
			System.out.println("** Addition");
			break;
		case 2:
			//execute action 2
			System.out.println("** Subtraction");
			break;
		case 3:
			//execute action 3
			System.out.println("** Multiplication");
			break;
		case 4:
			//execute action 4
			System.out.println("** Division");
			break;
		default:
			System.out.println("Not valid option. Please chose a valid one.");
			break;
		}
	}
}
