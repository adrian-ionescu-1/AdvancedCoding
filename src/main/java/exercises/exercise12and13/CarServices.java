package exercises.exercise12and13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarServices {

    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getV12Engine() {
        List<Car> newCarList = new ArrayList<>(this.carList); // copyOfCarList
        for (Car eachCarFromList : carList) {
            if (!eachCarFromList.getEngineType().equals(EngineType.V12)) {
                newCarList.remove(eachCarFromList);
            }
        }
        return newCarList;
    }

    public List<Car> getCarsBefore1999() {
        List<Car> newCarList = new ArrayList<>();
        for (Car eachCarFromList : carList) {
            if (eachCarFromList.getYearOfManufacture() < 1999) {
                newCarList.add(eachCarFromList);
            }
        }
        return newCarList;
    }

    public Car getMostExpensiveCarFromList() {
        float temporaryMaxPrice = 0;
        Car temporaryMostExpensiveCar = null;
        for (Car eachCarFromList : carList) {
            if (eachCarFromList.getPrice() > temporaryMaxPrice) {
                temporaryMaxPrice = eachCarFromList.getPrice();
                temporaryMostExpensiveCar = eachCarFromList;
            }
        }
        return temporaryMostExpensiveCar;
    }

    public List<Car> getMostExpensiveCarsFromList() {
        List<Car> temporaryMostExpensiveCars = new ArrayList<>();
        float temporaryMaxPrice = 0;
        for (Car eachCarFromList : carList) {
            if (eachCarFromList.getPrice() > temporaryMaxPrice) {
                temporaryMaxPrice = eachCarFromList.getPrice();temporaryMostExpensiveCars.clear();
                temporaryMostExpensiveCars.add(eachCarFromList);
            } else if (eachCarFromList.getPrice() == temporaryMaxPrice) {
                temporaryMostExpensiveCars.add(eachCarFromList);
            }
        }
        return temporaryMostExpensiveCars;
    }

    public List<Car> getCarsWithA3Manufactures() {
        List<Car> result = new ArrayList<>();
        for (Car eachCarFromList : carList) {
            if (eachCarFromList.getManufacturerList().size() >= 3) {
                result.add(eachCarFromList);
            }
        }
        return result;
    }

    public void printedSortedCarListByYear() {
        List<Car> newCarList = new ArrayList<>(carList);
        newCarList.sort(Comparator.comparing(Car::getYearOfManufacture).reversed());
        for (Car eachCarFromList : newCarList) {
            System.out.println(eachCarFromList);
        }
    }

    public void printedSortedCarListByPrice() {
        List<Car> newCarList = new ArrayList<>(carList);
        newCarList.sort(Comparator.comparing(Car::getPrice));
        for (Car eachCarFromList : newCarList) {
            System.out.println(eachCarFromList);
        }
    }

    public void printedSortedCarListByName() {
        List<Car> newCarList = new ArrayList<>(carList);
        newCarList.sort(Comparator.comparing(Car::getName));
        for (Car eachCarFromList : newCarList) {
            System.out.println(eachCarFromList);
        }
    }
}
