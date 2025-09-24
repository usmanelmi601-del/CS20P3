package SkillBuilders;
import java.util.Scanner;
public class Digits {
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	 
		   // Prompt the user
        System.out.print("Enter a two-digit number: ");
        int number = sc.nextInt();

        // Extract digits
        int tens = number / 10;
        int ones = number % 10;

        // Display results
        System.out.println("Tens digit: " + tens);
        System.out.println("Ones digit: " + ones);

        sc.close();
			
	}
}
