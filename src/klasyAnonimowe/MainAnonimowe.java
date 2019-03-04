package klasyAnonimowe;

public class MainAnonimowe {
    public static void main(String[] args) {

ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
    @Override
    public void akcja() {
        System.out.println("Jestem z klasy anonimowej");
    }



};
Przycisk p = new Przycisk();
p.dodajAkcje(z);

    }
}
