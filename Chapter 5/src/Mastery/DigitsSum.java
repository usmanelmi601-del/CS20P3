package Mastery;
import java.util.Scanner;
public class DigitsSum {

	public DigitsSum() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer: ");
	        int num = input.nextInt();

	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;   // get the last digit
	            sum = sum + digit;      // add it to sum
	            num = num / 10;         // remove the last digit
	        }

	        System.out.println("Sum of digits = " + sum);

	        input.close();
	    }
	    
	    
/* Screen Dump
* Enter a non-negative integer: 678
 Sum of digits = 21

*/

/* Screen Dump
* Enter a non-negative integer: 765
Sum of digits = 18

*/ 
}