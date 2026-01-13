public class Locomotief {
    private LocomotiefType type;
    private int maximaleAantalPersonen;

    public Locomotief(LocomotiefType type) {
        this.type = type;
        this.maximaleAantalPersonen = 80;
    }
    public LocomotiefType getType() {
        return type;
}
    public int getMaximaleAantalPersonen() {
        return maximaleAantalPersonen;
    }

    @Override
    public String toString() {
        return "Locomotief{" +
                "type=" + type +
                ", maximaleAantalPersonen=" + maximaleAantalPersonen +
                '}';
    }
}