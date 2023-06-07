public class Circle {
    private double radius;
    private static int numOfCircle = 0;

    // no-arg constructor
    Circle() {
        this(1.0);
    }

    Circle(double newRadius) {
        this.radius = newRadius;
        numOfCircle++;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumOfCircle() {
        return numOfCircle;
    }

    @Override
    public String toString() {
        String temp;

        temp = "Radius: " + this.radius + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();

        return temp;
    }

    public void printCircle() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + String.format("%.2f", this.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", this.getPerimeter()));
        System.out.printf("");
    }
}
