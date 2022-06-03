package com.generation.F220530;

import java.util.ArrayList;
import java.util.List;

public class OPPpart2Main {

	public static void main(String[] args) {
		//CREATE AN ARRAY LIST
		//'array list' is a class, we can work with abstract objects and implement lists (interfaces with their methods)
		//'list' as interfaces only define methods
		List<OPPpart2> studentsList1 = new ArrayList<OPPpart2>();	
		//Now, to summon the object created 'OOPpart2' and create an instance for its new variable or attribute 
		//attribute is the variable to an Object Variable
		//using empty constructor
		OPPpart2 studentConstructor = new OPPpart2();
		//using filled constructor
		OPPpart2 studentConstructor2 = new OPPpart2("Anya", "Forger", 6, "1-3a");
		//print empty attribute constructor using 'get', if void, returns 'null'
			//System.out.println(studentConstructor.getStudentName());
		//print filled attribute constructor using 'get'
			//System.out.println(studentConstructor2.getStudentName());
		//'add' data to the created lists or array lists
		studentsList1.add(studentConstructor);
			//studentsList1.add(studentConstructor2);
		
		//SETTERS
		//sets a new attribute to the instance using 
		//the rest of data should be 'null', since 'NAME' is the only one being added
		studentConstructor.setStudentName("Yor");
		//print the new value to the attribute of the instance
		System.out.println(studentConstructor.getStudentName());
		//has to be defined within the source class, in this case 'OPPpart2' in its tab
		System.out.println(studentConstructor2.toString());
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//EXINSTANCESGROUP6
		//Create the instances
		OPPpart2 studentG1 = new OPPpart2();
		OPPpart2 studentG2 = new OPPpart2();
		OPPpart2 studentG3 = new OPPpart2();
		OPPpart2 studentG4 = new OPPpart2();
		OPPpart2 studentG5 = new OPPpart2();
		//EXTRA STEP TO LOOP AFTERWARDS
		//add the instances to the created array list in order for them to get printed while using 'for' or 'for each' loops
		studentsList1.add(studentG1);
		studentsList1.add(studentG2);
		studentsList1.add(studentG3);
		studentsList1.add(studentG4);
		studentsList1.add(studentG5);
		//set the new values to the instances studentName
		studentG1.setStudentName("Alondra");
		studentG2.setStudentName("Diana");
		studentG3.setStudentName("Matias");
		studentG4.setStudentName("Michael");
		studentG5.setStudentName("Paulino");	
		//set the new values to the instances studentSurname
		studentG1.setStudentSurname("Valenzuela");
		studentG2.setStudentSurname("Miranda");
		studentG3.setStudentSurname("Rebolledo");
		studentG4.setStudentSurname("Roldan");
		studentG5.setStudentSurname("Rubio");		
		//set the new values to the instances studentAge
		studentG1.setStudentAge(24);
		studentG2.setStudentAge(27);
		studentG3.setStudentAge(28);
		studentG4.setStudentAge(28);
		studentG5.setStudentAge(28);
		//set the new values to the instances studentClawss
		studentG1.setStudentClass("G1");
		studentG2.setStudentClass("G1");
		studentG3.setStudentClass("G1");
		studentG4.setStudentClass("G1");
		studentG5.setStudentClass("G1");
        //SYSOS GET
		System.out.println("***************************");
        System.out.println("*******GROUP 6 STAFF*******");
        System.out.println("***************************");
        System.out.println("Name: " + studentG1.getStudentName() + " - Surname: " + studentG1.getStudentSurname() + " - Age: " + studentG1.getStudentAge() + " - Class: " + studentG1.getStudentClass());
        System.out.println("Name: " + studentG2.getStudentName() + " - Surname: " + studentG2.getStudentSurname() + " - Age: " + studentG2.getStudentAge() + " - Class: " + studentG2.getStudentClass());
        System.out.println("Name: " + studentG3.getStudentName() + " - Surname: " + studentG3.getStudentSurname() + " - Age: " + studentG3.getStudentAge() + " - Class: " + studentG3.getStudentClass());
        System.out.println("Name: " + studentG4.getStudentName() + " - Surname: " + studentG4.getStudentSurname() + " - Age: " + studentG4.getStudentAge() + " - Class: " + studentG4.getStudentClass());
        System.out.println("Name: " + studentG5.getStudentName() + " - Surname: " + studentG5.getStudentSurname() + " - Age: " + studentG5.getStudentAge() + " - Class: " + studentG5.getStudentClass());
        //to print all the information at once use the following
        //has to be defined within the source class, in this case 'OPPpart2' in its tab
        System.out.println(studentG1.toString());
        System.out.println(studentG2.toString());
        System.out.println(studentG3.toString());
        System.out.println(studentG4.toString());
        System.out.println(studentG5.toString());
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //this 'for' iterate within the array list
        for (int i = 0; i < studentsList1.size(); i++) {
        	//to print all the values to 'index X'
				//System.out.println(studentsList1.get(i).getStudentName());
				//System.out.println(studentsList1.get(i).getStudentAge());
		}
        //this 'for each' iterate within the array list, same as previous
        for (OPPpart2 opPpart2 : studentsList1) {
            //to print all the information at once use the following
            //has to be defined within the source class, in this case 'OPPpart2' in its tab
			System.out.println(opPpart2.toString());
		}
	}

}
