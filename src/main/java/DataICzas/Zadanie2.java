package DataICzas;

import java.time.LocalDate;

public class Zadanie2 {

    public static void main(String[] args) {

        LocalDate czasTeraz = LocalDate.now();
        LocalDate poczatekRoku = LocalDate.of(2020, 01, 01);
        System.out.println("Dzień dzisiejszy: " + czasTeraz);
        System.out.println("Początek roku: " + poczatekRoku);
        System.out.println("Dzisiejszy dzień jest: " + czasTeraz.getDayOfYear() + " dniem w roku");
        System.out.println("Początek roku jest: " + poczatekRoku.getDayOfYear() + " dniem w roku");
        System.out.println("Różnica dni między datami wynosi: " + roznica(czasTeraz, poczatekRoku));

    }

    public static long roznica (LocalDate czasTeraz, LocalDate poczatekRoku) {
        long roznca = Math.abs(czasTeraz.getDayOfYear() - poczatekRoku.getDayOfYear());
        return roznca;
    }
}
