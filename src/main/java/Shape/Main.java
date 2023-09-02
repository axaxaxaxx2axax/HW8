package Shape;

public class Main {
    public static void main(String[] args) {
        try {
            Shape triangle = new Triangle("Трикутник", 10.0,20.0);
            Shape square = new Square("Квадрат", 5.0);
            Shape trapezium = new Trapezium("Трапеція", 2.0, 5.0, 5.0);
            Shape circle = new Circle("Круг", 2.0);
            Shape pentagon = new Pentagon("П'ятикутник", 2.0);

            ShapePrinter printer = new ShapePrinter();
            printer.printShapeName(triangle);
            printer.printShapeName(square);
            printer.printShapeName(trapezium);
            printer.printShapeName(circle);
            printer.printShapeName(pentagon);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
