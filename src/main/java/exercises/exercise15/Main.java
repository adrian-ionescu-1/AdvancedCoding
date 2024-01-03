package exercises.exercise15;

public class Main {
    public static void main(String[] args) {

        System.out.println(Car.FIAT.getPower());
        System.out.println(Car.FERRARI.getPrice());

        System.out.println(Car.FERRARI.isPremium());
        System.out.println(Car.PORSCHE.isPremium());
        System.out.println(Car.FERRARI.isRegular());
        System.out.println(Car.PORSCHE.isRegular());

        System.out.println(Car.FERRARI.isFasterThan(Car.BMW));
        System.out.println(Car.FERRARI.isFasterThan2(Car.BMW));

    }
}
