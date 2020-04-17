
package Obiektowosc;

public class Prostokat {

    private int bokA;
    private int bokB;
    private String kolor;

    public void podajKolorProstokata (String nowyKolor) {
        kolor = nowyKolor;
    }

    public void podajBokA (int nowyBokA) {
        bokA = nowyBokA;
    }

    public void podajBokB ( int nowyBokB) {
        bokB = nowyBokB;
    }

    public int poleProstokata (int bokA, int bokB) {
        int pole = bokA * bokB;
        return pole;
    }

    public void wypiszInformacje() {
        System.out.println("Kolor prostokąta: " + kolor + " Bok A prostokąta wynosi: " + bokA +
                " Bok B prostokąta wynosi: " + bokB + " Pole prostokąta wynosi: " + poleProstokata(bokA, bokB));
    }
}