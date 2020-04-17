
package ResztaCwiczen;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bokA;
        int bokB;


        System.out.println("Wprowadź długość boku A: ");
        bokA = scanner.nextInt();
        System.out.println("Wprowadź długość boku B: ");
        bokB = scanner.nextInt();

        for (int i = 0; i < bokB; i++) {
            System.out.println();
            for (int j = 0; j<bokA; j++) {
                System.out.print("*");
            }
        }
    }
}