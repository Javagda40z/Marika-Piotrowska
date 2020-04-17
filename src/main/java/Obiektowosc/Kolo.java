package Obiektowosc;

public class Kolo {

    private double promien;
    private String kolor;

    public void podajPromienKola(double nowyPromien){
        promien = nowyPromien;
    }

    public void podajKolorKola(String nowyKolor) {
        kolor = nowyKolor;
    }

    public double poleKola (double promien) {
        double pole = Math.PI * (promien * promien);
        return pole;
    }

    public void wypiszInformacje() {
        System.out.println("Promień koła wynosi: " + promien + " Kolor koła to: " + kolor +
                " Pole koła wynosi: " + poleKola(promien) );

    }


}