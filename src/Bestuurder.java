import java.time.LocalDate;

/**
 * Subklasse van Personeelslid.
 * Vertegenwoordigt een bestuurder van een trein.
 */
public class Bestuurder extends Personeelslid {
    /**
     * Constructor voor Bestuurder.
     * Roept de constructor van Personeelslid aan.
     */
    public Bestuurder(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        super(voornaam, achternaam, rijksregisternummer, geboortedatum);
    }

    /**
     * Geeft een tekstuele voorstelling van de bestuurder.
     */

    @Override
    public String toString() {
        return "Bestuurder{" + super.toString() + "}";

    }
}