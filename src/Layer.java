import java.util.List;

public class Layer {

    private List<Shape> shapes;

    /**
     * Constructor.
     */

    public Layer() {
        this.shapes = new java.util.ArrayList<>();
    }

    /**
     * Add a shape to the layer.
     * @param shape the shape to add
     */

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Remove a shape from the layer.
     */

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }
    public String getInfo() {
        String info = "Layer of crazy shapes: \n";
        for(Shape shape : this.shapes) {
            info += shape.toString() + "\n";
        }
        return info;
    }
    public void removeDuplicates() {
        for (int a = 0; a < shapes.size(); a++) {
            for (int b = a + 1; b < shapes.size(); b++) {
                if (shapes.get(a).equals(shapes.get(b))) {
                    shapes.remove(b);
                }
            }
        }
    }
}

