package exercises.exercise4;

public class StorageMain {

    public static void main(String[] args) {

        Storage ourStorage = new Storage();

        ourStorage.addToStorage("Java", "18");
        ourStorage.addToStorage("PHP", "1");
        ourStorage.addToStorage("PHP", "5");
        ourStorage.addToStorage("Python", "23");
        ourStorage.addToStorage("C++", "5");

        ourStorage.printValue("PHP");
        ourStorage.printValue("Python");
        ourStorage.findValues("5");
    }
}
