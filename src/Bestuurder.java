import java.time.LocalDate;
public class Bestuurder extends Personeelslid {
    public Bestuurder(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum){
        super(voornaam, achternaam, rijksregisternummer, geboortedatum); }

    @Override
    public String toString() {
        return "Bestuurder{}";
    }
}