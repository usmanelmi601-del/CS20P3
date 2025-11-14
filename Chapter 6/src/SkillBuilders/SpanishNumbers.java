package SkillBuilders;

public class SpanishNumbers {

	public SpanishNumbers() {
		// TODO Auto-generated constructor stub
	}


	    public static void main(String[] args) {
	        System.out.println("Numbers 1 to 10 in Spanish:");

	        for (int i = 1; i <= 10; i++) {
	            printSpanish(i);
	        }
	    }

	    // Method that prints the Spanish word for a number
	    public static void printSpanish(int num) {
	        switch (num) {
	            case 1: System.out.println("1 - uno"); break;
	            case 2: System.out.println("2 - dos"); break;
	            case 3: System.out.println("3 - tres"); break;
	            case 4: System.out.println("4 - cuatro"); break;
	            case 5: System.out.println("5 - cinco"); break;
	            case 6: System.out.println("6 - seis"); break;
	            case 7: System.out.println("7 - siete"); break;
	            case 8: System.out.println("8 - ocho"); break;
	            case 9: System.out.println("9 - nueve"); break;
	            case 10: System.out.println("10 - diez"); break;
	            default: System.out.println("Invalid number");
	        }
	    }
	}

