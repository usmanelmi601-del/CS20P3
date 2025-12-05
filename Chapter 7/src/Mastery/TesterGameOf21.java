package Mastery;

import java.util.Scanner;

public class TesterGameOf21 {
	/*

    Program: TesterCards.java          

    Purpose:A player is dealt two cards from a deck of playing cards and then optionally given
	a third card. The player closest to 21 points without going over is the winner

    Author: Usman Elmi, 
    School: CHHS
    Course: Computer Programming 20
     

    */
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
        	PlayerGameOf21 user = new PlayerGameOf21();
        	PlayerGameOf21 computer = new PlayerGameOf21();

			System.out.println("Welcome to the Game of 21!");

			String again;

			do {
			    user.reset();
			    computer.reset();

			    // Deal two cards to user
			    CardsGameOf21 u1 = new CardsGameOf21();
			    CardsGameOf21 u2 = new CardsGameOf21();

			    user.takeCard(u1);
			    user.takeCard(u2);

			    System.out.println("\nYour cards: " + u1 + " and " + u2);
			    System.out.println("Your total: " + user.getTotal());

			    // Ask user if they want a third card
			    System.out.print("Do you want another card? (y/n): ");
			    String choice = in.next();

			    if (choice.equalsIgnoreCase("y")) {
			    	CardsGameOf21 u3 = new CardsGameOf21();
			        user.takeCard(u3);
			        System.out.println("Third card: " + u3);
			        System.out.println("Your new total: " + user.getTotal());
			    }

			    // Computer draws cards
			    CardsGameOf21 c1 = new CardsGameOf21();
			    CardsGameOf21 c2 = new CardsGameOf21();
			    computer.takeCard(c1);
			    computer.takeCard(c2);

			    // Simple AI: hits if under 16
			    if (computer.getTotal() < 16) {
			        computer.takeCard(new CardsGameOf21());
			    }

			    System.out.println("\nComputer total: " + computer.getTotal());

			    // Determine winner
			    int userTotal = user.getTotal();
			    int compTotal = computer.getTotal();

			    System.out.println("\n--- Result ---");
			    if (userTotal > 21 && compTotal > 21) {
			        System.out.println("Both busted — no winner!");
			    } 
			    else if (userTotal > 21) {
			        System.out.println("You busted! Computer wins.");
			    }
			    else if (compTotal > 21) {
			        System.out.println("Computer busted! You win!");
			    }
			    else if (userTotal > compTotal) {
			        System.out.println("You win!");
			    }
			    else if (compTotal > userTotal) {
			        System.out.println("Computer wins!");
			    }
			    else {
			        System.out.println("It's a tie!");
			    }

			    System.out.print("\nPlay again? (y/n): ");
			    again = in.next();

			} while (again.equalsIgnoreCase("y"));
		}

        System.out.println("Thanks for playing!");
    }
}


/* Screen Dump
 *Welcome to the Game of 21!

Your cards: 4 and 10
Your total: 14
Do you want another card? (y/n): y
Third card: 5
Your new total: 19

Computer total: 25

--- Result ---
Computer busted! You win!

Play again? (y/n): y

Your cards: 8 and Jack
Your total: 18
Do you want another card? (y/n): n

Computer total: 20

--- Result ---
Computer wins!

Play again? (y/n): n
Thanks for playing!


*/