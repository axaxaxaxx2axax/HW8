package Shape;
/* Круг */
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус повинен бути більше нуля");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
