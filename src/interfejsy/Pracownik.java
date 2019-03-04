package interfejsy;

public class Pracownik implements NazwaInterfejsu, Cosik, Comparable {
    @Override
    public void cos() {

    }

    Pracownik(double wynagrodzdnie) {
        this.wynagrodzdnie = wynagrodzdnie;
    }

    private double wynagrodzdnie;

    @Override
    public int compareTo(Object o) {

        Pracownik przeslany = (Pracownik) o;
        if (this.wynagrodzdnie < przeslany.wynagrodzdnie)
            return -1;
        else if (this.wynagrodzdnie > przeslany.wynagrodzdnie)
            return 1;
        else
            return 0;
    }


}
