package obiekty;

public interface Animal extends Movable {

    // kazde zwierze bedzie implementowac makeSound -
    // czyli kazde zwierze bedzie mialo dzwiek - to jest interfejs - nie ma ciala metody czyli nie ma przepisu jak wydaje dzwiek
    // tylko polecenie ze taka metode ma wykonac (przepis na klase, na to co ma robic )

    void makeSound();
}
