import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Personeelslid extends Persoon {
    private Set<Certificatie> certificaties = new HashSet<>();
        public Personeelslid(String voornaam, String achternaam, String rijksregisternummer, LocalDate geboortedatum) {
        super(voornaam, achternaam, rijksregisternummer, geboortedatum);
        this.certificaties = certificaties;
    }

    public Set<Certificatie> getCertificaties() {
        return certificaties;
    }

    public void setCertificaties(Set<Certificatie> certificaties) {
        this.certificaties = certificaties;
    }

    @Override
    public String toString() {
        return "Personeelslid{" + super.toString() + ", certificaties=" + certificaties + "}";

    }
}