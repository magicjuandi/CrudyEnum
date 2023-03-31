package com.EjerciciosCrud.Car.RepositoryCar;

import java.util.ArrayList;
import java.util.List;

import com.EjerciciosCrud.Car.ModelCar.Car;

public class CarRepImp implements CarRep{
    
    private List<Car> cars;
    
    public CarRepImp(){
        cars = new ArrayList<>();
    }

    @Override
    public void update(Car car) {
        Car oldCar = findbyplate(car.getPlate());
        if(oldCar != null){
            cars.remove(oldCar);
            cars.add(car);
        }
        
    }
    
    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car findbyplate(int plate) {
        return cars.stream()
            .filter(car -> car.getPlate() == plate)
            .findFirst()
            .orElse(null);
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    
    


}
