package klasyWewnetrzne;

public class A {

    A(){
        System.out.println("Jestem z klay zwenętrznej A");
    }
    class B{

        B(){
            System.out.println("Jestem z klasy wewnetrznej B");
        }
        void cos(){
            test=5;


        }
        private int tmp;

    }

   static class C{
        C(){
            System.out.println("Jestem z klasy zagniezdzonej C");
        }
    }

    void cos2(){
        //tmp = 5;

        B obj = new B();
    }


    private int test;
}
