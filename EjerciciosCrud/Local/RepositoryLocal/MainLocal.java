package com.EjerciciosCrud.Local.RepositoryLocal;

import java.util.List;
import java.util.Scanner;

import com.EjerciciosCrud.Local.ModelLocal.Local;

public class MainLocal {
    public static void main(String[] args) {
        String opt = "1";
        LocalRep rep = new LocalRepImp();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.List \n 3.Edit" + "\n 4.Delete \n 5.Exit \n =>");
            opt = s.next();
            switch(opt){
                case "1": {
                    System.out.println("Number of the local: ");
                    Integer numLocal = s.nextInt();
                    System.out.println("Name of the local: ");
                    String name = s.next();
                    System.out.println("Category of the local: ");
                    String category = s.next();
                    System.out.println("Phone of the local: ");
                    String phone = s.next();
                    rep.save(new Local(numLocal, name, category, phone));
                    break;
                }case "2": {
                    List<Local> locals = rep.findAll();
                    locals.forEach(System.out::println);
                    break;
                }case "3": {
                    System.out.println("~~~~~Edit~~~~~");
                    System.out.println("Number of the local: ");
                    Integer numLocalL = s.nextInt();
                    System.out.println("Name: ");
                    String name = s.next();
                    System.out.println("Category: ");
                    String category = s.next();
                    System.out.println("Phone: ");
                    String phone = s.next();
                    Local update = new Local(numLocalL, name, category, phone);
                    rep.update(update);
                    break;
                }case "4" : {
                    System.out.println("~~~~~Delete~~~~~");
                    System.out.println("Insert Number of the local: ");
                    Integer numLocal = s.nextInt();
                    rep.delete(rep.findbyNum(numLocal));
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
