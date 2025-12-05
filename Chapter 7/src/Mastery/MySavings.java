package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

/*

Program: MySavings.java          

Purpose: Displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection.

Author: Usman Elmi, 
School: CHHS
Course: Computer Programming 20
 

*/


public class MySavings {

    public static void main(String[] args) {

        Piggybank bank = new Piggybank();
        try (Scanner in = new Scanner(System.in)) {
			DecimalFormat money = new DecimalFormat("#.00");

			int choice;

			do {
			    System.out.println("\n--- My Savings Menu ---");
			    System.out.println("1. Show total in bank");
			    System.out.println("2. Add a penny");
			    System.out.println("3. Add a nickel");
			    System.out.println("4. Add a dime");
			    System.out.println("5. Add a quarter");
			    System.out.println("6. Take all money out");
			    System.out.println("0. Quit");
			    System.out.print("Enter your choice: ");

			    choice = in.nextInt();

			    switch (choice) {

			        case 1: 
			            System.out.println("Total in bank: $" + money.format(bank.bankTotal()));
			            break;

			        case 2: 
			            bank.penny(1);
			            System.out.println("Added a penny.");
			            break;

			        case 3: 
			            bank.nickel(1);
			            System.out.println("Added a nickel.");
			            break;

			        case 4: 
			            bank.dime(1);
			            System.out.println("Added a dime.");
			            break;

			        case 5: 
			            bank.quarter(1);
			            System.out.println("Added a quarter.");
			            break;

			        case 6:
			            System.out.println("You removed $" + money.format(bank.bankTotal()));
			            bank.takeOut();
			            break;

			        case 0:
			            System.out.println("Goodbye!");
			            break;

			        default:
			            System.out.println("Invalid choice.");
			    }

			} while (choice != 0);
		}
    }
}


/* Screen Dump
 *1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 4
Added 1 dime
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 3
Added 1 nickel
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.15

*/