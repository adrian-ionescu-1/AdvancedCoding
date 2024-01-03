package exercises.exercise24;

public class Main {
    public static void main(String[] args) {

        Basket<String> stringBasket = new Basket<>();

        try {
            stringBasket.addToBasket("Paul");
            stringBasket.addToBasket("Raul");
        } catch (BasketFullException e) {
            System.out.println("The Basket is full");
        }
        stringBasket.printElements();

        try {
            stringBasket.removeFromBasket("Paul");
            stringBasket.removeFromBasket("Raul");
            stringBasket.removeFromBasket("Paul");
        } catch (BasketEmptyException e) {
            System.out.println("The Basket is empty");
            e.printStackTrace();
        }
        stringBasket.printElements();

//        Basket<Integer> integerBasket = new Basket<>();
//        integerBasket.addToBasket(7);
//        integerBasket.addToBasket(9);
//        integerBasket.printElements();
//        integerBasket.removeFromBasket(7);
//        integerBasket.printElements();
    }
}
