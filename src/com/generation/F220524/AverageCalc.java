package com.generation.F220524;

public class AverageCalc {
	public static void main(String[] args) {
		//prints a cute header
		System.out.println("***********************");
		System.out.println("* Averages Calculator *");
		System.out.println("***********************");
		//int scoresQty = 12;
		//scores array
		//in order to check the integrity of the code, try changing any of the values within the '{}' to a negative or bigger than 100 value
		Integer[] scores = {990,90,67,20,10,70,28,70,58,79,23,80};
		//from 'int' to float it does not require to cast a float afterwards	
		int scoresSum = 0;//20
		//to count and accumulate if scores are out of scope
		int notValidScores = 0;	
		//'for' to iterate the scores array
		for (int i = 0; i < scores.length; i++) {//i=0
			//to validate or check scores correspond to a value between '0 to 100', '[i]' to iterate the array
			if (scores[i] < 0 || scores[i] > 100) {
				//this prints the valued '(scores [i])' according its index position 'i', a '+ 1' is added '(i + 1)' for the user to not receive an "index 0"
				System.out.println("Score: " + scores[i] + " placed on position " + (i + 1) + " is not valid. Please input the correct value.");
				//with every iteration adds 1 to the accumulator variable 'int notValidScores = 0;'
				//remember the syntax can be either of the following ones:
				//notValidScores = notValidScores + 1;
				//notValidScores++;
				//the result, if adding 1 every time, oughts to be the same
				notValidScores++;
			} else {
			//accumulator variable to for which adds iterations results to 'int socresSum'
			scoresSum = scoresSum + scores[i];
			}
		}
		//once validated, if no errors, proceed with the average calculation 
		if (notValidScores != 0) {
			//prints the negative response
			System.out.println("Invalid scores provided. Please check the scores.");
		} else {
			//if the previous not executed, proceed with the 'else' 
			System.out.println("Total SUM of scores: " + scoresSum);
			//to get the quotient as a 'float' in case of decimals, do not forget to cast '(float)' or 'f' after the value (NA here)
			float finalAvg = (scoresSum / scores.length);
			//set the conditional 'IF ELSE' to check the approved and reproved students
			//the following conditional presents a 'BREAKPOINT'
			//'0>=REP<=49; 50>=APR<=100', this is the scope
			if(finalAvg >= 50 && finalAvg <= 100) {
				//prints the true response
				System.out.println("Final AVG score: " + finalAvg + " / Approved");				
			} else if (finalAvg < 0 || finalAvg > 100){
				//prints an invalid response if negative or bigger than 100 values, extracted from the 'IF ELSE'
				System.out.println("Invalid data, try again.");
			} else {
				//prints the false response
				System.out.println("Final AVG score: " + finalAvg + " / Reproved");
			}
		}
	}
}