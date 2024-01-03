package exercises.exercise5;

public class Main {
    public static void main(String[] args) {

        SDAHashSet<String> sdaSet = new SDAHashSet<>();
        sdaSet.addElementToList("Paul");
        sdaSet.addElementToList("Paul");
        sdaSet.addElementToList("Radu");
        sdaSet.addElementToList("Bogdan");

        System.out.println(sdaSet.sizeOfList());
        System.out.println(sdaSet.contains("Radu"));
        System.out.println(sdaSet.sizeOfList());

        SDAHashSet<Integer> sdaIntiger = new SDAHashSet<>();

        sdaIntiger.addElementToList(1);
        sdaIntiger.addElementToList(2);
        sdaIntiger.addElementToList(3);

        sdaIntiger.removeElementFromList(1);
        System.out.println(sdaIntiger.contains(2));
    }
}
