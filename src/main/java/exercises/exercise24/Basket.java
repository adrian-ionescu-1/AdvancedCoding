package exercises.exercise24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Basket<E> {
    private List<E> elements = new ArrayList<>();

    public void addToBasket(E element) throws BasketFullException {
        if (elements.size() > 9){
            throw new BasketFullException();
        }
        elements.add(element);
    }

    public void removeFromBasket(E element) throws BasketEmptyException {
        if (elements.size() == 0) {
            throw new BasketEmptyException("The Basket is empty");
        }
        elements.remove(element);
    }

    public void printElements() {
        System.out.println(elements);
    }

    public void elementsSize() {
        System.out.println(elements.size());
    }
}
