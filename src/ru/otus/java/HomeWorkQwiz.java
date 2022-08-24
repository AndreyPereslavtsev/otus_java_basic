package ru.otus.java;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkQwiz {
    public static void main(String[] args) {
        String[] arrayQuestons = {"1. Где находится Биг Бен?","2. Какая валюта используется в Японии?","3. Из чего делают стекло?","4. Какая кость в нашем теле самая длинная?"};
        String[][] arrayVariant = {{"1. Лондон", "2. Париж", "3. Нъю-Йорк", "4. Москва"},
                {"1. Японский доллар", "2. Иена", "3. Юань", "4. Лира"},
                {"1. Японский доллар", "2. Иена", "3. Юань", "4. Лира"},
                {"1. Камень", "2. Песок", "3. Стекольный порошок", "4. Пластик"},
                {"1. Бедренная", "2. Берцовая", "3. Плечевая", "4. Лучевая"}
        };
        int[] arrayAnswer = new int[4];
        int[] arrayCorrectAnswer = {1,2,2,1};
        int countCorrectAnswer = 0;
        int countWrongAnswer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Тест. Ответь на 4 вопроса.");
        System.out.println("После прохождения теста на экране появится результат");

        for (int i = 0; i < arrayQuestons.length; i++) {
            System.out.println(arrayQuestons[i]);
            int k = i;
            for (int j = 0; j < arrayVariant[k].length; j++) {
                System.out.println(arrayVariant[k][j]);
            }
            k = scanner.nextInt();
            if (k == arrayCorrectAnswer[i]) {
                countCorrectAnswer++;
            }
            else {
                countWrongAnswer++;
            };

        }
        System.out.println("Количество правильных ответов: " +countCorrectAnswer);
        System.out.println("Количество неправильных ответов: " +countWrongAnswer);
        /*  for (int c = 0; c < 4; c++) {*/
        /*          System.out.println(arrayAnswer[c]);    }*/
    }
}







