package ru.otus.java;

import java.util.Scanner;

public class ArraySort {
    public static void main(String [] arg){
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*size);
        }
        for (int j = 0; j <array.length; j++){
            System.out.println(array[j]);
        }
        System.out.println("========================sort array=============================");
        for (int b = 0; b < array.length; b++){
        for (int a = 0; a < array.length - 1; a++) {
            if (array[a] > array[a + 1]) {
                int buffer = array[a];
                array[a] = array[a + 1];
                array[a + 1] = buffer;
                }
            }
        }
        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
}
