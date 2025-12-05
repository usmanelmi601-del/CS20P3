package SkillBuilders;

public class Rectangle {

    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Overloaded constructor
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Setters
    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Area method
    public double area() {
        return length * width;
    }

    // Perimeter method
    public double perimeter() {
        return 2 * (length + width);
    }

    // CLASS METHOD
    public static void displayAreaFormula() {
        System.out.println("Rectangle Area Formula: length * width");
    }

    // Override toString()
    @Override
    public String toString() {
        return "Rectangle[length=" + length +
               ", width=" + width +
               ", area=" + area() +
               ", perimeter=" + perimeter() + "]";
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;

        Rectangle other = (Rectangle) obj;

        return this.length == other.length &&
               this.width == other.width;
    }
}

