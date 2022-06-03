package com.generation.F220526;

public class MathFunctions{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Math library
		/////////////////////////////////////////////////
		
		//Exponent (base number, exponent)
		//Casted '(Double)'
		Double numExponent = (Double) Math.pow(2.5, 2);
		System.out.println(numExponent);
		
		//Round to max integer using 'ceil'
		Double roundIntMax1 = Math.ceil(numExponent);
		System.out.println(roundIntMax1);
		
		//Can be used with variables or values
		Double roundIntMax2 = Math.ceil(20.654);
		System.out.println(roundIntMax2);
		
		//Round to min integer using 'floor'
		Double roundIntMin1 = Math.floor(numExponent);
		System.out.println(roundIntMin1);
		
		//Can be used with variables or values
		Double roundIntMin2 = Math.floor(37.3);
		System.out.println(roundIntMax2);
		
		//Round to its natural integer using 'round'
		Double roundInt1 = (double) Math.round(numExponent);
		System.out.println(roundInt1);
		
		//Can be used with variables or values
		Double roundInt2 = (double) Math.round(420.69);
		System.out.println(roundInt2);
		
		//Random
		//generates numbers >= 0.0 and < 1
		Double randomNum1 = Math.random();
		System.out.println(randomNum1);
		
		//if a bigger numbers starting with 0 needed, add a '* num' at the end
		//do not forger the () PAPOMUDAS
		
		Integer randomNum2 = (int) (Math.random() * 100);
		System.out.println(randomNum2);	
		
		//if staring from a number != to 0 needed, add a 'num +' at the beginning
		//do not forger the () PAPOMUDAS
		Integer randomNum3 = (int) (2 + (Math.random() * 20));
		System.out.println(randomNum3);
		
		//if staring from a number < 0 needed, add a '- num +' at the beginning
		//do not forger the () PAPOMUDAS
		Double randomNum4 = (- 2 + (Math.random() * 3));
		System.out.println(randomNum4);
		
		//to get the absolute positive value of the result use 'abs'
		System.out.println(Math.abs(randomNum4));
	}
}
