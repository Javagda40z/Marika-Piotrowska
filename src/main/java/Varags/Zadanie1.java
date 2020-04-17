
package Varags;

public class Zadanie1 {

    public static void main(String[] args) {

        int suma = add(10,14, 13,6);
        System.out.println("Suma liczba to: " + suma);

    }

    private static int add (int ... liczby) {
        int sum = 0;
        for (int i = 0; i < liczby.length; i++) {
            int value = liczby[i];
            System.out.println("element " + (i + 1) + " to " + value);
            sum += value;
        } return sum;
    }
}