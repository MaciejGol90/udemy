package pkginstanceof;

public class MainInstance {
    public static void main(String[] args) {
        Osoba [] osoba = new Osoba[4];
        osoba[0]  = new Pracownik("Arek", "Marek", 100000);
        osoba[1]  = new Student("Jarek", "Tarek");
//        osoba[1].pobierzOpis();
//        osoba[0].pobierzOpis();

        for (Osoba person: osoba){
            if (person instanceof Osoba)
            person.pobierzOpis();
            else
                break;
        }

    }
}
