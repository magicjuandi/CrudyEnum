package com.EjerciciosCrud.Car.RepositoryCar;

import java.util.List;

import com.EjerciciosCrud.Car.ModelCar.Car;

public interface CarRep {
    Car findbyplate(int plate);
    List<Car> findAll();
    void save(Car car);
    void update(Car car);
    void delete(Car car);
}
