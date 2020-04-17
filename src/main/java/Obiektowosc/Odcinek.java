package Obiektowosc;

public class Odcinek {

    public static void main(String[] args) {

        Punkt punkt = new Punkt(3, 4);
        Punkt punkt2 = new Punkt(6, 8);

        double x1 = punkt.wspolrzednaJeden;
        double y1 = punkt.wspolrzednaDwa;
        double x2 = punkt2.wspolrzednaJeden;
        double y2 = punkt2.wspolrzednaDwa;

        double dlugosc = odleglosc(x1,y1,x2,y2);
        System.out.println("Długość odcinka wynosi: " + dlugosc);

        System.out.print("|");
        for (int i = 0; i< dlugosc ; i++) {
            System.out.print("-");
        }
        System.out.print("|");

    }

    public static double odleglosc ( double x1, double y1, double x2, double y2){

        double obliczonaOdleglosc = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));

        return obliczonaOdleglosc;
    }

}