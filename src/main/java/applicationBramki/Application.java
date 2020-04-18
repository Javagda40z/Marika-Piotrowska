package applicationBramki;

import bramka.Bramka;
import bramka.KalkulatorOplat;
import bramka.Raport;
import bramka.RejestrPojazdow;
import pojazdy.Autobus;
import pojazdy.Motocykl;
import pojazdy.Paliwo;
import pojazdy.Samochod;

public class Application {

    public static void main(String[] args) {

        RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
        Bramka bramka = new Bramka(rejestrPojazdow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());

        Motocykl motocykl = new Motocykl("GD12345", Paliwo.BENZYNA);
        Samochod samochod = new Samochod("GD56789", Paliwo.BENZYNA);
        Autobus autobus = new Autobus("GD56489", Paliwo.BENZYNA);

        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka.wyjazd(samochod, 10);
        bramka.wyjazd(autobus, 100);

        bramka.wjazd(samochod);
        bramka.wjazd(motocykl);

        Raport raport = bramka.przygotujRaport();

        raport.wyswietl (); // Raczej powinna być klasa od wyswietlania raportu


    }
}
