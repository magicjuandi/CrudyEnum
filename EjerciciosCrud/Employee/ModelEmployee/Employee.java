package com.EjerciciosCrud.Employee.ModelEmployee;

public class Employee {
    public Integer Id;
    private String name;
    private String occupation;
    private String phone;

    public Employee(Integer id, String name, String occupation, String phone) {
        Id = id;
        this.name = name;
        this.occupation = occupation;
        this.phone = phone;
    }

    public Integer getId(){
        return Id;
    }
    public void setId(Integer id){
        Id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee [ID =" + Id + ", Name=" + name + ", Occupation=" + occupation + ", Phone=" + phone + "]";
    }
    
}
