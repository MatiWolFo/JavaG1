package com.generation.F220525;

import java.util.Scanner;

public class ExTicket {
@SuppressWarnings("resource")
public static void main(String[] args) {
    //llamar base de datos
	Scanner sc = new Scanner(System.in);
	//obtener data usuario
    System.out.println("Ingrese su edad");
    //crear variables relevantes
    int edadingresada = sc.nextInt();
    int edadJoven = 15;
    int edadAdulto = 60;
    float descuento1 = 0.60f;
    float descuento2 = 0.55f;
    int ticket = 3500;
    int ventaticket1 = 0;
    //validad edad usuarion joven y ejecutar condicional
    if(edadingresada <= edadJoven){
    	//calcular descuentos aplicables
        int descuentoticket = (int) (descuento1 * ticket);
        ventaticket1 = ticket - descuentoticket;
        //imprimir respuesta
        System.out.println("Su descuento es de 60%. El total de su venta es de: $" + ventaticket1 + ".-");
    //validar edad usuario adulto mayor y ejecutar condicional
    } else if (edadingresada > edadAdulto) {
    	//calcular descuentos aplicables
        int descuentoticket = (int) (descuento2 * ticket);
        ventaticket1 = ticket - descuentoticket;
        //imprimir respuesta
        System.out.println("Su descuento es de 55%, El total de su venta es de: $" + ventaticket1 + ".-");
    }else{
    	//imprimir respuesta si los otros condicionales no aplican
        System.out.println("Su rango de edad no aplica a descuentos.\nEl total de su venta es de: $" + ticket + ".-");
    }
}
}