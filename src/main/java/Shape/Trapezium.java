package Shape;

/* Трапеція */
public class Trapezium extends Shape {
    private String name;
    private double abase;
    private double bbase;
    private double heigth;
    public Trapezium(String name, double abase, double bbase, double heigth) {
        super(name);
        this.abase = abase;
        this.bbase = bbase;
        this.heigth = heigth;
    }

    @Override
    public double calculateArea() {
        return (abase + bbase) * heigth * heigth;
    }
}
