package SkillBuilders;

public class cirlce {

    private double radius;

    public cirlce() {
        radius = 1;
    }

    public cirlce(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double Area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }

    // toString override
    @Override
    public String toString() {
        return "cirlce with radius " + radius +
               " and area " + Area();
    }

    // equals override
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; // same object
        if (!(obj instanceof cirlce)) return false; // wrong type

        cirlce other = (cirlce) obj;

        return this.radius == other.radius; // compare radii
    }

	public static void displayAreaFormula() {
		// TODO Auto-generated method stub
		
	}

  }

