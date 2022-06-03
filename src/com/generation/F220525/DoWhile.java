package com.generation.F220525;

import java.util.Scanner;

public class DoWhile {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//a random 'int variable'
		int numX = 20;
		//it will always execute at least once
		do {
			//print the answer to the 'do'
			System.out.println("DOWHILE int value "+ numX);	
			numX++;
		} while (numX <= 10);
			System.out.println("************************");
	
			while (numX <= 10) {
				//print the answer every time
				System.out.println("WHILE int value "+ numX);
				//to add 1 to the 'int termino' and continue 'the while loop'
				numX++;
			}
			System.out.println("************************");
			
			////////////////////////////////////////////////////////////////////////////////////////////////
			
			Scanner sc = new Scanner(System.in);
			//accumulator variable, will get overwritten by 'sc.nextInt();'
			int opcion = 0;
			//'do' will always execute at least once, in this case if conditionals 'while' are 'true', will trigger again
			//in the moment 'while' returns a 'false', 'do' will not happen again
			do {
				//print options given to the user
				System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
				//gets the user's answer and overwrites the 'int choice'
				opcion = sc.nextInt();
			//if the conditionals stated here are 'true', the 'do' will trigger
			//if the conditional or conditionals stated here are 'false', while is finished and the code continues after
			} while (opcion < 0 || opcion > 4);
	}
}
