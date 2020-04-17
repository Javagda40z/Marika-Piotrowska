package WyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie56 {

    public static void main(String[] args) {


        String zdanie = "Ala ma kota, ";
        String liczba = "2.34";
        String regexZdanie = "[A-Z]{1}\\w+(\\s\\w+)*\\.";
        String regexLiczba = "\\d+\\.\\d+";

        Pattern pattern = Pattern.compile(regexZdanie);
        Matcher matcher = pattern.matcher(zdanie);

        boolean jestZdaniem = matcher.matches();

        Pattern pattern1 = Pattern.compile(regexLiczba);
        Matcher matcher1 = pattern1.matcher(liczba);

        boolean jestLiczbaZmiennoprzecinkowa = matcher1.matches();

        System.out.println("Czy nasz string " + zdanie + " jest zdaniem? " + jestZdaniem);
        System.out.println(" Czy nasz string " + liczba + " jest liczbą zmiennoprzecinkową? " + jestLiczbaZmiennoprzecinkowa);

    }
}

