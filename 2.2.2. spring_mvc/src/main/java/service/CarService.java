package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(){
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public List<Car> getListFromCount(int num) {
        if (num > carList.size()) {
            num = carList.size();
        }
        else if (num < 0) {
            num = 0;
        }
        return this.carList.subList(0, num);
    }
}
