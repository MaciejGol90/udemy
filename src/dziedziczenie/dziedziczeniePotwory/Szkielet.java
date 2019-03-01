package dziedziczenie.dziedziczeniePotwory;

public class Szkielet extends Potwor {

    public void atakuj(){
        System.out.println("To jest medoda atakuj w szkieletem!!!");
    }

    String typBroni;
    public Szkielet() {
        System.out.println("Domyslny konstruktor z klasy Szkielet");
    }


    public Szkielet(double predkoscChodzenia, double zywotnosc) {

        super(predkoscChodzenia,zywotnosc);
        System.out.println("Niedomyślny konstruktor klasy Szkielet z dwoma argumentami");

    }
        public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor z klasy Szkielet");

    }

}
