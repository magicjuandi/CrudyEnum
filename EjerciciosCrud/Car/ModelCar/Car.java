package com.EjerciciosCrud.Car.ModelCar;

public class Car {
    public Integer Plate;
    private String owner;
    private String date;
    private String phone;

    public Car(Integer plate, String owner, String date, String phone) {
        Plate = plate;
        this.owner = owner;
        this.date = date;
        this.phone = phone;
    }

    public Integer getPlate() {
        return Plate;
    }

    public void setPlate(Integer plate) {
        Plate = plate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Car [Plate=" + Plate + ", Owner=" + owner + ", Date=" + date + ", Phone=" + phone + "]";
    }
}
