import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
public class reis {
    private String vertrekstation;
    private String aankomststation;
    private LocalDateTime tijdstip;
    /**
     * HIER KOMT DE TREIN
     */
    private Trein trein;
    private List<ticket> tickets = new ArrayList<>();
    public reis(String vertrekstation, String aankomststation, LocalDateTime tijdstip) {
        this.vertrekstation = vertrekstation;
        this.aankomststation = aankomststation;
        this.tijdstip = tijdstip;
    }

    public String getVertrekstation() {
        return vertrekstation;
    }

    public String getAankomststation() {
        return aankomststation;
    }

    public LocalDateTime getTijdstip() {
        return tijdstip;
    }

    /**
     * TREIN KOPPELEN
     */
    public void setTrein(Trein trein) {
        this.trein = trein;
    }

    public Trein getTrein() {
        return trein;
    }
    public void voegTicketToe(ticket ticket) {
        tickets.add(ticket); }

    public List<ticket> getTickets() {
        return tickets; }

    public boolean heeftPlaats() {
        if (trein == null) return false;
        return tickets.size() < trein.getCapaciteit();
    }

    @Override
    public String toString() {
        return vertrekstation + " → " + aankomststation + " om " + tijdstip;
    }
}