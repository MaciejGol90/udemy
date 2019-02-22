package enkapsulacja;

public class KontoBankowe {
    public KontoBankowe() {
        saldo = 1000;
    }

    private int saldo;

    int getSaldo() {
        return saldo;
    }

    boolean setSaldo(int saldo){

        /*
        WARUNKI
         */

        this.saldo  =saldo;
        return true;
    }


    boolean wyplata(int ile){
        if(saldo<ile)
            return false;
        else
            setSaldo(saldo-ile);
        return true;
    }
    boolean wplata (int ile){
        setSaldo(saldo+ile);
        return true;
    }
}
