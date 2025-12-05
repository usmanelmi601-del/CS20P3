package SkillBuilders;

public class tester {

    public static void main(String[] args) {

        // Test default constructor
        cirlce c1 = new cirlce();
        System.out.println("Default radius: " + c1.getRadius());
        System.out.println("Default circumference: " + c1.circumference());
        System.out.println("Default area: " + c1.Area());
        System.out.println();

        // Test overloaded constructor
        cirlce c2 = new cirlce(5);
        System.out.println("Overloaded radius: " + c2.getRadius());
        System.out.println("Overloaded circumference: " + c2.circumference());
        System.out.println("Overloaded area: " + c2.Area());
        System.out.println();

        // Test class method
        cirlce.displayAreaFormula();

        System.out.println();

      

  
        cirlce spot1 = new cirlce(3);
        cirlce spot2 = new cirlce(4);
        cirlce spot3 = new cirlce(3);

        if (spot1.equals(spot2)) {
            System.out.println("spot1 and spot2 are equal.");
        } else {
            System.out.println("spot1 and spot2 are not equal.");
        }

        if (spot1.equals(spot3)) {
            System.out.println("spot1 and spot3 are equal.");
        } else {
            System.out.println("spot1 and spot3 are not equal.");
        }

        System.out.println(spot1);
        System.out.println(spot2);
        System.out.println(spot3);
    }
}
