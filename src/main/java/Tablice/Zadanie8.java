package Tablice;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Zadanie8 {

    public static void main(String[] args) {

        int[] tablicaPierwsza = new int[] { 1,2,3,4,5};
        int[] tablicaDruga = new int[] {6,7,8,9,10};
        int[] tablicaTrzecia = new int[tablicaPierwsza.length + tablicaDruga.length];

        System.out.println("Tablica pierwsza: " + Arrays.toString(tablicaPierwsza));
        System.out.println("Tablica druga: " + Arrays.toString(tablicaDruga));

        System.out.println("Długosć tablicy trzeciej: " + tablicaTrzecia.length);

        System.arraycopy(tablicaPierwsza, 0, tablicaTrzecia, 0, tablicaPierwsza.length);
        System.arraycopy(tablicaDruga,0, tablicaTrzecia, tablicaPierwsza.length, tablicaDruga.length);

        System.out.println("Tablica trzecia - kopia pierwszej i drugiej: " + Arrays.toString(tablicaTrzecia));

    }
}