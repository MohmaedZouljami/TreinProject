import java.util.ArrayList;

/**
 * Centrale klasse die alle gegevens van het systeem bijhoudt.
 * Bevat lijsten van passagiers, personeelsleden, treinen, reizen en tickets.
 */
public class euromoon {

    // Lijsten met de verschillende entiteiten van het systeem
    private ArrayList<Passagier> Passagier = new ArrayList<>();
    private ArrayList<Personeelslid> Personeelsleden = new ArrayList<>();
    private ArrayList<Trein> Trein = new ArrayList<>();
    private ArrayList<reis> Reis = new ArrayList<>();
    private ArrayList<ticket> Ticket = new ArrayList<>();

    /**
     * Geeft de lijst van passagiers terug.
     */

    public ArrayList<Passagier> getPassagiers() {
        return Passagier;
    }

    /**
     * Stelt de lijst van passagiers in.
     */
    public void setPassagier(ArrayList<Passagier> passagiers) {
        this.Passagier = Passagier;
    }

    /**
     * Geeft de lijst van personeelsleden terug.
     */
    public ArrayList<Personeelslid> getPersoneelsleden() {
        return Personeelsleden;
    }

    /**
     * Stelt de lijst van personeelsleden in.
     */


    public void setPersoneelsleden(ArrayList<Personeelslid> personeelsleden) {
        this.Personeelsleden = personeelsleden;
    }

    /**
     * Geeft de lijst van treinen terug.
     */
    public ArrayList<Trein> getTreinen(Trein t) {
        return Trein;
    }

    /**
     * Stelt de lijst van treinen in.
     */
    public void setTreinen(ArrayList<Trein> treinen) {
        this.Trein = treinen;
    }

    /**
     * Geeft de lijst van reizen terug.
     */

    public ArrayList<reis> getReizen() {
        return Reis;
    }

    /**
     * Stelt de lijst van reizen in.
     */
    public void setReizen(ArrayList<reis> reizen) {
        this.Reis = reizen;
    }

    /**
     * Geeft de lijst van tickets terug.
     */

    public ArrayList<ticket> getTickets() {
        return Ticket;
    }

    /**
     * Stelt de lijst van tickets in.
     */

    public void setTickets(ArrayList<ticket> tickets) {
        this.Ticket = tickets;
    }

    /**
     * Geeft een overzicht van alle opgeslagen gegevens.
     */


    @Override
    public String toString() {
        return "euromoon{" +
                "passagiers=" + Passagier +
                ", personeelsleden=" + Personeelsleden +
                ", treinen=" + Trein +
                ", reizen=" + Reis +
                ", tickets=" + Ticket +
                '}';
    }
}
