package obiekty;

    // jezeli chcesz mnie implementowac - interfejs Animal,
    // to musisz miec w sobie metode makeSound - bez tego nie mozesz mnie miec !

public class Cat implements Animal {

    // metoda stworzona przez nas, tylko dla kota

    public void drap() {
        //kot drapie
    }

    // zaimplementowalismy metode z interfejsu Animal -
    // czyli pobralismy polecenie wydania dzwieku, po czym dodalismy metode dla kota

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
