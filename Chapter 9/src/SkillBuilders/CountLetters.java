package SkillBuilders;

import java.util.Scanner;

public class CountLetters{

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter a phrase: ");
			String phrase = in.nextLine();

			int letterCount = 0;

			// Count only alphabetic characters
			for (int i = 0; i < phrase.length(); i++) {
			    char ch = phrase.charAt(i);

			    if (Character.isLetter(ch)) {
			        letterCount++;
			    }
			}

			System.out.println("Total alphabetic letters in phrase: " + letterCount);
		}
    }
}

