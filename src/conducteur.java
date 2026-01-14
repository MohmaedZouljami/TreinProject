import java.time.LocalDate;

public class conducteur extends Personeelslid{
    public conducteur(String voornaam, String achternaam, String rijkregisternummer, LocalDate geboortedatum){
        super(voornaam, achternaam, rijkregisternummer,geboortedatum);
    }


    @Override
    public String toString() {
        return "conducteur{" + super.toString() + "}";
    }
}
