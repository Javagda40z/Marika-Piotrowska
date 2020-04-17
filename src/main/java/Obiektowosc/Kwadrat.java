
package Obiektowosc;

public class Kwadrat {

    private int bokA;
    private String kolor;

    public void podajBokA (int nowyBokA){
        bokA = nowyBokA;
    }

    public void podajKolorKwadratu (String nowyKolorKwadratu){
        kolor = nowyKolorKwadratu;
    }

    public int poleKwadratu (int bokA) {
        int pole = bokA*bokA;
        return pole;
    }

    public void wypiszInforamcje () {
        System.out.println("Kolor kwadtratu to: " + kolor + " Bok kwadratu wynosi: " + bokA +
                " Pole kwadratu wynosi: " + poleKwadratu(bokA));
    }

}