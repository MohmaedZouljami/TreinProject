import java.util.ArrayList;
public class euromoon{
    private ArrayList<passagiers> passagiers = new ArrayList<>();
    private ArrayList<Personeelslid> personeelsleden = new ArrayList<>();
    private ArrayList<trein> treinen = new ArrayList<>();
    private ArrayList<reis> reizen = new ArrayList<>();
    private ArrayList<ticket> tickets = new ArrayList<>();


    public ArrayList<passagiers> getPassagiers() {
        return passagiers;
    }

    public void setPassagiers(ArrayList<passagiers> passagiers) {
        this.passagiers = passagiers;
    }

    public ArrayList<Personeelslid> getPersoneelsleden() {
        return personeelsleden;
    }

    public void setPersoneelsleden(ArrayList<Personeelslid> personeelsleden) {
        this.personeelsleden = personeelsleden;
    }

    public ArrayList<trein> getTreinen() {
        return treinen;
    }

    public void setTreinen(ArrayList<trein> treinen) {
        this.treinen = treinen;
    }

    public ArrayList<reis> getReizen() {
        return reizen;
    }

    public void setReizen(ArrayList<reis> reizen) {
        this.reizen = reizen;
    }

    public ArrayList<ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<ticket> tickets) {
        this.tickets = tickets;
    }


    @Override
    public String toString() {
        return "euromoon{" +
                "passagiers=" + passagiers +
                ", personeelsleden=" + personeelsleden +
                ", treinen=" + treinen +
                ", reizen=" + reizen +
                ", tickets=" + tickets +
                '}';
    }
}
