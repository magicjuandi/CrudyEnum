package com.EjerciciosCrud.Car.RepositoryCar;

import java.util.List;
import java.util.Scanner;

import com.EjerciciosCrud.Car.ModelCar.Car;

public class MainCar {
    public static void main(String[] args) {
        String opt = "1";
        CarRep rep = new CarRepImp();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.List \n 3.Edit" + "\n 4.Delete \n 5.Exit \n =>");
            opt = s.next();
            switch(opt) {
                case "1": {

                    System.out.println("Plate of the car: ");
                    Integer plate = s.nextInt();
                    System.out.println("Owner of the car: ");
                    String owner = s.next();
                    System.out.println("Date of entry: ");
                    String date = s.next();
                    System.out.println("Phone of the owner: ");
                    String phone = s.next();
                    rep.save(new Car(plate, owner, date, phone));
                    break;

                }case "2": {
                    List<Car> cars = rep.findAll();
                    cars.forEach(System.out::println);
                    break;
                }case "3": {
                    System.out.println("~~~~~Edit~~~~~");
                    System.out.println("Plate: ");
                    Integer plateC = s.nextInt();
                    System.out.println("Owner: ");
                    String owner = s.next();
                    System.out.println("Date of entry: ");
                    String date = s.next();
                    System.out.println("Phone: ");
                    String phone = s.next();
                    Car update = new Car(plateC, owner, date, phone);
                    rep.update(update);
                    break;
                }case "4": {
                    System.out.println("~~~~~Delete~~~~~");
                    System.out.println("Insert Plate of the car: ");
                    Integer plate = s.nextInt();
                    rep.delete(rep.findbyplate(plate));
                    rep.findAll().forEach(System.out::println);
                    break;
                }case "5": {
                    opt = "5";
                    break;
                }
            }
        }while (opt != "5");    
    }
}
