import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 * Klasse die een treinreis voorstelt.
 * Bevat informatie over vertrek, aankomst, tijdstip, trein, tickets en personeel.
 */
public class reis {
    private String vertrekstation;
    private String aankomststation;
    private LocalDateTime tijdstip;

    private Trein trein;
    private List<ticket> tickets = new ArrayList<>();

    private List<Personeelslid> personeel = new ArrayList<>();

    /**
     * Constructor voor reis.
     * Initialiseert vertrek, aankomst en tijdstip.
     */
    public reis(String vertrekstation, String aankomststation, LocalDateTime tijdstip) {
        this.vertrekstation = vertrekstation;
        this.aankomststation = aankomststation;
        this.tijdstip = tijdstip;
    }

    /**
     * Geeft het vertrekstation terug.
     */
    public String getVertrekstation() {
        return vertrekstation;
    }

    /**
     * Geeft het aankomststation terug.
     */
    public String getAankomststation() {
        return aankomststation;
    }

    /**
     * Geeft het tijdstip van de reis terug.
     */
    public LocalDateTime getTijdstip() {
        return tijdstip;
    }

    /**
     * Koppelt een trein aan deze reis.
     */
    public void setTrein(Trein trein) {
        this.trein = trein;
    }

    /**
     * Geeft de gekoppelde trein terug.
     */
    public Trein getTrein() {
        return trein;
    }

    /**
     * Voegt een ticket toe aan deze reis.
     */
    public void voegTicketToe(ticket ticket) {
        tickets.add(ticket);
    }

    /**
     * Geeft de lijst van tickets terug.
     */

    public List<ticket> getTickets() {
        return tickets;
    }

    /**
     * Voegt een personeelslid toe aan deze reis.
     */
    public void voegPersoneelToe(Personeelslid p) {
        personeel.add(p);
    }

    /**
     * Geeft de lijst van personeelsleden terug.
     */
    public List<Personeelslid> getPersoneel() {
        return personeel;
    }

    /**
     * Controleert of er nog plaatsen beschikbaar zijn op de trein.
     */
    public boolean heeftPlaats() {
        if (trein == null) return false;
        return tickets.size() < trein.getCapaciteit();
    }

    /**
     * Geeft een tekstuele voorstelling van de reis.
     */

    @Override
    public String toString() {
        return vertrekstation + " → " + aankomststation + " om " + tijdstip;
    }
}
