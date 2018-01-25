
/*
 * Abduljabba Shaamala
 * Lab Number 5 - Dice Rolling
 */

import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		String roll = "Y"; // while loop true conditio
		int conter = 1; // counter of roll number

		Scanner scan = new Scanner(System.in);

		System.out.println(" Welcome to the Garnd Circus Casion!");
		System.out.println("");
		System.out.println("How many sides should each die have?");
		// number of die side input
		int sideNum = scan.nextInt();
		// loop to account the roll number
		while (roll.equalsIgnoreCase("y")) {
			System.out.println("Roll " + conter++ + ": ");
			// call generateRandom class to generate randoms numbers
			int num1 = generateRandom(sideNum);
			int num2 = generateRandom(sideNum);

			System.out.println(num1);
			System.out.println(num2);
			// display special message when get some numbers
			if ((num1 == 2 || num1 == 3 || num1 == 12) && (num1 == 2 || num1 == 3 || num1 == 12)) {
				System.out.println("craps");
			} else if (num1 == 1 && num2 == 1) {
				System.out.println("snack eyes");
			} else if (num1 == 6 && num2 == 6) {
				System.out.println("box cars");
				// display nothing
			} else {
				System.out.println("");
			}
			System.out.println("");
			// continue playing inpute
			System.out.println("Roll again? (y/n): ");
			roll = scan.next();
		}
		scan.close();
	}
// this class to generate random numbers
	public static int generateRandom(int sideNum) {
		int num;
		//create random number 
		Random rand = new Random();
		// sing the random number to variable
		num = rand.nextInt(sideNum) + 1;
		return num;
	}

}
