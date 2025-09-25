package SkillBuilders;
import java.util.Scanner;
public class RandomNum {

	public RandomNum() {
		// TODO Auto-generated constructor stub
	}

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the minimum value: ");
	        int min = input.nextInt();

	        System.out.print("Enter the maximum value: ");
	        int max = input.nextInt();

	        // random number formula
	        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

	        System.out.println("Random number: " + randomNum);

	        input.close();
	    }
	}

