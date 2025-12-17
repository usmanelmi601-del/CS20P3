package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter number of students: ");
			int num = in.nextInt();
			in.nextLine(); // clear buffer

			String[] roster = new String[num];

			// Input student names
			for (int i = 0; i < 100; i++) {
			    System.out.print("Enter name for student " + (i + 1) + ": ");
			    roster[i] = in.nextLine();
			}

			// Display roster
			System.out.println("\nStudent Roster");
			System.out.println("--------------");

			for (int i = 0; i < num; i++) {
			    System.out.println(roster[i]);
			}
		}
    }
}
