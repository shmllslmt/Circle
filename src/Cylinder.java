public class Cylinder extends Circle {
    private int length;

    public Cylinder() {
        this(1);
    }
    public Cylinder(int length) {
        this.length = length;
    }
    public Cylinder(int radius, int length) {
        super(radius);
        this.length = length;
    }

    @Override
    double getArea() {
        return 2 * super.getArea() + 2 * getRadius() * Math.PI * length;
    }
}
