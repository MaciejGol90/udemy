package exceptions;

public class Wyjatki {
    public static void main(String[] args) {
try {
        int a = 10;
        if (a == 10)
            throw new MojWyjatek("A jest równe 10");
    } catch (MojWyjatek mx){
    System.out.println(mx.getMessage());
    }
       try{

           System.out.println(5/0);
       }catch (Exception ex){
           System.out.println("Cholero nie dziel przez ZERO!!!");
           System.out.println(ex.getMessage());

       }finally {
           System.out.println("Coś co zawsze będzie wykonane");
       }


        System.out.println("Cokolwiek");

        /*
        try{
        //  instrukcje które moga spowodowac wyjatek
        }catch(NazwaZwroconegoWyjatku) {
            instrukcje co masie wydarzyc po zlapaniu wyjatku

         */
    }

}
