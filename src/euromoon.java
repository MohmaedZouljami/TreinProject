import java.util.ArrayList;
public class euromoon{
    private ArrayList<Passagier> Passagier = new ArrayList<>();
    private ArrayList<Personeelslid> Personeelsleden = new ArrayList<>();
    private ArrayList<Trein> Trein = new ArrayList<>();
    private ArrayList<reis> Reis = new ArrayList<>();
    private ArrayList<ticket> Ticket = new ArrayList<>();


    public ArrayList<Passagier> getPassagiers() {
        return Passagier;
    }

    public void setPassagier(ArrayList<Passagier> passagiers) {
        this.Passagier = Passagier;
    }

    public ArrayList<Personeelslid> getPersoneelsleden() {
        return Personeelsleden;
    }

    public void setPersoneelsleden(ArrayList<Personeelslid> personeelsleden) {
        this.Personeelsleden = personeelsleden;
    }

    public ArrayList<Trein> getTreinen(Trein t) {
        return Trein;
    }

    public void setTreinen(ArrayList<Trein> treinen) {
        this.Trein = treinen;
    }

    public ArrayList<reis> getReizen() {
        return Reis;
    }

    public void setReizen(ArrayList<reis> reizen) {
        this.Reis = reizen;
    }

    public ArrayList<ticket> getTickets() {
        return Ticket;
    }

    public void setTickets(ArrayList<ticket> tickets) {
        this.Ticket = tickets;
    }


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
