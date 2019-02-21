import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        a = 421212121;
        b = 5;
        c = a * b;

        Monitor abc = new Monitor();
        abc.szer = 123;
        Monitor bba = new Monitor();
        bba.szer = 223;
        bba.wys = 144;

        System.out.println(c);
        System.out.println(bba.wys);

        new Punkt();
        Punkt p;
        p =new Punkt();
//        p.x=5;
//        p.y = 6;

        System.out.println("p.x: "+ p.x);
        System.out.println("p.y: "+ p.y);
    }
}
class Monitor{
    int szer;
    int wys;
}

class Punkt{
    Punkt(){
        System.out.println("Wywołano");
        x=20;
        y=25;
    }
    int x;
    int y;
}
