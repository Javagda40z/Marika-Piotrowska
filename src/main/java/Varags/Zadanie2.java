package Varags;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {

        imiona("Jagoda", "Dawid", "Bartek", "Hania", "Zbigniew");
    }

    public static void imiona(String... imiona) {

        int element = 0;
        List<String> lista = new ArrayList<String>();

        for (String s : imiona) {
            lista.add(s);
        }

        while (element < imiona.length) {
            System.out.println("Imiona zawarte w liście to: " + imiona[element]);
            element++;
        }
    }
}