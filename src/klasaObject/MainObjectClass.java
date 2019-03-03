package klasaObject;

public class MainObjectClass {
    public static void main(String[] args) {

        Object[] punkty = new Punkt[4];

        punkty[0] = new Punkt(2,1);
        punkty[1] = new Punkt(3,4);
        punkty[2] = new Punkt(4,5);
        punkty[3] = new Punkt(7,3);

        for (int i = 0; i <punkty.length; i++){
            System.out.println(punkty[i]);
        }


//        Object a =new Punkt(4, 50);
//
//        Punkt punkt = new Punkt(4, 10);
//        Punkt punkt2 = new Punkt(4, 30);
//
//
//        if (punkt.equals(punkt2)){
//            System.out.println("Są sobie równe");
//        } else System.out.println("Nie są równe");
//
//        System.out.println();
    }
}
