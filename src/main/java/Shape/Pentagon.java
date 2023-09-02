package Shape;
/* Восьмикутник */
public class Pentagon extends Shape {
    private String name;
    private double sTriangle;

    public Pentagon(String name, double sTriangle) {
        super(name);
        this.sTriangle = sTriangle;
    }

    @Override
    public double calculateArea() {
        return sTriangle * 5;
    }
}
