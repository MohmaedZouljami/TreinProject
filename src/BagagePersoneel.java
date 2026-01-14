import java.time.LocalDate;
    public class BagagePersoneel extends Personeelslid{
        public BagagePersoneel(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum){
            super(voornaam, achternaam, rijksregisternummer, geboortedatum);}

        @Override
        public String toString() {
            return "BagagePersoneel{" + super.toString() + "}";
        }
    }

