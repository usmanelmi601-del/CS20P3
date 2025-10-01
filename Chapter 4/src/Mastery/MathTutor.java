package Mastery;

import java.util.Random;
import java.util.Scanner;
public class MathTutor {

	public MathTutor() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * MathTutor.java
	 * Author: Usman
	 * Description: This program generates a random math problem using two numbers (1–10)
	 *              and a random operator (+, -, *, /). The user is asked to solve it,
	 *              and the program checks the answer and displays feedback.
	 */


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        // Generate two random numbers between 1 and 10
	        int num1 = rand.nextInt(10) + 1;
	        int num2 = rand.nextInt(10) + 1;

	        // Randomly select an operator (0–3)
	        int op = rand.nextInt(4);
	        char operator;
	        double correctAnswer = 0;

	        switch (op) {
	            case 0: // Addition
	                operator = '+';
	                correctAnswer = num1 + num2;
	                break;
	            case 1: // Subtraction
	                operator = '-';
	                correctAnswer = num1 - num2;
	                break;
	            case 2: // Multiplication
	                operator = '*';
	                correctAnswer = num1 * num2;
	                break;
	            case 3: // Division
	                operator = '/';
	                // force num1 to be divisible by num2 to avoid decimals
	                num1 = num2 * (rand.nextInt(10) + 1);
	                correctAnswer = (double) num1 / num2;
	                break;
	            default:
	                operator = '?';
	        }

	        // Display the problem
	        System.out.print("What is " + num1 + " " + operator + " " + num2 + "? ");
	        double userAnswer = sc.nextDouble();

	        // Check the answer (allow small rounding difference for division)
	        if (Math.abs(userAnswer - correctAnswer) < 0.0001) {
	            System.out.println("Correct! ");
	        } else {
	            System.out.println("Incorrect. The correct answer is " + correctAnswer);
	        }

	        sc.close();
	    }
}
	   


