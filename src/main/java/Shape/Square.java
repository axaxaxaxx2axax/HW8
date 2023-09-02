package Shape;
/* Квадрат */
public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name);

        if (side <= 0) {
            throw new IllegalArgumentException("Сторона повинна бути більше нуля");
        }

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
