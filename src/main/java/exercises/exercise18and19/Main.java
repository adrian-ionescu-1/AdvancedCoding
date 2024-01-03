package exercises.exercise18and19;

public class Main {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        Laptop laptop = new Laptop();
//        Computer computer2 = new Laptop();
        Computer computer1 = new Computer();
        Computer computer2 = new Laptop(computer1, "battery1");
    }
}
