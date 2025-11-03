package SkillBuilders;
import java.util.Scanner;
public class OddSum {

	public OddSum() {
		// TODO Auto-generated constructor stub
	}



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = input.nextInt();

	        int sum = 0;

	        for (int i = 1; i <= num; i++) {
	            if (i % 2 != 0) {  // check if number is odd
	                sum = sum + i;
	            }
	        }

	        System.out.println("Sum of odd numbers from 1 to " + num + " = " + sum);

	        input.close();
	    }
	}

