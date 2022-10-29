package ru.otus.java;

import java.util.Scanner;

public class HomeWorkQwizArr {
    public static void main(String[] args) {

        String[] qwest = {"1. Где находится Биг Бен?", "2. Какая валюта используется в Японии?", "3. Из чего делают стекло?", "4. Какая кость в нашем теле самая длинная?"};
        String[][] answ = {
                {"1. Лондон", "2. Париж", "3. Нъю-Йорк", "4. Москва"},
                {"1. Лондон", "2. Париж", "3. Нъю-Йорк", "4. Москва"},
                {"1. Японский доллар", "2. Иена", "3. Юань", "4. Лира"},
                {"1. Камень", "2. Песок", "3. Стекольный порошок", "4. Пластик"},
                {"1. Бедренная", "2. Берцовая", "3. Плечевая", "4. Лучевая"}
        };

        int[] coransw = {1, 2, 3, 4};
        int[] useransw = new int[4];
        int i = 0;
        int rightresult = 0;
        int wrongresult =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ответь на вопросы и узнай результат");
        for (String qwes : qwest) {
            System.out.println(qwes);
            int j = 0;
            while (j < answ[i].length) {
                System.out.println(answ[i][j]);
                j++;
            }

            switch (sc.nextInt()){
                case 1 :
                    useransw[i] = 1;
                    break;
                case 2 :
                    useransw[i] = 2;
                    break;
                case 3 :
                    useransw[i] = 3;
                    break;
                case 4 :
                    useransw[i] = 4;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            i++;
        }

        for ( int s = 0; s < coransw.length; s++) {
            if (useransw[s] == coransw[s]) {
                rightresult++;
            }
            else {
                wrongresult++;
            }
        }
        System.out.println("Количество верных ответов : " +rightresult);
        System.out.println("Количество неверных ответов : " +wrongresult);
    }

}



