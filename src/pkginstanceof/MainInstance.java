package pkginstanceof;

public class MainInstance {
    public static void main(String[] args) {
        Osoba [] osoba = new Osoba[4];
        osoba[0]  = new Pracownik("Arek", "Marek", 100000);
        osoba[1]  = new Student("Jarek", "Tarek");
        osoba[2]  = new Pracownik("Marek", "Sarmancki", 2000);
        osoba[3] = new Student("Rob", "Nob");
//        osoba[1].pobierzOpis();
//        osoba[0].pobierzOpis();

        for (Osoba person: osoba){
            if (person instanceof Pracownik){

                ((Pracownik) person).pobierzOpis();
            }
            else if (person instanceof Student){

                ((Student) person).pobierzOpis();
            }
        }

    }
}
