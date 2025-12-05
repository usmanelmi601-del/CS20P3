package Mastery;

public class PlayerGameOf21 {

    private int total;

    public PlayerGameOf21() {
        total = 0;
    }
    /*

    Program: Player.java          

    Purpose:A player is dealt two cards from a deck of playing cards and then optionally given
	a third card. The player closest to 21 points without going over is the winner

    Author: Usman Elmi, 
    School: CHHS
    Course: Computer Programming 20
     

    */
    public void takeCard(CardsGameOf21 c) {
        total += c.getValue();

        // If Ace causes bust, make it worth 1 instead of 11
        if (total > 21 && c.getNumber() == 1) {
            total -= 10;  // switch Ace from 11 → 1
        }
    }

    public int getTotal() {
        return total;
    }

    public void reset() {
        total = 0;
    }

    public String toString() {
        return "Total points: " + total;
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