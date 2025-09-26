package SkillBuilders;
import java.util.Scanner;
public class Delievery {

	public Delievery() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Delivery.java
	 * Author: Your Name
	 * Date: YYYY-MM-DD
	 * Description: This program prompts the user for the length, width, and height of a package.
	 *              If any dimension is greater than 10, it displays "Reject".
	 *              Otherwise, it displays "Accept".
	 */


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // INPUT
	        System.out.print("Enter package length: ");
	        int length = sc.nextInt();

	        System.out.print("Enter package width: ");
	        int width = sc.nextInt();

	        System.out.print("Enter package height: ");
	        int height = sc.nextInt();

	        // PROCESS + OUTPUT
	        if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Reject");
	        } else {
	            System.out.println("Accept");
	        }

	        sc.close();
	    }
	}

