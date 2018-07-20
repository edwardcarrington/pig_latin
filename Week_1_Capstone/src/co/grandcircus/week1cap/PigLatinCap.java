package co.grandcircus.week1cap;

import java.util.Scanner;

public class PigLatinCap {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String wannaPlay = null;

		do {
			System.out.println(
					"Ellohay!\n\nPlease enter in a word.\n\nI will then take that word and magically translate it to Pig Latin!-)\n\nEnter a word now:");
			String userInput = scnr.next();

			System.out.println("Your original word of " + userInput + " translates to: " + pigLat(userInput) + "\n");

			System.out.println("How about another ordway? (y/n):");
			wannaPlay = scnr.next();
			scnr.nextLine();

		} while (wannaPlay.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing! I opehay that you had a ton of unfay!");
		scnr.close();
	}

	public static String pigLat(String userInput) {
		String temp = userInput.toLowerCase();

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char first = temp.charAt(0);

		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {
				return userInput + "way";
			}
		}

		userInput = userInput.substring(1);
		userInput += first + "ay";

		return userInput;
	}
}
