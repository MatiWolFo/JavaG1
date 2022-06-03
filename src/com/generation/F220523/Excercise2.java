package com.generation.F220523;

public class Excercise2 {
	
	public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("*        Calculos        *");
        System.out.println("**************************");
      
        //calculo area y calculo del perimetro
        //variables estaticas
        float b = (float) 5.2;
        float h = (float) 6.4;
        float pi = (float) 3.1416;
        float r = (float) 2.2;
        int dosConstTR = 2;
        double dosPI = 2 * pi;
        //formula area triangulo
        float areaCir = (float) (b * h / dosConstTR);
        //impresion
        System.out.println("El area de un triangulo de base " + b + " y altura " + h + " es: " +areaCir);
        //formula perimetro circulo     
        float perimetroTri = (float) (dosPI * r);
        //impresion
        System.out.println("El perimetro de un circulo de radio " + r + " es: " + perimetroTri);
	}
}
