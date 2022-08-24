package ru.otus.java;

import java.util.Scanner;

public class HomeWorkArrBig {
    public static void main(String[] arg) {
        String[][][] arrayAll = {
                {
                        {"1. Где находится Биг Бен?", "2. Какая валюта используется в Японии?", "3. Из чего делают стекло?", "4. Какая кость в нашем теле самая длинная?"},
                        {"1. Лондон", "2. Париж", "3. Нъю-Йорк", "4. Москва"},
                        {"1. Японский доллар", "2. Иена", "3. Юань", "4. Лира"},
                        {"1. Камень", "2. Песок", "3. Стекольный порошок", "4. Пластик"},
                        {"1. Бедренная", "2. Берцовая", "3. Плечевая", "4. Лучевая"}
                },
                {
                        {"2", "2", "3", "3"},
                }
        };
        int [] arrayansw = new int[4];
        int [] arr = new int[4];
        int corans = 0;
        int wronans = 0; ///

        System.out.println("Ответь на 4 вопроса и узнай результат ");

        for ( int h =0; h < 4; h++) {
            arr[h] = Integer.parseInt(arrayAll[1][0][h].trim());
        }
        Scanner scanner = new Scanner(System.in);
        int k = 1;

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayAll[0][0][i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(arrayAll[0][k][j]);
            }
            k++;
            arrayansw[i] = scanner.nextInt();
        }
        for ( int g = 0; g < arrayansw.length; g++){
            if ( arr[g] == arrayansw[g]) {
                corans++;
            }
            else {
                wronans++;
            }

        }
        System.out.println("Количество верных ответов: " +corans);
        System.out.println("Количество неверных ответов:" +wronans);
    }
}

