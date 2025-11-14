package Mastery;

public class PerfectIntegers {

	public PerfectIntegers() {
		// TODO Auto-generated constructor stub
	}

	    public static void main(String[] args) {
	        System.out.println("Perfect integers up to 100:");

	        for (int i = 1; i <= 100; i++) {
	            if (isPerfect(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to check if a number is perfect
	    public static boolean isPerfect(int num) {
	        int sum = 0;

	        // Find all factors (excluding the number itself)
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0)
	                sum += i;
	        }

	        return sum == num;
	    }
	}

/* Screen Dump
 * Perfect integers up to 100:
6
28

*/