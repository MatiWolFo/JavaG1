package com.generation.F220523;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//VARIABLES PRIMITIVAS PART 1
		//se define el tipo de dato (ej: String) al cual pertenecera la variable
		String name = "MatiWolFo\nTexto con Salto de Linea";
		//el siguiente system es lo mismo que print, console.log, document.write, etc
		System.out.println(name);
		//char con un solo caracter con comilla simple no arroja error
		char letterA = 'a';
		//retorna true o false, permite evaluar los IF ELSE
		boolean tieneKeAsepta = true;
		boolean tieneManito = false;
		
		//asignar variables con tipo de dato numerico
		//vale 32bytes y acepta valores de hasta 9 digitos
		int numberInt = 999999999;
		//al momento de imprimir, se pueden indicar extras en el comando
		System.out.println(numberInt + 2000000000);
		//para imprimir numeros decimales FLOAT
		float numberFloat = (float) 10.23445;
		System.out.println(numberFloat);
		//vale 8bytes y acepta valores de hasta 127, 3 digitos
		byte numberByte = 120;
		System.out.println(numberByte);
		//vale 16bytes y acepta valores de hasta 32767, 5 digitos
		short numberShort = 23400;
		System.out.println(numberShort);
		//vale 64bytes y acepta valores de hasta 9 digitos
		long numberLong = 999999999;
		System.out.println(numberLong);
		
		//to print your full name
		String fullName = "Matias Rebolledo";
		System.out.println(fullName);
		//to print your gender
		char gender = 'M';
		System.out.println(gender);
		//to print your age
		int age = 28;
		//to print your citizenship
		String citizenship = "Chilean";
		System.out.println(citizenship);
		System.out.println(age + " years");
		//to print your hair colour
		String hairCol = "Hair colour: Brown";
		System.out.println(hairCol);
		//to print your career or occupation
		String occupation = "LQA Specialist";
		System.out.println(occupation);
		//to print marital status using conditional IF and a boolean
		boolean married = false;
		//adding conditional IF ELSE to print according to the boolean's value
		if (married == true) {
			System.out.println("Married");
		} else {
			System.out.println("Single");
		}
	
		
		//OBJECT VARIABLES PART 2
		String courseClass = "G1";
		//to define an empty variable 
		String course1 = "";
		//to define a blank variable
		String course2 = " ";
		//to define a null variable, it is not a string, must be compared with == or !=, null is a PRIMITIVE VARIABLE
		String course3;
		//When object oriented, strings get compared with a period, == is used to numbers INT or FLOAT
		//Using just equals, every single char inside the string must fulfil the requirement, enables capitalisation
		if (courseClass.equals("g1")) {
			System.out.println("== TRUE");
		} else {
			System.out.println("!= TRUE");
		}
		//using ignore case, ignores capitalisation and values the string itself
		if (courseClass.equalsIgnoreCase("g1")) {
			System.out.println("== TRUE");
		} else {
			System.out.println("!= TRUE");
		}
		//combination of the first 2 IFs, converting the String to a fully lower case string
		if (courseClass.toLowerCase().equals("g1")) {
			System.out.println("== TRUE");
		} else {
			System.out.println("!= TRUE");
		}
		//combination of the first 2 IFs, converting the String to a fully upper case string
		if (courseClass.toUpperCase().equals("g1")) {
			System.out.println("== TRUE");
		} else {
			System.out.println("!= TRUE");
		}
		
		//FLOAT AND DOUBLE
		//(float) casts and recognises the value inserted as a double, float with no cap is a primitive variable
		//float height = 1.75f; can also be applied, same effect
		float height = (float) 1.75;
		//(float) casts and recognises the value inserted as a double, Float with cap is an object variable
		//Float height = 90.5f; can also be applied, same effect
		Float weight = (float) 90.5;
		//PARSE
		//As its primitive, parseFloat takes a string and turns it into a float value
		Float earthG = Float.parseFloat("9.8");
		//Parse admits the whole arguments reviewed so far
		Integer funnyNum = Integer.parseInt("420");
		Long digits9 = Long.parseLong("123456789");
		Float numberFltd = Float.parseFloat("220.15");
		Double numberDbld = Double.parseDouble("123456.2030");
		
		//ex1: float and double applied
		//primitive given
		int numI = 12;
		//to automatically convert the primitive given into the following
		long numL = numI;
		float numF =numL;
		double numD =numF;
		double numD2 = numD;
		//primitive int converted to string to turn string into object variable after using parse (SHOULD AVOID)
		String num2 = Integer.toString(numI);
		//Converted to different parses
		//Printed using syso
		//call from object to object cannot be done
		//call from primitive to object can be done
		//call from object to primitive can be done
		Float num3 = Float.parseFloat(num2);
		System.out.println(numI + " " + num3);
		Integer num4 = Integer.parseInt(num2);
		System.out.println(numI + " " + num4);
		Long num5 = Long.parseLong(num2);
		System.out.println(numI + " " + num5);
		Double num6 = Double.parseDouble(num2);
		System.out.println(numI + " " + num6);

		
		//DATA CONVERSION, ex1 correction 
		//automatic
		//byte > short > int > long > float > double

		//manual
		//double > float > long > int > short > byte	
		//The following is the short version of the ex1 previously done, using a primitive variable to turn in into a series of object variables
		Double peso2 = 75.9;
		//float peso2PV = peso2.floatValue();
		//Float peso2OV = peso2PV;
		//The following is the short version of the previous 2 examples
		Float peso2OV = peso2.floatValue();
		System.out.println(peso2OV);
		Long peso3OV = peso2.longValue();
		System.out.println(peso3OV);
		Integer peso4OV = peso2.intValue();
		System.out.println(peso4OV);
		Short peso5OV = peso2.shortValue();
		System.out.println(peso5OV);
		Byte peso6OV = peso2.byteValue();
		System.out.println(peso6OV);
		
		//MATH OPERATORS 
		//+, -, *, % (to operate)
		//==, !=, <, <=, =>, > (to compare)
	}
}
