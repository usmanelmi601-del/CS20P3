package Mastery;
import java.util.Scanner;

	public class DivAndMod {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);



	                // Prompt the user for two integers
	                System.out.print("Enter the first integer: ");
	                int num1 = sc.nextInt();

	                System.out.print("Enter the second integer: ");
	                int num2 = sc.nextInt();

	                // Do integer and modulus division both ways
	                System.out.println("\nResults:");

	                // num1 divided by num2 (if num2 is not zero)
	                if (num2 != 0) {
	                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	                } else {
	                    System.out.println("Cannot divide " + num1 + " by 0.");
	                }

	                // num2 divided by num1 (if num1 is not zero)
	                if (num1 != 0) {
	                    System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
	                    System.out.println(num2 + " % " + num1 + " = " + (num2 % num1));
	                } else {
	                    System.out.println("Cannot divide " + num2 + " by 0.");
	                }

	                sc.close();
	            }
	        }

