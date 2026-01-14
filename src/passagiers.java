import java.time.LocalDate;

public class passagiers {

    public passagiers(String voornaam, String achternaam, String rijkregisternummer) {
    }

    public class Passagier extends Persoon {
        public Passagier(String voornaam, String achternaam, String rijksregisternummer,
                         LocalDate geboortedatum) {
            super(voornaam, achternaam, rijksregisternummer, geboortedatum); }

        }
}
