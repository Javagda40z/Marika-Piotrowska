package DataICzas;

import java.time.LocalDate;

public class Zadanie3 {

    public static void main(String[] args) {

        LocalDate czasTeraz = LocalDate.now();
        LocalDate koniecRoku = LocalDate.of(2020,12,31);
        System.out.println("Dzisiejsza data: " + czasTeraz);
        System.out.println("Koniec roku: " + koniecRoku);
        System.out.println("Dzisiejszy dzień jest: " + czasTeraz.getDayOfYear() + " dniem w roku");
        System.out.println("Koniec roku jest: " + koniecRoku.getDayOfYear() + " dniem w roku");
        System.out.println("Do końca roku pozostało: " + dniDoKoncaRoku(czasTeraz, koniecRoku));

    }

    public static long dniDoKoncaRoku (LocalDate czasTeraz, LocalDate koniecRoku) {
        long dniDoKoncaRoku = Math.abs(koniecRoku.getDayOfYear() - czasTeraz.getDayOfYear());
        return dniDoKoncaRoku;
    }
}
