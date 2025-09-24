package SkillBuilders;
import java.util.Scanner;
public class Hurricane {

	public Hurricane() {
		// TODO Auto-generated constructor stub
	}


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Ask user for category
	        System.out.print("Enter the hurricane category (1-5): ");
	        int category = input.nextInt();

	        // Display wind speed ranges
	        if (category == 1) {
	            System.out.println("Category 1: 74-95 mph, 64-82 kt, 119-153 km/hr");
	        } else if (category == 2) {
	            System.out.println("Category 2: 96-110 mph, 83-95 kt, 154-177 km/hr");
	        } else if (category == 3) {
	            System.out.println("Category 3: 111-130 mph, 96-113 kt, 178-209 km/hr");
	        } else if (category == 4) {
	            System.out.println("Category 4: 131-155 mph, 114-135 kt, 210-249 km/hr");
	        } else if (category == 5) {
	            System.out.println("Category 5: greater than 155 mph, greater than 135 kt, greater than 249 km/hr");
	        } else {
	            System.out.println("Invalid category. Please enter a number between 1 and 5.");
	        }

	        input.close();
	    }
	}


