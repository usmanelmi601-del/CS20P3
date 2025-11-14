package Mastery;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public GuessingGame() {
		// TODO Auto-generated constructor stub
	}
	

	 
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random rand = new Random();

	        int number = rand.nextInt(10) + 1;
	        int guess = 0;

	        System.out.println("I'm thinking of a number between 1 and 10.");

	        while (guess != number) {
	            System.out.print("Enter your guess: ");
	            guess = input.nextInt();

	            if (guess == number)
	                System.out.println("Correct! The number was " + number + ".");
	            else
	                giveHint(guess, number);
	        }

	        input.close();
	    }

	    public static void giveHint(int guess, int number) {
	        if (guess < number)
	            System.out.println("Too low!");
	        else
	            System.out.println("Too high!");
	    }
	}

/* Screen Dump
 * I'm thinking of a number between 1 and 10.
Enter your guess: 3
Too low!
Enter your guess: 7
Too high!
Enter your guess: 5
Too high!
Enter your guess: 4
Correct! The number was 4.


*/

/* Screen Dump
 *I'm thinking of a number between 1 and 10.
Enter your guess: 4
Too high!
Enter your guess: 1
Too low!
Enter your guess: 3
Correct! The number was 3.

*/
