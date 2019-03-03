package klasaObject;

public class Punkt {
    private int x;
    private int y;

    Punkt() {

    }

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {

        Punkt przyslany = (Punkt) o;

        if (o == null)
            return false;
        if (this.getClass()!= o.getClass())
            return false;


        return this.x == przyslany.x && this.y == przyslany.y;


    }
}
