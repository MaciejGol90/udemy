package dziedziczenie;

import dziedziczenie.dziedziczeniePotwory.Potwor;
import dziedziczenie.dziedziczeniePotwory.Szkielet;
import dziedziczenie.dziedziczeniePotwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Szkielet(10, 100);
        Potwor p2 = new Zombie();

        p2.atakuj();
        p.atakuj();

        Potwor p3 = new Pajak(40,120);
        p3.getPredkoscChodzenia();
//        System.out.println(p.getPredkoscChodzenia());
//
//        Szkielet s = new Szkielet(20, 50, "kosa");
//        Zombie z = new Zombie();
//        s.atakuj();
//        z.atakuj();



    }

}
