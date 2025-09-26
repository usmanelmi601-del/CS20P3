package SkillBuilders;
import java.util.Scanner;
public class PerfectSquare {

	public PerfectSquare() {
		// TODO Auto-generated constructor stub
	}
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // INPUT
	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        // PROCESS
	        double sqrt = Math.sqrt(number);   // square root as double
	        int truncated = (int) sqrt;        // truncate to integer
	        int squared = truncated * truncated;

	        // OUTPUT
	        if (squared == number) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is NOT a perfect square.");
	        }

	        sc.close();
	    }
	}
