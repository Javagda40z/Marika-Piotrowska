package Tablice;

import java.util.Arrays;

public class Zadanie7 {

    public static void main(String[] args) {

        String [] imiona = new String[] {"mateusz", "kasia", "adam", "tomek", "andrzej"};


        System.out.println("Długość tablicy imiona to: " + imiona.length);
        System.out.println("Zawartość tablicy imiona to: " + Arrays.toString(imiona));

        imiona[0] = "piotr";
        System.out.println("Zawartość tablicy po zamianie: " + Arrays.toString(imiona));
        System.out.println(malaLitera(imiona));

        imiona[2] = null;
        System.out.println(Arrays.toString(imiona));
        System.out.println(imiona.length);


    }

    public static String malaLitera (String[] imiona) {

        String zmiana = "";

        for (String imie : imiona) {

            String litera = imie.substring(0,1);
            litera = litera.toUpperCase();
            zmiana += litera + imie.substring(1) + " ";
        }
        return zmiana;

    }

}
