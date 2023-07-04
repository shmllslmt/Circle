import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);

        Circle circle2 = new Circle();

        Circle circle3 = new Circle(125.0);

        System.out.println("Circle 1");
        circle1.printCircle();

        System.out.println("Circle 2");
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        System.out.println("Circle 3");
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());

        System.out.println("\nTotal Number of Circle Objects: " + Circle.getNumOfCircle());

        Circle[] circles = new Circle[3];

        java.util.Random random = new Random();

        for(Circle circle : circles) {
            circle = new Circle(random.nextDouble(100.0));
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getArea());
        }

        System.out.println("\nTotal Number of Circle Objects: " + Circle.getNumOfCircle());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getArea());
    }
}