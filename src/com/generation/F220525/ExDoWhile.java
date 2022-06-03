package com.generation.F220525;

import java.util.Scanner;

public class ExDoWhile {
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
		    //launch scanner and import library 
		    Scanner inputUser = new Scanner(System.in);
		    //set the main variables, included 
		    //booleans
		    Boolean isCero = false;
		    Boolean isCorrect = false;
		    //strings to accumulate
		    String vSup = "";
		    String vInf = "";
		    //int object values
		    Integer sumaDentroRango = 0;
		    Integer sumaFueraRango = 0;
		    Integer sumaIguales = 0;
		    Integer auxiliarSuma = 0;
		    //initiate the 'do loop'
		    do {
		    		//first, validate the main 'if conditional'
		    		//validates the boolean to check if re 'does' or jumps to 'if (n > t){'
		            if(isCorrect == false){
		            	//prints to ask data from the user
		            	System.out.println("Valor Superior"); 
		            	vSup = inputUser.nextLine(); 
		            } 	//prints to ask data from the user
		            	System.out.println("Valor Inferior"); 
		            	vInf = inputUser.nextLine();
		            //creates the 2 variables added by the user to use in the following conditionals and lines
		            int n = Integer.parseInt(vInf), t = Integer.parseInt(vSup); 

		            if (t > 0 && n >0){
		                do {
		                    if(n > t){
		                        isCorrect = true;
		                        System.out.println("El valor inferior no puede ser mayor que el superior ingrese nuevamente");
		                        sumaFueraRango = sumaFueraRango+1;
		                        }
		                    else{
		                        if(n==t && auxiliarSuma == 0){
		                            System.out.println("Los valores superior e inferior son iguales");
		                            sumaIguales = sumaIguales+1; 
		                        }
		                        System.out.println("Se ingresó el valor:" + n);
		                        n++;
		                        isCorrect = false;
		                        sumaDentroRango = sumaDentroRango+1;
		                    }
		                    auxiliarSuma = auxiliarSuma+1;
		                } while (n <= t);
		                auxiliarSuma = 0;
		            }
		            else {
		                    isCero = true;
		                    System.out.println("Se terminó el programa:");
		                    System.out.println("Suma de numeros dentro del rango realizados:" + sumaDentroRango);
		                    System.out.println("Suma de numeros fuera del rango realizados:" + sumaFueraRango);
		                    System.out.println("Suma de numeros iguales realizadas:" + sumaIguales);
		                 }
		      } while (isCero == false);
		  }
		}
