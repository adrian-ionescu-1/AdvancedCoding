package exercises.exercise15;

public enum Car {
    FERRARI(20000, 200),
    PORSCHE(54003, 100),
    MERCEDES(60000, 150),
    BMW(48000, 250),
    OPEL(54200, 100),
    FIAT(60000, 250),
    TOYOTA(60000, 100);

    private int price;
    private int power;

    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public boolean isPremium() {
        return price > 50000;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car car) {
        return car.getPower() < power;
    }

    public boolean isFasterThan2(Car car) {
        return Integer.valueOf(this.power).compareTo(Integer.valueOf(car.getPower())) == 1;
    }
}
