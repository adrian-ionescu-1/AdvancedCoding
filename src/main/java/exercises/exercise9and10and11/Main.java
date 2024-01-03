package exercises.exercise9and10and11;

public class Main {
    public static void main(String[] args) {

        Point2D point2D1 = new Point2D(10, 12);
        Point2D point2D2 = new Point2D(7, 5);

        Circle circle = new Circle(point2D1, point2D2);
        System.out.println(circle.getArea());

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());

        MoveDirection moveDirection = new MoveDirection(8, 19);
        circle.move(moveDirection);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());

        circle.resize(1.5);
        System.out.println("\nResized Circle (factor = 1.5):");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
