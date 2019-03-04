package klasyWewnetrzne;

public class MainKlasyWewnetrzne {
    public static void main(String[] args) {

//        A zewnetrzna = new A();
//        A.B tmp = zewnetrzna.new B();
//
//        A.C tmp2 = new A.C();
        KontoBankowe kontoBankowe = new KontoBankowe(1000);


        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.start(2.37);

        System.out.println(kontoBankowe.getStanKonta());


    }
}

class KontoBankowe {
    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    double getStanKonta() {
        return this.stanKonta;
    }

    void start (double stopa){
        Odsetki odsetki = new Odsetki(stopa);

    }

    class Odsetki {
        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }


        void zmienStanKonta(double stopa){

           double odsetki = (stanKonta * stopaProcentowa) /100;
           stanKonta +=odsetki;


        }
        private double stopaProcentowa;
    }

}