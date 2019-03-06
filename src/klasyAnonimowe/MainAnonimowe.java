package klasyAnonimowe;

public class MainAnonimowe {
    public static void main(String[] args) {

        ZachowaniePoWcisnieciu z = () -> {

            System.out.println("Jestem z klasy anonimowej");
        };

        ZachowaniePoWcisnieciu2 z2 = (a, b) -> a+b;



        Przycisk p = new Przycisk();
        p.dodajAkcje(() -> {
            System.out.println("Jestem z klasy anonimowej");

        });
       int wynik =  p.dodajAkcje2(2, 220, z2);
        System.out.println(wynik);


    }
}

/*
Lambda:
() argumenty do przeslania funkcji
-> informacja że mamy do czenienia z wyrazeniem lambda
{} treść wyrazenia
 */
