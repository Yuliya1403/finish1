package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x ;
        double y ;
        double z ;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter tree numbers: ");
        x = reader.nextInt();
        y = reader.nextInt();
        z = reader.nextInt(); // Задание 1
        {
            double [] nums = {x,y,z};
            double result = 0;
            for (double m : nums)
                result += m;
            System.out.println("Значение среднего арифметического равно:" + (double) result / nums.length);// Задание 2
            double mid_index = (double) Math.floor((result / nums.length)/2); // Задание 3
            if (mid_index > 3){
                System.out.println("Программа выполнена корректно");}// Задание 4
        }
    }
    }






















































































































