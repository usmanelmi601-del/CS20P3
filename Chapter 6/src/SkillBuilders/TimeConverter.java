package SkillBuilders;
import java.util.Scanner;
public class TimeConverter {

	public TimeConverter() {
		// TODO Auto-generated constructor stub
	}
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("1. Hours to Minutes");
	        System.out.println("2. Days to Hours");
	        System.out.println("3. Minutes to Hours");
	        System.out.println("4. Hours to Days");

	        System.out.print("Enter your choice (1-4): ");
	        int choice = input.nextInt();

	        System.out.print("Enter the value: ");
	        double value = input.nextDouble();

	        if (choice == 1)
	            System.out.println(value + " hours = " + hoursToMinutes(value) + " minutes");
	        else if (choice == 2)
	            System.out.println(value + " days = " + daysToHours(value) + " hours");
	        else if (choice == 3)
	            System.out.println(value + " minutes = " + minutesToHours(value) + " hours");
	        else if (choice == 4)
	            System.out.println(value + " hours = " + hoursToDays(value) + " days");
	        else
	            System.out.println("Invalid choice");

	        input.close();
	    }

	    public static double hoursToMinutes(double h) { return h * 60; }
	    public static double daysToHours(double d) { return d * 24; }
	    public static double minutesToHours(double m) { return m / 60; }
	    public static double hoursToDays(double h) { return h / 24; }
	}

