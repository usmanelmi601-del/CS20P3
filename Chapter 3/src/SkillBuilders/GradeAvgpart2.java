package SkillBuilders;
import java.util.Scanner;
public class GradeAvgpart2 {

	public static void main1(String[] args) {  
		
	}
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int total = 0;

		        // Ask for 5 grades and sum them up
		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Enter grade " + i + ": ");
		            total += sc.nextInt();  // add directly with +=
		        }

		        // Calculate average
		        double average = total / 5.0;

		        // Print as percentage
		        System.out.printf("Average grade: %.1f%%%n", average);

		        sc.close();
		    }
	

	}


