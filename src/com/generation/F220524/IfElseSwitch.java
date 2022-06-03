package com.generation.F220524;
//automatically imported by fixing 'Scanner'
import java.util.Scanner;
public class IfElseSwitch {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		//get the console data or the data provided by the user
		Scanner sc1 = new Scanner(System.in);
		//validate 'legal age' to Chile
		//chilean 'BREAKPOINT' 18 years		
		int legalAge1 = 18;
		//ask the user to input their age
		System.out.println("Please, enter your age:");
		//capture the data provided by the user and setting it into 'userAge'
		int userAge = sc1.nextInt();
		//validate the data given by the user vs 'legalAge'
		if (userAge >= legalAge1) {
			System.out.println("Over " + legalAge1 + " years, welcome.");
		} else {
			System.out.println("Take yer arse away wee puppy.");
		}
		////////////////////////////////////////////////////////////////////////////////
		//Excersise2 CASINO LOGIN
		Scanner sc2 = new Scanner(System.in);
		//query about all the strings (sc.nextLine)
		//name, surname, address street (strings)
		System.out.println("State your full name:");
		String userName2 = sc2.nextLine();
		System.out.println("State your street address name:");
		String userAddress2 = sc2.nextLine();
		//age, address number (sc.nextInt)
		//legal age variable
		int legalAge2 = 18;
		//min balance requested
		int minBalance2 = 50000;
		System.out.println("Please, enter your age:");
		//get the user's legal age 
		int userAge2 = sc2.nextInt();
		//validate age (if, else)
		if (userAge2 >= legalAge2) {
			System.out.println("State your street address number:");
			//get the user's address
			int userAddressNum2 = sc2.nextInt();
			//balance $ (sc.nextDouble)		
			System.out.println("Enter your current balance $:");
			//get the user's balance
			double userBalance2 = sc2.nextDouble();
			//validate balance (min 50000 clp) (if, else)
			if (userBalance2 >= minBalance2) {
				//How much to bet? (if, else)
				System.out.println("How much $$$ would you like to bet? ($10000 x multiples)");
				int userBet2 = sc2.nextInt();
				//validate the user's bet vs their $ balance
				if (userBet2 <= userBalance2) {
					//the bet is accepted and prints the confirmation
					System.out.println("Thanks for you bet, the results will be given to you as soon as possible.");
				} else {
					//the bet is not accepted due to low balance
					System.out.println("Current Balance insufficient to bet, try a lower bet.");
				}
			} else {
				//balance is not enough to enter the web
				System.out.println("Current Balance insufficient in order to enter the website.");
			}
		} else {
			//under age confirmation text
			System.out.println("Underage, try when older.");
		}
	}
}