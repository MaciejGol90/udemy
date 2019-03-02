package dziedziczenie.dziedziczeniePotwory;

public class Zombie extends Potwor {

    @Override
    public void atakuj() {
        System.out.println("Metoda atakowania przez zombiaka");
    }

    public Zombie(){
    System.out.println("Domyslny konstruktor z klasy Zombie");
}
}
