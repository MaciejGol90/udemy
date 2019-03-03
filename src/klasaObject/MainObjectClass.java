package klasaObject;

public class MainObjectClass {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(4, 10);
        Punkt punkt2 = new Punkt(20, 30);


        if (punkt.equals(punkt2)){
            System.out.println("Są sobie równe");
        } else System.out.println("Nie są równe");
    }
}
