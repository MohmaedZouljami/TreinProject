/**
 * Klasse die een trein voorstelt.
 * De capaciteit wordt berekend op basis van het locomotieftype.
 */
public class Trein {

    private LocomotiefType type;
    private int capaciteit;

    /**
     * Constructor voor Trein.
     * Berekent de totale capaciteit op basis van het aantal wagons.
     */
    public Trein(LocomotiefType type) {
        this.type = type;
        this.capaciteit = type.geefMaximaalAantalWagons() * 80;
    }

    /**
     * Geeft het type van de trein terug.
     */
    public LocomotiefType getType() {
        return type;
    }

    /**
     * Geeft de totale capaciteit van de trein terug.
     */
    public int getCapaciteit() {
        return capaciteit;
    }

    @Override
    public String toString() {
        return type + " (" + type.geefMaximaalAantalWagons() + " wagons, " + capaciteit + " zitplaatsen)";
    }
}