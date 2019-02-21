public class Main {

    public static void main(String[] args) {

        Test a = new Test();
        a.wypisz("Sławomir", "Gol", 28);

        Test a2 = new Test();
        a2.wypisz("Wiolka", "Wala", 300);


        int wynik =a.dodaj(10,220);
        System.out.println(wynik);


        double wynik2 = a.dzielenie(200,1);
        System.out.println(wynik2);


    }
}

class Test {
    void wypisz(String imie, String nazwisko, int age) {
        String me = "Imie: "+imie + " Nazwisko: " + nazwisko + " wiek: " + age;
        System.out.println(me);
    }

    int dodaj(int a, int b) {

        return a+b;
    }

double dzielenie (double a, double b){
        if (b ==0)
        return 0;
    System.out.println("Pamiętaj cholero nie dziel prze zero");

    return a/b;
}

}