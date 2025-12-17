package SkillBuilders;

public class Reverse {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        // Store index values in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // Display in reverse
        System.out.println("Countdown");
        System.out.println("---------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
