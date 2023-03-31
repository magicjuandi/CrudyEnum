package com.EjerciciosCrud.Employee.Repository;

import java.util.List;

import com.EjerciciosCrud.Employee.ModelEmployee.Employee;

public interface EmployeeRep {

    Employee findById(int id);
    List<Employee> findAll();
    void save(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
}
