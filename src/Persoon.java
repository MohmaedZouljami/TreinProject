import java.time.LocalDate;

/**
 * Abstracte basisklasse voor personen in het systeem.
 * Bevat gemeenschappelijke persoonsgegevens.
 */
public abstract class Persoon {
    private String voornaam;
    private String achternaam;
    private String rijksregisternummer;
    private LocalDate geboortedatum;

    /**
     * Constructor voor Persoon.
     * Initialiseert de basisgegevens van een persoon.
     */
    public Persoon(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.rijksregisternummer = rijksregisternummer;
        this.geboortedatum = geboortedatum;
    }


    /**
     * Geeft de voornaam van de persoon terug.
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Stelt de voornaam van de persoon in.
     */

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * Geeft de achternaam van de persoon terug.
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Stelt de achternaam van de persoon in.
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     * Geeft het rijksregisternummer van de persoon terug.
     */
    public String getRijksregisternummer() {
        return rijksregisternummer;
    }

    /**
     * Stelt het rijksregisternummer van de persoon in.
     */

    public void setRijksregisternummer(String rijksregisternummer) {
        this.rijksregisternummer = rijksregisternummer;
    }

    /**
     * Geeft de geboortedatum van de persoon terug.
     */
    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Stelt de geboortedatum van de persoon in.
     */


    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     * Geeft een tekstuele voorstelling van de persoon.
     */

    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", rijksregisternummer='" + rijksregisternummer + '\'' +
                ", geboortedatum=" + geboortedatum +
                '}';
    }
}
