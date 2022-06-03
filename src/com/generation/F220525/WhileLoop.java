package com.generation.F220525;

import java.util.Scanner;

public class WhileLoop {
@SuppressWarnings({ "resource" })
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
	int opcion = sc.nextInt();//capturando el ingreso por consola
	boolean errorIngreso = false;
	
	if(opcion < 0 || opcion > 4) {
		errorIngreso = true;
	}
	
	/**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/
	
	//while valida que la condicion sea verdadera
	while(errorIngreso) { // V i V = V
		
		System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
		opcion = sc.nextInt();
		if(opcion < 0 || opcion > 4) {
			errorIngreso = true;
		}else {
			errorIngreso= false;
		}
	}
	
	System.out.println(" fuera del while");
	
	switch (opcion) {
	case 1:// sumar
			// accion para la opcion 1
			System.out.println("** Suma");
		break;
	case 2:
		System.out.println("** Resta");
		break;
	case 3:
		System.out.println("** Multiplicacion");
		break;
	case 4:// division
		System.out.println("** Division");
		break;
	default:
		System.out.println("opcion invalida");
		break;
	}
	//s stated variable
	int termino = 0;
	//this while loops the variable 10 times
	while(termino <= 10 ) {
		//to print the answer every time
		System.out.println("el valor de termino es "+ termino);
		//to add 1 to the 'int termino' and continue 'the while loop'
		termino++;
	}

}
}