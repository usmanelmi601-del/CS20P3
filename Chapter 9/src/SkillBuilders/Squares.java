package SkillBuilders;

public class Squares {

    public static void main(String[] args) {

        int[] squares = new int[5];

        // Store the square of each index
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        // Display the values
        System.out.println("Squares Array Values:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}

