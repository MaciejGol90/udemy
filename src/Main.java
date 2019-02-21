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

        Punkt p = new Punkt(10,22);
        Punkt p2= new Punkt(101,221);



        System.out.println("p.x: "+ p.x);
        System.out.println("p.y: "+ p.y);
        System.out.println("p2.x: "+ p2.x);
        System.out.println("p2.y: "+ p2.y);
    }
}
class Monitor{
    int szer;
    int wys;
}

class Punkt{
    Punkt(){
        System.out.println("Wywołano");

    }
    Punkt(int x, int y){
        System.out.println("Wywołano konstruktor z dwioma paramertami");
        this.x= x;
        this.y=y;
    }
    int x;
    int y;
}
