package statyczność;

public class Statycznosc {

    int blabla;

    public static void main(String[] args) {

//        Matematyka test = new Matematyka();
        double wynik = Matematyka.dodaj(10,12);


        System.out.println(wynik);


        System.out.println(Matematyka.PI);
        Client a = new Client("Arek");
        Client b = new Client("Marek");
        Client c = new Client("Darek");

        System.out.println(Client.nastepneId);


        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);


    }
}
