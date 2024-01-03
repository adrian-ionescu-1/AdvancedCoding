package exercises.exercise20;

public class Triangle extends Shape{
    private double l1;
    private double l2;
    private double l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    @Override
    public double calculatePerimeter() {
        return l1 + l2 + l3;
    }

    @Override
    public double calculateArea() {
        double s = (l1 + l2 + l3) / 2.0;
        return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }
}
