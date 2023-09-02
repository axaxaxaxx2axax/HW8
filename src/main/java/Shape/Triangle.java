package Shape;
/* Трикутник */
public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(String name, double height, double base) {
        super(name);

        if (height <= 0 || base <= 0) {
            throw new IllegalArgumentException("Висота і основа повинні бути більше нуля");
        }

        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }
}
