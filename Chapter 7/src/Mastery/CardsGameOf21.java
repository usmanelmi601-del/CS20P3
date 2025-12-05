package Mastery;

public class CardsGameOf21 {
	/*

    Program: Cards.java          

    Purpose:A player is dealt two cards from a deck of playing cards and then optionally given
	a third card. The player closest to 21 points without going over is the winner

    Author: Usman Elmi, 
    School: CHHS
    Course: Computer Programming 20
     

    */
    private int number;   // 1–13
    private int value;    // blackjack value

    public CardsGameOf21() {
        number = (int)(Math.random() * 13) + 1;

        if (number == 1)         value = 11;  // Ace default = 11
        else if (number >= 11)   value = 10;  // J Q K = 10
        else                     value = number;
    }

    public int getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    // For display
    public String toString() {
        switch (number) {
            case 1:  return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "" + number;
        }
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