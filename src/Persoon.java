
import java.time.LocalDate;
    private String voornaam;
    private String achternaam;
    private String rijksregisternummer;
    private LocalDate geboortedatum;

    public Persoon(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.rijksregisternummer = rijksregisternummer;
        this.geboortedatum = geboortedatum;
    }

    public String geefVoornaam() {
        return voornaam;
    }

    public void stelVoornaamIn(String voornaam) {
        this.voornaam = voornaam;
    }

    public String geefAchterNaam() {
        return achternaam;
    }

    public void stelAchterNaam(String achterNaam) {
        this.achternaam = achterNaam;
    }
    //nu voor de rest

}
