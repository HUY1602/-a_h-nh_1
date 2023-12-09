import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;
    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public double getArea() {
        return radius * Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]",
                center, radius, color, filled);
    }

    /**
     * Override equals method.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            return (this.center.equals(circle.center) && this.radius == circle.radius);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), center, radius);
    }
}
