package SkillBuilders;
import java.util.Scanner;
public class GradeAvgpart1 {

	public static void main1(String[] args) {  
		
	}
	


	    public static void main(String[] main) {
	        Scanner sc = new Scanner(System.in);

	     // Ask for 5 grades
	        System.out.print("Enter grade 1: ");
	        int g1 = sc.nextInt();
	        System.out.print("Enter grade 2: ");
	        int g2 = sc.nextInt();
	        System.out.print("Enter grade 3: ");
	        int g3 = sc.nextInt();
	        System.out.print("Enter grade 4: ");
	        int g4 = sc.nextInt();
	        System.out.print("Enter grade 5: ");
	        int g5 = sc.nextInt();

	        // Add them together
	        int total = g1 + g2 + g3 + g4 + g5;

	        // Calculate average (real division with double)
	        double average = total / 5.0;

	        // Show result
	        System.out.println("The average is: " + average);

	        sc.close();
	    }
	}


