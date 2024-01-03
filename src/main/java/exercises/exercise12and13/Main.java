package exercises.exercise12and13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1903, "United States");
        Manufacturer manufacturer3 = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Honda", 1946, "Japan");
        Manufacturer manufacturer5 = new Manufacturer("Chevrolet", 1911, "United States");

        List<Manufacturer> manufacturerList1 = new ArrayList<>();
        manufacturerList1.add(manufacturer1);
        manufacturerList1.add(manufacturer3);
        manufacturerList1.add(manufacturer5);

        List<Manufacturer> manufacturerList2 = new ArrayList<>();
        manufacturerList2.add(manufacturer2);
        manufacturerList2.add(manufacturer4);

        Car car1 = new Car("Toyota", "Camry", 25000.0f, 1987,manufacturerList1, EngineType.V6);
        Car car2 = new Car("Ford", "Mustang", 45000.0f, 2022, manufacturerList2, EngineType.V8);
        Car car3 = new Car("BMW", "7 Series", 80000.0f, 2022, manufacturerList1, EngineType.V12);
        Car car4 = new Car("Honda", "Civic", 20000.0f, 2022, manufacturerList1, EngineType.V6);
        Car car5 = new Car("Chevrolet", "Corvette", 90000.0f, 1456, manufacturerList2, EngineType.V8);
        Car car6 = new Car("Mercedes-Benz", "S-Class", 90000.0f, 2022, manufacturerList2, EngineType.V12);
        Car car7 = new Car("Nissan", "Altima", 23000.0f, 2022, manufacturerList1, EngineType.V6);
        Car car8 = new Car("Dodge", "Challenger", 50000.0f, 2022, manufacturerList2, EngineType.V8);
        Car car9 = new Car("Audi", "A8", 85000.0f, 2022, manufacturerList1, EngineType.V12);
        Car car10 = new Car("Hyundai", "Elantra", 21000.0f, 2022, manufacturerList1, EngineType.V6);

        CarServices carServices = new CarServices();
        carServices.addCar(car1);
        carServices.addCar(car9);
        carServices.addCar(car6);
        carServices.addCar(car10);
        System.out.println(carServices.getCarList());
        System.out.println(carServices.getV12Engine());

//      carServices.removeCar(car1);
//      System.out.println(carServices.getCarList());
        carServices.addCar(car5);
        System.out.println(carServices.getCarsBefore1999().size());

        System.out.println(carServices.getMostExpensiveCarsFromList().size());

        System.out.println(carServices.getCarsWithA3Manufactures().size());

//      carServices.printedSortedCarListByYear();
//      carServices.printedSortedCarListByPrice();
        carServices.printedSortedCarListByName();
    }
}
