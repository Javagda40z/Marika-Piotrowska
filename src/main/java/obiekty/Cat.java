package obiekty;

    // jezeli chcesz mnie implementowac - interfejs Animal,
    // to musisz miec w sobie metode makeSound - bez tego nie mozesz mnie miec !

public class Cat implements Animal {

    private static int licznikKotow = 0;
    private int licznikZłapanychMyszy = 0;
    private String imie;

    public Cat() {
        this("Kot o ID: " + licznikKotow);
        licznikKotow++;
    }

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void drap() {
        //kot drapie
    }

    public void eatMouse() {
        licznikZłapanychMyszy++; // <-> licznik = licznik + 1;
        System.out.println("Zjadłem" + licznikZłapanychMyszy +"myszy");
    }

    // zaimplementowalismy metode z interfejsu Animal -
    // czyli pobralismy polecenie wydania dzwieku, po czym dodalismy metode dla kota

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    @Override
    public void move() {
        System.out.println("chodze");
    }


}