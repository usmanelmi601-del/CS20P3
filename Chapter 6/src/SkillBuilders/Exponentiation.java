package SkillBuilders;
import java.util.Scanner;
public class Exponentiation {

	public Exponentiation() {
		// TODO Auto-generated constructor stub
	}
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the base number: ");
	        double base = input.nextDouble();

	        System.out.print("Enter the exponent: ");
	        double exponent = input.nextDouble();

	        double result = powerOf(base, exponent);

	        System.out.println(base + " raised to the power of " + exponent + " = " + result);

	        input.close();
	    }

	    // Method to calculate base raised to exponent
	    public static double powerOf(double base, double exponent) {
	        return Math.pow(base, exponent);
	    }
	}

