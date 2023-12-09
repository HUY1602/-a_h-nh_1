import java.util.Objects;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;
    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    /**
     * huadadadad.
     * @param color sis
     * @param filled ajh
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
                topLeft, width, length, color, filled);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            return (this.topLeft.equals(rectangle.topLeft)
                    && this.width == rectangle.width && this.length == rectangle.length);
        }
        return false;
    }

    /**
     * Overrides the hashCode method.
     */

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
