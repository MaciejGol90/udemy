package referencje;

public class Referencje {
    public static void main(String[] args) {

//        int a = 53;
//
//        int b = a;
//
//        b= 30;
//
//        System.out.println(a);
//
//        Test x = new Test(); // nie znajduje się żadna wartość tylko adres
//        Test y = x;
//
//        y.a = 40;
//
//        System.out.println(x.a);
//
//        String imie = "Arek";
//        String imie2 = new String(imie);
//        imie2 = "tralala";
//
//        System.out.println(imie);
        int a = 5;

        Test x = new Test();



        System.out.println(a);

        Foo foo = new Foo();

        x.zmiennaWartość(foo);

        System.out.println(foo.y);


    }
}
