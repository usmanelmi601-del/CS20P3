package Mastery;
import java.util.Scanner;

      		
	
	import java.util.Scanner;

	public class DigitsApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number;

	        // Keep asking until a valid 3-digit number is entered
	        while (true) {
	            System.out.print("Enter a three-digit number: ");
	            number = sc.nextInt();

	            if (number >= 100 && number <= 999) {
	                break; // valid input, exit loop
	            } else {
	                System.out.println("Error: Please enter a number between 100 and 999.");
	            }
	        }

	        // Extract digits
	        int hundreds = number / 100;
	        int tens = (number / 10) % 10;
	        int ones = number % 10;

	        // Display results
	        System.out.println("Hundreds digit: " + hundreds);
	        System.out.println("Tens digit: " + tens);
	        System.out.println("Ones digit: " + ones);

	        sc.close();
	    }
	}


