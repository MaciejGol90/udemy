package pkginstanceof;

public class Pracownik extends Osoba {
    int wynagrodzenie;

    Pracownik(String imie, String nazwisko, int wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem Pracownikiem");
        System.out.println("Nazywam się: "+ imie +" "+nazwisko+ " zarabiam: "+ wynagrodzenie+" hajsu!");

    }
    void pracuj (){
        System.out.println("Ja pracuje");
    }
}
