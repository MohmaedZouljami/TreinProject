    import java.time.LocalDate;

    /**
     * Subklasse van Personeelslid.
     * Vertegenwoordigt een steward die instaat voor service aan passagiers.
     */

    public class Steward extends Personeelslid {
        /**
         * Constructor voor Steward.
         * Initialiseert de gegevens via de superklasse.
         */
        public Steward(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
            super(voornaam, achternaam, rijksregisternummer, geboortedatum);
        }

        @Override
        public String toString() {
            return "Steward{" + super.toString() + "}";
        }
    }