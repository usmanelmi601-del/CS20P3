package Mastery;
import java.util.HashSet;
import java.util.Scanner;
public class RandomNumber1 {

	public RandomNumber1() {
		// TODO Auto-generated constructor stub
	}
	



	        // Empty constructor - not used here, but included for structure
	   

	    /*
	     * RandomGenerator.java
	     * Author: Usman
	     * Description: This program implements the Linear Congruential Method (LCM)
	     *              to generate a sequence of pseudo-random numbers.
	     *              The user enters values for a, c, m, and the seed.
	     *              It stores and prints the sequence, and also detects repetition.
	     */
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Get constants from user
	        System.out.print("Enter multiplier (a): ");
	        int a = input.nextInt();

	        System.out.print("Enter increment (c): ");
	        int c = input.nextInt();

	        System.out.print("Enter modulus (m): ");
	        int m = input.nextInt();

	        // Validate modulus
	        if (m <= 0) {
	            System.out.println("Error: modulus (m) must be greater than 0.");
	            input.close();
	            return;
	        }

	        System.out.print("Enter seed (X0): ");
	        int x = input.nextInt();

	        // Array to store results
	        int[] sequence = new int[10];
	        HashSet<Integer> seen = new HashSet<>();

	        System.out.println("\nLinear Congruential Generator (LCM) Sequence:");
	        System.out.println("Using a = " + a + ", c = " + c + ", m = " + m + ", seed = " + x);
	        System.out.println();

	        boolean repeated = false;

	        // Generate 10 numbers
	        for (int i = 0; i < 10; i++) {
	            x = (a * x + c) % m;  // LCM formula
	            sequence[i] = x;

	            // Detect if number has already appeared
	            if (seen.contains(x)) {
	                repeated = true;
	            }
	            seen.add(x);
	        }

	        // Print results
	        for (int i = 0; i < sequence.length; i++) {
	            System.out.println("X" + (i + 1) + " = " + sequence[i]);
	        }

	        // If repetition occurred, notify user
	        if (repeated) {
	            System.out.println("\nNote: The sequence started repeating within 10 numbers.");
	        } else {
	            System.out.println("\nThe sequence did not repeat in the first 10 numbers.");
	        }

	        input.close();
	    }}


