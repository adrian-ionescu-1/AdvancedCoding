package exercises.exercise26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Model> models = new ArrayList<>();
        List<Manufacturer> manufacturers = new ArrayList<>();

        Car car1 = new Car("Toyota Corolla", "A popular sedan from Toyota", CarType.CABRIO);
        Car car2 = new Car("Honda Civic", "Compact sedan with great fuel efficiency", CarType.SEDAN);
        Car car3 = new Car("Ford Mustang", "Iconic American muscle car", CarType.CABRIO);
        Car car4 = new Car("Volkswagen Golf", "Compact hatchback known for versatility", CarType.HATCHBACK);
        Car car5 = new Car("Audi A3", "Luxury compact sedan from Audi", CarType.SEDAN);
        Car car6 = new Car("Mazda MX-5", "A sporty convertible roadster", CarType.CABRIO);
        Car car7 = new Car("BMW 3 Series", "Premium compact executive sedan", CarType.SEDAN);
        Car car8 = new Car("Chevrolet Camaro", "Muscle car with a powerful V8 engine", CarType.COUPE);
        Car car9 = new Car("Hyundai Elantra", "Affordable and efficient sedan", CarType.SEDAN);
        Car car10 = new Car("Subaru Impreza", "All-wheel-drive compact sedan", CarType.CABRIO);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Model model1 = new Model("Corolla", 2001, List.of(car1, car2));
        Model model2 = new Model("Civic", 1995, List.of(car3, car4));
        Model model3 = new Model("Mustang", 1965, List.of(car5, car6));
        Model model4 = new Model("Golf", 2003, List.of(car7, car8));
        Model model5 = new Model("A3", 2010, List.of(car9, car10));
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);
        models.add(model5);

        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1938, List.of(model1));
        Manufacturer manufacturer2 = new Manufacturer("Honda", 1946, List.of(model2));
        Manufacturer manufacturer3 = new Manufacturer("Ford", 1900, List.of(model3));
        Manufacturer manufacturer4 = new Manufacturer("Volkswagen", 1937, List.of(model4));
        Manufacturer manufacturer5 = new Manufacturer("Audi", 1932, List.of(model5));
        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);
        manufacturers.add(manufacturer3);
        manufacturers.add(manufacturer4);
        manufacturers.add(manufacturer5);

        cars.stream().forEach(System.out::println);
        models.forEach(System.out::println);
        manufacturers.forEach(System.out::println);

        printManufacturersNames(manufacturers);
        printManufacturersYearOfCreation(manufacturers);
        printModelEvenYearOfProductionStart(models);

        printCars(manufacturers);
    }

    public static void printManufacturersNames(List<Manufacturer> manufacturerList) {
        manufacturerList.stream().map(Manufacturer::getName).forEach(System.out::println);
    }

    public static void printManufacturersYearOfCreation(List<Manufacturer> manufacturerList) {
        manufacturerList.stream().map(manufacturer -> manufacturer.getYearOfCreation()).forEach(System.out::println);
    }
    public static void printModelEvenYearOfProductionStart(List<Model> modelList) {
        modelList.stream().filter(model -> model.getProductionStartYear() %2 == 0).forEach(System.out::println);
    }

    public static void printCars(List<Manufacturer> manufacturers) {
        manufacturers.stream().filter(manufacturer -> manufacturer.getYearOfCreation() %2 == 0)
                .map(Manufacturer::getModels)
                .flatMap(List::stream).filter(model -> model.getProductionStartYear() %2 != 0)
                .map(model -> model.getCars())
                .flatMap(List::stream).filter(car -> car.getCarType().equals(CarType.CABRIO))
                .forEach(System.out::println);
    }
}
