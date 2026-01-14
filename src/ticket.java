/**
 * Klasse die een ticket voor een treinreis voorstelt.
 * Bevat informatie over de passagier, de reis en de gekozen klasse.
 */
public class ticket {

    private Passagier passagier;
    private reis reis;
    private KlasseType klasse;

    /**
     * Constructor voor ticket.
     * Initialiseert de passagier, reis en klasse.
     */

    public ticket(Passagier passagier, reis reis, KlasseType klasse) {
        this.passagier = passagier;
        this.reis = reis;
        this.klasse = klasse;
    }

    /**
     * Berekent de prijs van het ticket op basis van de klasse.
     */
    public double getPrijs() {
        if (klasse == KlasseType.EERSTE_KLASSE) {
            return 80.0;
        } else {
            return 50.0;
        }
    }

    /**
     * Geeft de passagier van het ticket terug.
     */
    public Passagier getPassagier() {
        return passagier;
    }

    /**
     * Geeft de reis van het ticket terug.
     */
    public reis getReis() {
        return reis;
    }

    /**
     * Geeft de klasse van het ticket terug.
     */
    public KlasseType getKlasse() {
        return klasse;
    }

    /**
     * Geeft een tekstuele voorstelling van het ticket.
     */
    @Override
    public String toString() {
        return " Ticket voor " + passagier.getVoornaam() + " " + passagier.getAchternaam() + " Reis: " + reis.getVertrekstation() + " → " + reis.getAankomststation() + " om " + reis.getTijdstip() + " Klasse: " + klasse + " Trein: " + reis.getTrein();
    }
}
