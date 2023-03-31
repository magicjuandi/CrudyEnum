package com.Ejercicios.Eje9;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    
    List<String> product = new ArrayList<>();

    String product1 = "Gaseosa";

    product.add(product1);

    boolean containsElement =
        product.contains("Gaseosa");

    System.out.println(containsElement);
}
    

}
