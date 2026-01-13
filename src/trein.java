public class trein {
    private Locomotief locomotief;
    private int aantalWagons;

    public trein(Locomotief locomotief, int aantalWagons) {
        this.locomotief = locomotief;
        stelAantalWagonsIn(aantalWagons);
    }
    private void stelAantalWagonsIn(int aantalWagons) {
        int maximaal = locomotief.getType().geefMaximaalAantalWagons();
        if (aantalWagons < 0 || aantalWagons > maximaal) {
            throw new IllegalArgumentException
            ( "Ongeldig aantal wagons. Maximaal: " + maximaal);
        }
        this.aantalWagons = aantalWagons;
}

    public Locomotief getLocomotief() {
        return locomotief;
    }

    public int getAantalWagons() {
        return aantalWagons;
    }

    @Override
    public String toString() {
        return "trein{" +
                "locomotief=" + locomotief +
                ", aantalWagons=" + aantalWagons +
                '}';
    }
}