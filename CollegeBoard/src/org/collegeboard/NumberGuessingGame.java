package org.collegeboard;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		System.out.println("To Start the Number Guessing Game, Enter \"ready\" ");
		Scanner scanner = new Scanner(System.in);
		String userInput = null;
		userInput = scanner.nextLine();
		if (userInput.equalsIgnoreCase("ready")) {
			try {
				String result = guessNumber(-100, 100, scanner);
				if (result != null) {
					System.out.println("Number Guessed By User: " + result);
				}
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				System.out.println(errors);
			} finally {
				scanner.close();
			}
		} else {
			System.out.println("Invalid Command to Start the Number Guessing Game.");
		}		
	}

	private static String guessNumber(int lowerLimit, int upperLimit, Scanner scanner) {
		Random numberGuessedByComputer = new Random();
		String result = null;
		int bound = 0;
		int randomNumber = 0;
		String userInput = null;
		do {
			bound = upperLimit - lowerLimit + 1;
			randomNumber = numberGuessedByComputer.nextInt(bound) + lowerLimit; 
			System.out.println("Computer: Is the number " + randomNumber + "?");
			userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("higher")) {
				lowerLimit = randomNumber + 1;
			} else if (userInput.equalsIgnoreCase("lower")) {
				upperLimit = randomNumber - 1;
			} else if (userInput.equalsIgnoreCase("yes")) {
				result = String.valueOf(randomNumber);
				break;
			} else if (userInput.equalsIgnoreCase("end")) {
				break;
			} else {
				System.out.println("Not A Valid User Input.");
			}
		} while (true);

		return result;
	}

}