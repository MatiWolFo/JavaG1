package com.generation.F220526;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayLists {
	public static void main(String[] args) {
		//ARRAY LISTS
		//these are object, dynamic arrays or lists, their length may be changed
		//creating a list depending on its type using <> and 'new', with this the array or list is created
		ArrayList<String> colours = new ArrayList<String>();
		ArrayList<Integer> evenNums = new ArrayList<Integer>();
		//to add an element to the dynamic array or list use the variable with '.add'
		colours.add("Purple");
		colours.add("White");
		//if you wish to add an element to a specific index and the index you wish, in this case '1'
		//the element will take the place you wish and all the other elements after will be displaced in sequence, included the index original element
		colours.add(1, "Black");
		//check if the colours were successfully added to the array or list with a print
		System.out.println(colours);
		//to loop through an object array or list using 'for'
		for (int i = 0; i < colours.size(); i++) {
			//remember you can print a space between the elements with '+ " "'
			System.out.print(colours.get(i) + " ");
		}
		//to loop and print an object array or list using 'for each'
		System.out.println("// For obtained");
		for (String colour : colours) {
			System.out.print(colour + " ");
		}
		System.out.println("// ForEach obtained");
		//access to an element by using 'get' and the element, for 'index 1' should be Black
		System.out.println(colours.get(1));
		//get the length or size of an array or list by using 'size', for colours should be '3'
		System.out.println(colours.size());
		//to modify an element using 'set', for colours should replace purple with 'yellow'
		colours.set(0, "Yellow");
		System.out.println(colours);
		//to remove an element from an array or list using '.remove'
		colours.remove(2);
		System.out.println(colours);
		//to remove all the elements from an array or list using '.clear'
		colours.clear();
		System.out.println(colours);		
		//add elements to 'evenNums' and print the array or list
		evenNums.add(14);
		evenNums.add(10);
		evenNums.add(4);
		evenNums.add(2);
		evenNums.add(12);
		evenNums.add(8);
		evenNums.add(6);
		System.out.println(evenNums);
		//'Collections.sort' impacts the array or list completely, the arrays or lists after this point get fixed ascendantly
		//apply 'Collections.' to fix the array or list
		Collections.sort(evenNums);
		//and print the fixed list or array or list
		System.out.println(evenNums);
		//now, a 'reverse.' reverses the '.sort' previously applied
		Collections.reverse(evenNums);
		//and print the reversed '.sort' list or array or list
		System.out.println(evenNums);
				
	}
}
