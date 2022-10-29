package ru.otus.java;

import java.util.Scanner;

class QwestAndAnsw {
    private String qwestion;
    private String[] answer;
    public void setQwestion(String qwestion) {
        this.qwestion = qwestion;
    }
    public String getQwestion() {
        return qwestion;
    }
    public void setAnswer(String[] answer) {
        this.answer = answer;
    }
    public String[] getAnswer() {
        return answer;
    }
    void viewQwestionAndAnswer() {
        System.out.println(qwestion);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
class UserAnswer {

    private int userAnsw;

    public void setUserAnsw(int userAnsw) {
        this.userAnsw = userAnsw;
    }

    public int getUserAnsw() {
        return userAnsw;
    }

    private final int CORRECTFIRST = 1;

    public int getCORRECTFIRST() {
        return CORRECTFIRST;
    }

    final int CORRECTSECOND = 2;

    public int getCORRECTSECOND() {
        return CORRECTSECOND;
    }

    final int CORRECTTHIRD = 2;

    public int getCORRECTTHIRD() {
        return CORRECTTHIRD;
    }

    final int CORRECTFOURTH = 2;

    public int getCORRECTFOURTH() {
        return CORRECTFOURTH;
    }
}

public class QwizOOP {
    public static void main(String[] arg) {

        QwestAndAnsw variant1 = new QwestAndAnsw();
        variant1.setQwestion("Где находится Биг Бен? ");
        variant1.setAnswer(new String[]{"1. Лондон", "2. Париж", "3. Нъю-Йорк", "4. Москва"});
        QwestAndAnsw variant2 = new QwestAndAnsw();
        variant2.setQwestion("Какая валюта используется в Японии? ");
        variant2.setAnswer(new String[]{"1. Японский доллар", "2. Иена", "3. Юань", "4. Лира"});
        QwestAndAnsw variant3 = new QwestAndAnsw();
        variant3.setQwestion("Из чего делают стекло? ");
        variant3.setAnswer(new String[]{"1. Камень", "2. Песок", "3. Стекольный порошок", "4. Пластик"});
        QwestAndAnsw variant4 = new QwestAndAnsw();
        variant4.setQwestion("Какая кость в нашем теле самая длинная? ");
        variant4.setAnswer(new String[]{"1. Бедренная", "2. Берцовая", "3. Плечевая", "4. Лучевая"});

        UserAnswer answer1 = new UserAnswer();
        UserAnswer answer2 = new UserAnswer();
        UserAnswer answer3 = new UserAnswer();
        UserAnswer answer4 = new UserAnswer();

        System.out.println("Ответь на четыре вопроса и узнай результат");
        Scanner scanner = new Scanner(System.in);
        int count = 0;

            variant1.viewQwestionAndAnswer();
            answer1.setUserAnsw(scanner.nextInt());
            if (answer1.getUserAnsw() == answer1.getCORRECTFIRST()){
                count++;
            }else ;

            variant2.viewQwestionAndAnswer();
            answer2.setUserAnsw(scanner.nextInt());
            if (answer2.getUserAnsw() == answer2.getCORRECTSECOND()){
                count++;
            }else ;

            variant3.viewQwestionAndAnswer();
            answer3.setUserAnsw(scanner.nextInt());
            if (answer3.getUserAnsw() == answer3.getCORRECTTHIRD()){
               count++;
            }else ;

            variant4.viewQwestionAndAnswer();
            answer4.setUserAnsw(scanner.nextInt());
            if (answer4.getUserAnsw() == answer4.getCORRECTFOURTH()){
                count++;
            }else ;
        System.out.println("Количество правильных ответов "+count);

    }


}

