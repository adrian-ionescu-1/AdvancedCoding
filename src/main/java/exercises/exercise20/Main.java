package exercises.exercise20;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        Shape shape1 = new Rectangle(6, 7);
        Shape shape2 = new Triangle(4, 5, 6);
    }
}
