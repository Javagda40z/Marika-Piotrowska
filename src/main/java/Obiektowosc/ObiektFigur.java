package Obiektowosc;

import java.util.Scanner;

public class ObiektFigur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wyborFigury;

        do {
            System.out.println("Wybierz figurę, którą chcesz: \n Koło - 1 \n Kwadrat - 2 " +
                    "\n Prostokąt - 3 \n Trójkąt - 4");
            wyborFigury = scanner.nextInt();


            switch (wyborFigury) {

                case 1:
                    Kolo kolo = new Kolo();
                    System.out.println("Podaj kolor koła: ");
                    kolo.podajKolorKola(scanner.next());
                    System.out.println("Podaj promień koła: ");
                    kolo.podajPromienKola(scanner.nextInt());
                    kolo.wypiszInformacje();
                    break;

                case 2:
                    Kwadrat kwadrat = new Kwadrat();
                    System.out.println("Podaj kolor kwadratu: ");
                    kwadrat.podajKolorKwadratu(scanner.next());
                    System.out.println("Podaj bok kwadratu: ");
                    kwadrat.podajBokA(scanner.nextInt());
                    kwadrat.wypiszInforamcje();
                    break;

                case 3:
                    Prostokat prostkat = new Prostokat();
                    System.out.println("Podaj kolor prostokąta: ");
                    prostkat.podajKolorProstokata(scanner.next());
                    System.out.println("Podaj bok A prostokąta: ");
                    prostkat.podajBokA(scanner.nextInt());
                    System.out.println("Podaj bok B prostokąta: ");
                    prostkat.podajBokB(scanner.nextInt());
                    prostkat.wypiszInformacje();
                    break;

                case 4:
                    Trojkat trojkat = new Trojkat();
                    System.out.println("Podaj kolor trójkata: ");
                    trojkat.podajKolorTrojkata(scanner.next());
                    System.out.println("Podaj podstawę A trójkata: ");
                    trojkat.podajPodstawe(scanner.nextInt());
                    System.out.println("Podaj wysokość H trójkąta: ");
                    trojkat.podajWysokosc(scanner.nextInt());
                    trojkat.wypiszInforamcje();
                    break;
                default:
            }
        } while (wyborFigury > 5);
        System.out.println("Podałeś błędną wartość");

    }
}