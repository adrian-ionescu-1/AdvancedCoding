package exercises.exercise9and10and11;

public class Circle implements Movable, Resizable{

    private double radius;
    private Point2D centerCircle;
    private Point2D randomPoint;

    public Circle(Point2D centerCircle, Point2D randomPoint) {
        this.centerCircle = centerCircle;
        this.randomPoint = randomPoint;
        radius = Math.sqrt(Math.pow(centerCircle.getX() - randomPoint.getX(), 2) + Math.pow(centerCircle.getY() - randomPoint.getY(), 2));
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        centerCircle.move(moveDirection);
        randomPoint.move(moveDirection);
        radius = Math.sqrt(Math.pow(centerCircle.getX() - randomPoint.getX(), 2) + Math.pow(centerCircle.getY() - randomPoint.getY(), 2));
    }

    @Override
    public void resize(double resizeFactor) {
        radius *= resizeFactor;
    }
}
