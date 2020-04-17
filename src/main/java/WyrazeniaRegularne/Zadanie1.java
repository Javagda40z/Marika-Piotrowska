
package WyrazeniaRegularne;

public class Zadanie1 {

    public static void main(String[] args) {

        String liczba1 = "baro12";
        String liczba2 = "123";

        System.out.println("Pierwsze słowo zawiera same liczby: " +liczba1+ " " + liczba(liczba1));
        System.out.println("Drugie słowo zawiera same liczby: " +liczba2 + " " + liczba2.matches("\\d+"));

    }

    public static boolean liczba( String liczba1 ) {

        if (liczba1.matches("\\d+")) {
            return true;
        } else return false;

    }

}