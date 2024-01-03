package exercises.exercise5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet<E> {

    private final List<E> elementsList = new ArrayList<>();

    public void addElementToList(E element) {
        if (!elementsList.contains(element)) {
            elementsList.add(element);
        }
    }

    public void removeElementFromList(E element) {
        if (!elementsList.contains(element)) {
            throw new RuntimeException("Element not found");
        }
        elementsList.remove(element);
    }

    public int sizeOfList() {
        return elementsList.size();
    }

    public boolean contains(E element) {
        return elementsList.contains(element);
    }

    public void clear() {
        elementsList.clear();
    }
}
