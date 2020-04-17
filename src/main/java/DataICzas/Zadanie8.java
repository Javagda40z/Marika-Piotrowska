package DataICzas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Zadanie8 {

    public static void main(String[] args) {

        LocalDateTime godzinaIData = LocalDateTime.of(2020, Month.FEBRUARY, 10, 15,20);


        DateTimeFormatter aktualna = DateTimeFormatter.ofPattern("HH:mm, dd-MM-yyyy");
        String sformatowana = godzinaIData.format(aktualna);
        System.out.println("Aktualna godzina i data to: " + godzinaIData);
        System.out.println("Sformatowana godzina i data to: " + sformatowana);


    }
}
