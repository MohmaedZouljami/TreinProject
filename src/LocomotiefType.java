
/**
 * Enum die de verschillende types locomotieven voorstelt.
 * Elk type heeft een maximaal aantal wagons.
 */
public enum LocomotiefType {
    CLASS_373(12), CLASS_374(14);

    private int maximaalAantalWagons;

    /**
     * Constructor die het maximaal aantal wagons instelt.
     */

    private LocomotiefType(int maximaalAantalWagons) {
        this.maximaalAantalWagons = maximaalAantalWagons;
    }

    /**
     * Geeft het maximaal aantal wagons van het locomotieftype terug.
     */

    public int geefMaximaalAantalWagons() {
        return maximaalAantalWagons;
    }
}
