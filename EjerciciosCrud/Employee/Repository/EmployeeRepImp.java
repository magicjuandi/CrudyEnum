package com.EjerciciosCrud.Employee.Repository;

import java.util.ArrayList;
import java.util.List;

import com.EjerciciosCrud.Employee.ModelEmployee.Employee;

public class EmployeeRepImp implements EmployeeRep {

    private List<Employee> employees;

    public EmployeeRepImp(){
        employees = new ArrayList<>();
    }

    @Override
    public Employee findById(int id) {
        return employees.stream()
            .filter(employee -> employee.getId() == id)
            .findFirst()
            .orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(Employee employee) {
        Employee oldEmployee = findById(employee.getId());
        if(oldEmployee != null){
            employees.remove(oldEmployee);
            employees.add(employee);
        }
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }

}
