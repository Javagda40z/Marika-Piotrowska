package DataICzas;

import java.time.LocalDate;

public class Zadanie456 {

    public static void main(String[] args) {

        LocalDate data1 = LocalDate.of(2020, 04,26);
        LocalDate data2 = LocalDate.of(2020, 05, 30);

        System.out.println("Data pierwsza: " + data1);
        System.out.println("Data druga: " + data2);
        System.out.println("Dni między datami: " + roznica(data1, data2));
        System.out.println("Czy data pierwsza  jest po dacie drugiej: " + data1.isAfter(data2));
        System.out.println("Po dodaniu do daty pierwszej 34 dni uzyskamy datę: " + data1.plusDays(34));

    }

    public static long roznica ( LocalDate data1, LocalDate data2) {
        long roznica = Math.abs(data2.getDayOfYear() - data1.getDayOfYear());
        return roznica;
    }
}
