
package Obiektowosc;

public class Trojkat {

    private int podstawaA;
    private int wysokoscH;
    private String kolor;

    public void podajWysokosc (int nowaWysokosc){
        wysokoscH = nowaWysokosc;
    }
    public void podajPodstawe ( int nowaPodstawa) {
        podstawaA = nowaPodstawa;
    }

    public void podajKolorTrojkata (String nowyKolorKwadratu){
        kolor = nowyKolorKwadratu;
    }

    public int poleTrojkata (int wysokoscH, int podstawaA) {
        int pole = (podstawaA*wysokoscH)/2 ;
        return pole;
    }

    public void wypiszInforamcje () {
        System.out.println("Kolor trójkąta to: " + kolor + " Podstawa trójkąta wynosi: " + podstawaA +
                " Wysokość trójkąta wynosi: " + wysokoscH + " Pole kwadratu wynosi: " + poleTrojkata(wysokoscH,podstawaA) );
    }
}