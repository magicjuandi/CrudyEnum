package com.Ejercicios.Eje6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
       String[] strArray = {"Andres", "JuanD", "John", "Juliana"};
       
        List<String> mylist = Arrays.asList(strArray);
        
        System.out.println("Immutable list:");
        for(String val : mylist){
           System.out.print(val + " ");
        }
        System.out.println("\n");
        
        List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("Mutable list:");
        
        arrayList.add("Li");
        
          for(String val : arrayList){
          System.out.print(val + " ");
        }
}
}