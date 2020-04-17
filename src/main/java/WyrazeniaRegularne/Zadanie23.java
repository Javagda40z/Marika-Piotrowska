package WyrazeniaRegularne;

import java.util.Scanner;

public class Zadanie23 {

    public static void main(String[] args) {


        String zdanie = " Kocham moją córkę i syna";
        Scanner scanner = new Scanner(System.in);
        String zamiana;


        System.out.println("Zdanie pierwotne: " + zdanie);
        System.out.println("Wpisz słowo do zamiany");
        zamiana = scanner.next();

        String zdaniePoZamianie =  zdanie.replaceFirst("\\w+", zamiana);

        System.out.println("Zdanie po zamianie: " + zdaniePoZamianie);

        System.out.println("Zdanie bez znaków białych: " + zdaniePoZamianie.replaceAll(" ", "" ));

    }

}

