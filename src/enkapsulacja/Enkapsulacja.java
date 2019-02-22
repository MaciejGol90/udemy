package enkapsulacja;

public class Enkapsulacja {
    public static void main(String[] args) {
        KontoBankowe oszczednosciowe = new KontoBankowe();

        if (oszczednosciowe.wyplata(200)){
            System.out.println("wyplacono");

        }
        else
            System.out.println("za mało kasy");

        if (oszczednosciowe.wplata(2000)){
            System.out.println("wplacono");

        }
        else
            System.out.println("za mało kasy");


        System.out.println("saldo: "+oszczednosciowe.getSaldo());
    }
}
