import java.time.LocalDate;
import java.util.ArrayList;

public class Personeelslid {
    /**
     * Klasse die een personeelslid voorstelt.
     * Bevat algemene gegevens en certificaties.
     */
    private String voornaam;
    private String achternaam;
    private String rijksregisternummer;
    private LocalDate geboortedatum;

    private ArrayList<Certificatie> certificaties = new ArrayList<>();

    /**
     * Constructor voor Personeelslid.
     * Initialiseert de persoonsgegevens.
     */
    // DEZE CONSTRUCTOR IS DE FIX
    public Personeelslid(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {

        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.rijksregisternummer = rijksregisternummer;
        this.geboortedatum = geboortedatum;
    }

    /**
     * Voegt een certificatie toe aan het personeelslid.
     */
    public void voegCertificatieToe(Certificatie c) {
        certificaties.add(c);
    }

    /**
     * Geeft een tekstuele voorstelling van het personeelslid.
     */
    @Override
    public String toString() {
        return voornaam + " " + achternaam + " (" + rijksregisternummer + "), geb. " + geboortedatum;
    }
}
