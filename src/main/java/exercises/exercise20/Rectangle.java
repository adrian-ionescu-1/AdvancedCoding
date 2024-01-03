package exercises.exercise20;

public class Rectangle extends Shape{
    private double L;
    private double l;

    public Rectangle(double l, double l1) {
        L = l;
        this.l = l1;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (l + L);
    }

    @Override
    public double calculateArea() {
        return l * L;
    }
}
