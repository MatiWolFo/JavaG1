package com.generation.F220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.F220601.models.MishiExample;
import com.generation.F220601.models.Pet;
import com.generation.F220601.models.PetCat;
import com.generation.F220601.models.PetDog;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		pet.setPetName("Tom");
		pet.setPetColour("Black");
		//CREATE INSTANCES
		//PetDog.java
		PetDog petDog = new PetDog();	
		//PetCat.java
		PetCat petCat = new PetCat();
		//MishiExample.java
		MishiExample mishiExample = new MishiExample();
		
		//PRINT TOSTRING INHERATED SOURCES
		//'PetCat.java' TOSTRING METHOD
		System.out.println(petCat.toString());
		//'PetDog.java' TOSTRING METHOD
		System.out.println(petDog.toString());
		//'Pet.java' TOSTRING METHOD
		System.out.println(pet.toString());
		//'MishiExample.java' TOSTRING METHOD
		System.out.println(mishiExample.toString());
		
		//POLYMORPHISM
		//create an array list
		List <Pet> petList = new ArrayList<Pet>();
		//create a new instance from 'Pet.java'
		Pet polyPet1 = new Pet("Black", "Cow", "Baka", "M", (float) 4);
		//add the created variable to the array list
		petList.add(polyPet1);
		//calls the function created on 'Pet.java'
		polyPet1.makeSound();
		System.out.println(polyPet1.toString());
        
		//create a new instance from 'PetDog.java'
		Pet polyDog1 = new PetDog();
		//set various attributes from 'PetDog.java'
		polyDog1.setPetBreed("Quimera");
		polyDog1.setPetColour("Black");
		polyDog1.setPetSex("M");
		//add the created variable to the array list
		petList.add(polyDog1);
		//calls the function created on 'PetDog.java'
		polyDog1.makeSound();
		System.out.println(polyDog1.toString());
		
		//create a new instance from 'PetCat.java'
		Pet polyCat1 = new PetCat();
		//set various attributes from 'PetCat.java'
		polyCat1.setPetBreed("Vaca");
		polyCat1.setPetColour("Morocho");
		polyCat1.setPetWeight((float) 3);
		//add the created variable to the array list
		petList.add(polyCat1);
		//calls the function created on 'PetCat.java'
		polyCat1.makeSound();
		System.out.println(polyCat1.toString());
		//print the whole array
		System.out.println(petList);
		
	}

}
