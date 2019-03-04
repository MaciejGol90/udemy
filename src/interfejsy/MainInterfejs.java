package interfejsy;

import java.util.Arrays;

public class MainInterfejs {
    public static void main(String[] args) {


        System.out.println(NazwaInterfejsu.PI);

        int[] tab = new int[3];

        tab[0] = 3;
        tab[1] = 7;
        tab[2] = 5;
        Arrays.sort(tab);

        System.out.println(tab[0]);


        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(50000);
        pracownik[1] = new Pracownik(30000);
        pracownik[2] = new Pracownik(50000);


        Arrays.sort(pracownik);

        System.out.println(pracownik[0].compareTo(pracownik[1]));
    }
}
