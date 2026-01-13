import java.time.LocalDate;

public class passagiers {

    public class Passagier extends Persoon {
        public Passagier(String voornaam, String achternaam, String rijksregisternummer,
                         LocalDate geboortedatum) {
            super(voornaam, achternaam, rijksregisternummer, geboortedatum); }

        }
}
