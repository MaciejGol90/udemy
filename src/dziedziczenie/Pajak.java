package dziedziczenie;

import dziedziczenie.dziedziczeniePotwory.Potwor;

public class Pajak extends Potwor {


    public Pajak(double predkoscChodzenia, double zywotnosc) {

        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstruktor klasy Pająk z dwoma argumentami");
    }
}