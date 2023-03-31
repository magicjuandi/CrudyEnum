package com.Ejercicios.Eje7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Double> grades = new ArrayList<>();

        // Add elements to the list
        grades.add(3.5);
        grades.add(4.56);
        grades.add(2.9);
        System.out.println("List: " + grades);

        // Access element from the list
        Double grade = grades.get(2);
        System.out.println("Accessed Element: " + grade);

        // Remove element from the list
        Double removedGrade = grades.remove(1);
        System.out.println("Removed Element: " + removedGrade);
    }
}
