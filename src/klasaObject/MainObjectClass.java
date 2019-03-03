package klasaObject;

public class MainObjectClass {
    public static void main(String[] args) {
        Object a =new Punkt(4, 50);

        Punkt punkt = new Punkt(4, 10);
        Punkt punkt2 = new Punkt(4, 30);


        if (punkt.equals(punkt2)){
            System.out.println("Są sobie równe");
        } else System.out.println("Nie są równe");

        System.out.println();
    }
}
