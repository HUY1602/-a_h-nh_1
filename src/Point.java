import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;
    public  Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        this.pointX = this.pointX - newPoint.pointX;
        this.pointY = this.pointY - newPoint.pointY;
        return Math.sqrt(this.pointX * this.pointX + this.pointY * this.pointY);
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            return (this.getPointX() == p.getPointX() && this.getPointY() == p.getPointY());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getPointX(), this.getPointY());
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", this.getPointX(), this.getPointY());
    }

}
