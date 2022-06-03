package com.generation.F220525;

import java.util.Scanner;

public class ExComision {
@SuppressWarnings("resource")
public static void main(String[] args) {
	//setear scanner
    Scanner sc = new Scanner(System.in);
	//get entrada numerica user
    System.out.println("Ingrese su monto de venta");
    int montoVenta = sc.nextInt();
	//variables comision
	int montoComision5a = 10000;
	int montoComision4a = 9999;
	int montoComision4b = 5001;
	int montoComision3a = 4999;
	int montoComision3b = 1001;
    int sinComision1 = 1000;
	int sinComision2 = 5000;
    float ventaTotal;
	float totalComision;
	float comision3 = (float) 0.1;
	float comision4 = (float) 0.2;
	float comision5 = (float) 0.3;
	//calcular comisiones
	//if sin comision
    if (montoVenta < sinComision1 || montoVenta == sinComision2 ){
    	System.out.println("No tienes comision.\nEl total es de:\n$" + montoVenta + ".-");
    	//if comision 30
    } else if (montoVenta >= montoComision5a) {
    	totalComision = montoVenta * comision5;
    	ventaTotal = totalComision + montoVenta;
    	System.out.println("Tienes un 30% de comision, correspondiente a:\n$" + totalComision + ".-\nTotal de la venta:\n$" + ventaTotal + ".-");
        //if comision 20
    } else if (montoVenta <= montoComision4a && montoVenta >= montoComision4b){
    	totalComision = montoVenta * comision4;
        ventaTotal = totalComision + montoVenta;
        System.out.println("Tienes un 20% de comision, correspondiente a:\n$" + totalComision + ".-\nTotal de la venta:\n$" + ventaTotal + ".-");
        //if comision 10
    } else if (montoVenta <= montoComision3a && montoVenta >= montoComision3b){
        totalComision = montoVenta * comision3;
        ventaTotal = totalComision + montoVenta;
        System.out.println("Tienes un 10% de comision, correspondiente a:\n$" + totalComision + ".-\nTotal de la venta:\n$" + ventaTotal + ".-");      
	}
}
}
