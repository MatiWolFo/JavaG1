package com.generation.F220526;

import java.util.Arrays;

public class ArraysAndCollections {
	public static void main(String[] args) {
		//ARRAYS
		//remember to always use [} and the values inside the array given with {}
		String[] colours = {"Red", "Blue", "Black", "Yellow"};
		Integer[] evenNums = {2, 4, 6, 8, 10, 12};
		int[] mainNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		//remember that arrays start with 'index 0' but the array length start with 'index 1'
		//'index 0' corresponds to 'red'
		System.out.println(colours[0]);
		//'index 1' corresponds to '4'
		System.out.println(evenNums[1]);
		//'index 9' corresponds to '0'
		System.out.println(mainNums[9]);
		//if you wish to override the value of an index
		//check the original value of that index
		System.out.println(mainNums[1]);
		//above, the result is 'index 2', then, we override their original value using the name of the variable 'int[] mainNums'
		mainNums[1] = 14;
		//if printing again, the result of 'index 1' must change from '2' to '14'
		System.out.println(mainNums[1]);
			//on the other hand, if you try to override a no valid 'index num' within the array, a bug will trigger
			//System.out.println(evenNums[7]);
			//mainNums[7] = 10;
		//to validate the length of an array
		//the length of this array should be '4'
		System.out.println(colours.length);
		//the length of this array should be '10'
		System.out.println(mainNums.length);
		//to print the raw content of an array
		System.out.println(colours.toString());
		System.out.println(evenNums.toString());
		System.out.println(mainNums.toString());
		//however, if you wish to print the legible content of an array use 'Array.'
		System.out.println(Arrays.toString(colours));
		System.out.println(Arrays.toString(evenNums));
		System.out.println(Arrays.toString(mainNums));
		//FOR to loop through an array
		for (int i = 0; i < mainNums.length; i++) {
			//if you need to print horizontally and without line breaks use 'print' instead of 'println'
			//to add a space between the values use '+ " "' at the end of the print
			System.out.print(mainNums[i] + " ");
		}
		//FOREACH to loop through an array, this for will loop the array as many times as values inside the array
		//to add a space between the values use '+ " "' at the end of the print
		for (int oneToZero : mainNums) {
			System.out.print(oneToZero + " ");
		}
		//the 'for' loop will depend on the type of variable, in this case use a String
		for (String colour : colours) {
			System.out.print(colour + " ");
		}
	}
}
