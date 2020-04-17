package WyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie4 {

    public static void main(String[] args) {

        String slowo = "Baro";
        String regex = " \\D+{5}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(slowo);

        boolean odpowiedz = matcher.matches();

        System.out.println("Czy słowo składa się z samych liter i ma długość 5 ? " + odpowiedz);

        System.out.println("Czy słowo składa się z samych liter? : " + slowo.matches("\\D+"));
        System.out.println("Długość słowa wynosi: " + slowo.length() + "Czy dlugosc ta jest rowna 5? : " + dlugosc(slowo));


    }

    public static boolean dlugosc (String slowo) {
        if (slowo.length() < 5) {
            return false;
        } else if (slowo.length() == 5) {
            return true;
        } else return false;
    }
}