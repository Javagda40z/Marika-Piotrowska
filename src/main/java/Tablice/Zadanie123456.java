package Tablice;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Zadanie123456 {

    public static void main(String[] args) {

        int[] tablica = new int[] {6, 3, 5, 7, 1, 1, 7, 9};
        double srednia;

        int[] tablicaDwa = new int[] {1,2,3,4,5,6,7,8};
        double sredniaDwa;

        double pomnozone;


        System.out.println("Ilość elementów w tablicy pierwszej: " + tablica.length);
        System.out.println("Elementy tablicy pierwszej to : " + Arrays.toString(tablica));


        System.out.println("Suma elementów liczb z tablicy pierwszej wynosi: " + sumaElementow(tablica));

        srednia = sumaElementow(tablica)/tablica.length;
        System.out.println("średnia arytmetyczna liczb z tablicy pierwszej wynosi: " + srednia);

        System.out.println("Największa liczba znajdująca się w tablicy pierwszej to: " + NumberUtils.max(tablica));
        System.out.println("Najmniejsza liczba znajdująca się w tablicy pierwszej to: " + NumberUtils.min(tablica));

        System.out.println("-----------------------------------------------------------");

        System.out.println("Ilość elementów w tablicy drugiej: " + tablicaDwa.length);
        System.out.println("Elementy tablicy drugiej to : " + Arrays.toString(tablicaDwa));


        System.out.println("Suma elementów liczb z tablicy drugiej wynosi: " + sumaElementowDwa(tablicaDwa));

        sredniaDwa = sumaElementowDwa(tablicaDwa)/tablicaDwa.length;
        System.out.println("średnia arytmetyczna liczb z tablicy drugiej wynosi: " + sredniaDwa);

        System.out.println("Największa liczba znajdująca się w tablicy drugiej to: " + NumberUtils.max(tablicaDwa));
        System.out.println("Najmniejsza liczba znajdująca się w tablicy drugiej to: " + NumberUtils.min(tablicaDwa));

        pomnozone = (sumaElementow(tablica)*sumaElementowDwa(tablicaDwa));

        System.out.println("Przemnożona suma elementów z tablisy pierwszej oraz drugiej wynosi: " + pomnozone);


    }

    public static int sumaElementow (int[] tablica){
        int suma = 0;
        for (int element : tablica) {
            suma += element;
        }
        return suma;

    }

    public static int sumaElementowDwa (int[] tablicaDwa){
        int suma = 0;
        for (int element : tablicaDwa) {
            suma += element;
        }
        return suma;

    }


}
