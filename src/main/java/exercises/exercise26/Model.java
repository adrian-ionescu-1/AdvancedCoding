package exercises.exercise26;

import java.util.List;

class Model {
   public String name;
    public int productionStartYear;
    List<Car> cars;
    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public void setProductionStartYear(int productionStartYear) {
        this.productionStartYear = productionStartYear;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                ", cars=" + cars +
                '}';
    }
}
