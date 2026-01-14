import java.time.LocalDate;

/**
 * Subklasse van Personeelslid.
 * Vertegenwoordigt een personeelslid dat verantwoordelijk is voor bagage.
 */
public class BagagePersoneel extends Personeelslid {
    /**
     * Constructor voor BagagePersoneel.
     * Initialiseert de algemene gegevens via de superklasse.
     */
    public BagagePersoneel(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        super(voornaam, achternaam, rijksregisternummer, geboortedatum);
    }

    /**
     * Geeft een tekstuele voorstelling van het bagagepersoneel.
     */
    @Override
    public String toString() {
        return "BagagePersoneel{" + super.toString() + "}";
    }
}

