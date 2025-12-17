package Mastery;

import java.util.Scanner;

public class Coder {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter a string to encode: ");
			String input = in.nextLine();

			String encoded = "";

			for (int i = 0; i < input.length(); i++) {
			    char ch = input.charAt(i);

			    // Keep spaces
			    if (ch == ' ') {
			        encoded += ch;
			    }
			    // Only encode letters
			    else if (Character.isLetter(ch)) {

			        // convert to lowercase for easier handling
			     char letter = Character.toLowerCase(ch);

			        // Wrap special cases
			        if (letter == 'x') {
			            encoded += 'a';
			        } else if (letter == 'y') {
			            encoded += 'b';
			        } else if (letter == 'z') {
			            encoded += 'c';
			        } else {
			            // Normal +2 shift
			            encoded += (char)(letter + 2);
			        }
			    }
			    else {
			        // Ignore non-letters, but keep them unchanged
			        encoded += ch;
			    }
			}

			System.out.println("Encoded string: " + encoded);
		}
    }
}
