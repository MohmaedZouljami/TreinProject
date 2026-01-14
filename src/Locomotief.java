/**
 * Klasse die een locomotief voorstelt.
 * Een locomotief heeft een type en een maximale capaciteit.
 */
public class Locomotief {
    private LocomotiefType type;
    private int maximaleAantalPersonen;

    /**
     * Constructor voor Locomotief.
     * Initialiseert het type en de maximale capaciteit.
     */
    public Locomotief(LocomotiefType type) {
        this.type = type;
        this.maximaleAantalPersonen = 80;
    }

    /**
     * Geeft het type van de locomotief terug.
     */
    public LocomotiefType getType() {
        return type;
    }

    /**
     * Geeft het maximale aantal personen per wagon terug.
     */

    public int getMaximaleAantalPersonen() {
        return maximaleAantalPersonen;
    }

    /**
     * Geeft een tekstuele voorstelling van de locomotief.
     */
    @Override
    public String toString() {
        return "Locomotief{" +
                "type=" + type +
                ", maximaleAantalPersonen=" + maximaleAantalPersonen +
                '}';
    }
}