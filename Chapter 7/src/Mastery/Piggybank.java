package Mastery;


/*

Program: MySavings.java          

Purpose: Displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection.

Author: Usman Elmi, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Piggybank {

    private int pen;
    private int nic;
    private int dime;
    private int quart;

    // Default constructor
    public Piggybank() {
        pen = 0;
        nic = 0;
        dime = 0;
        quart = 0;
    }

    // Add coins
    public void penny(int num) {
        pen += num;
    }

    public void nickel(int num) {
        nic += num;
    }

    public void dime(int num) {
        dime += num;
    }

    public void quarter(int num) {
        quart += num;
    }

    // Total money in dollars
    public double bankTotal() {
        return (pen * 0.01) + (nic * 0.05) + (dime * 0.10) + (quart * 0.25);
    }

    // Empty the piggy bank
    public void takeOut() {
        pen = 0;
        nic = 0;
        dime = 0;
        quart = 0;
    }

    // toString
    public String toString() {
        return "Pennies: " + pen + ", Nickels: " + nic + ", Dimes: " + dime + ", Quarters: " + quart;
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
    

	
	
	



