package obiekty;

public class Cow implements Animal {

    public void dajMleko() {
        // krowy daja mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muuu");
    }
}
