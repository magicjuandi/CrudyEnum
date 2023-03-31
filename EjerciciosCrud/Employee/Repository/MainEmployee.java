package com.EjerciciosCrud.Employee.Repository;

import java.util.List;
import java.util.Scanner;

import com.EjerciciosCrud.Employee.ModelEmployee.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        String opt = "1";
        EmployeeRep rep = new EmployeeRepImp();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.List \n 3.Edit" + "\n 4.Delete \n 5.Exit \n =>");
            opt = s.next();
            switch (opt) {
                case "1": {
                
                    System.out.println("Id of the employee: ");
                    Integer id = s.nextInt();
                    System.out.println("Name of employee: ");
                    String name = s.next();
                    System.out.println("Occupation of employee");
                    String occupation = s.next();
                    System.out.println("Phone of employee");
                    String phone = s.next();
                    rep.save(new Employee(id, name, occupation, phone));
                    break;

                }case "2": {
                    List<Employee> employees = rep.findAll();
                    employees.forEach(System.out::println);
                    break;
                }case "3": {
                    System.out.println("~~~~~Edit~~~~~");
                    System.out.println("Id of the employee: ");
                    Integer IdE = s.nextInt();
                    System.out.println("Name of employee: ");
                    String name = s.next();
                    System.out.println("Occupation of employee");
                    String occupation = s.next();
                    System.out.println("Phone of employee");
                    String phone = s.next();
                    Employee update = new Employee(IdE, name, occupation, phone);
                    rep.update(update);
                    break;
                }case "4": {
                    System.out.println("~~~~~Delete~~~~~");
                    System.out.println("Insert the Id of employee ");
                    Integer id = s.nextInt();
                    rep.delete(rep.findById(id));
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
