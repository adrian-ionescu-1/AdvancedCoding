package exercises.exercise1and2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Exercise1And2 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        List<String> myList2 = List.of("Radu", "Mihai", "George", "Andrei");

        myList.add("Radu");
        myList.add("Mihai");
        myList.add("George");
        myList.add("Andrei");
        myList.add("cat");
        myList.add("dog");
        myList.add("mouse");

        Exercise1And2 obj = new Exercise1And2();
        System.out.println(obj.getSortedListReversed(myList));
        System.out.println(myList2);
        System.out.println(obj.getCaseSensitiveSortedList(myList));

    }

    public List<String> getSortedListReversed(List<String> list) {
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }

    public List<String> getCaseSensitiveSortedList(List<String> list) {
        List<String> resultList = new ArrayList<>();
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (int i = list.size()-1; i >= 0; i--) {
            String element = list.get(i);
            resultList.add(element);
        }
        return resultList;
    }
}
