package org.submit;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.Scanner;

/**
* <h1>Number Guessing Game!</h1>
* The NumberGuessingGame program implements an application that
* simply guesses a Number chosen by a User.
* 
* The user chooses a number in his mind and types "ready" to indicate to 
* the computer that he is ready to begin playing. Then, he enters Lower 
* Limit and Higher Limit. Number Chosen by User should fall in this range.
*
* The computer asks a series of questions to arrive at the number the 
* user has in mind. The user can only respond with "higher", "lower" or "yes".
*
* The game ends when the user responds with "yes" or "end".
*
* @author  Vivekanand Alampally
* @version 1.0
* @since   2016-05-31
*/
public class NumberGuessingGame {

	public static void main(String[] args) {
		System.out.println("To Start the Number Guessing Game, Enter \"ready\" ");
		Scanner scanner = new Scanner(System.in);
		String userInput = null;
		userInput = scanner.nextLine();
		if (userInput.equalsIgnoreCase("ready")) {
			try {
				System.out.println("Enter Lower Limit: ");
				int lowerLimit = scanner.nextInt();
				System.out.println("Enter Upper Limit: ");
				int upperLimit = scanner.nextInt();
				String result = guessNumber(lowerLimit, upperLimit);
				if (result != null) {
					System.out.println("Number Chosen By User: " + result);
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

	 /**
	   * This method is used to Guess a Number chosen by a User.
	   * @param lowerLimit This represents Lower Bound.
	   * @param upperLimit  This represents Upper Bound.
	   * @return String Returns Number Chosen By User. Returns null,
	   *  if user aborts the program.
	   */
	private static String guessNumber(int lowerLimit, int upperLimit) {
		Scanner scanner = new Scanner(System.in);
		Random numberGuessedByComputer = new Random();
		String result = null;
		int bound = 0;
		int randomNumber = 0;
		String userInput = null;
		do {
			/* Generate a random number between lowerLimit and UpperLimit */
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
		scanner.close();
		return result;
	}

}