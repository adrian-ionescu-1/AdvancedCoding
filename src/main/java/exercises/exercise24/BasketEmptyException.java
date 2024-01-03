package exercises.exercise24;

public class BasketEmptyException extends Exception{
    public BasketEmptyException() {}
    public BasketEmptyException(String message) {
        super(message);
    }
}
