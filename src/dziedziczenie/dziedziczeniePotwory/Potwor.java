package dziedziczenie.dziedziczeniePotwory;

public abstract class Potwor {
    public double predkoscChodzenia = 10;
    public double zywotnosc;

    public double getPredkoscChodzenia() {
        return predkoscChodzenia;
    }

    public double getZywotnosc() {
        return zywotnosc;
    }




    public void atakuj(){

        System.out.println("To jest metoda atakuj z klasy potwor");
    }
    public  Potwor(){
        System.out.println("Domyslny konstruktor z klasy Potwor");

    }
    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyslny konstruktor z klasy Potwor");
    }

}
