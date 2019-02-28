package dziedziczenie;

import dziedziczenie.dziedziczeniePotwory.Potwor;
import dziedziczenie.dziedziczeniePotwory.Szkielet;
import dziedziczenie.dziedziczeniePotwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Potwor(10, 100);

        System.out.println(p.getPredkoscChodzenia());

        Szkielet s = new Szkielet(20, 50, "kosa");
        Zombie z = new Zombie();
        s.atakuj();
        z.atakuj();



    }
}
