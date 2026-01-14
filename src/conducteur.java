import java.time.LocalDate;

/**
 * Subklasse van Personeelslid.
 * Vertegenwoordigt een conducteur die verantwoordelijk is voor controle en begeleiding.
 */
public class conducteur extends Personeelslid {

    /**
     * Constructor voor conducteur.
     * Initialiseert de gegevens via de superklasse.
     */
    public conducteur(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        super(voornaam, achternaam, rijksregisternummer, geboortedatum);
    }

    /**
     * Geeft een tekstuele voorstelling van de conducteur.
     */
    @Override
    public String toString() {
        return "Conducteur{" + super.toString() + "}";
    }
}
