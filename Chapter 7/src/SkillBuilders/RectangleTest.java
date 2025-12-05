package SkillBuilders;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(5, 3);
        Rectangle r3 = new Rectangle(10, 4);

        // Test toString()
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println();

        // Test equals()
        System.out.println("r1 equals r2? " + r1.equals(r2)); // true
        System.out.println("r1 equals r3? " + r1.equals(r3)); // false
    }
}
