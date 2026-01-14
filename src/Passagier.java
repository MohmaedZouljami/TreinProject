import java.time.LocalDate;

/**
 * Subklasse van Persoon.
 * Vertegenwoordigt een passagier die kan reizen met de trein.
 */
public class Passagier extends Persoon {
    /**
     * Constructor voor Passagier.
     * Initialiseert de algemene persoonsgegevens via de superklasse.
     */

    public Passagier(String voornaam, String achternaam, String rijksregisternummer,
                     LocalDate geboortedatum) {
        super(voornaam, achternaam, rijksregisternummer, geboortedatum);
    }

    /**
     * Geeft een tekstuele voorstelling van de passagier.
     */
    @Override
    public String toString() {
        return "Passagier{" + super.toString() + "}";
    }
}