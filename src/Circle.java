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
}
