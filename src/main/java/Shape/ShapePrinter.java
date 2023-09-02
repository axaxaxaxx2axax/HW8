package Shape;

public class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape: " + shape.name);
        System.out.println("S = " + shape.calculateArea());
        System.out.println("----------------------------------");
    }
}
