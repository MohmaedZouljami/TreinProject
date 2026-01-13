import java.time.LocalDateTime;
import java.util.ArrayList;
public class reis {
    private String vertrekStation;
    private String aankomstStation;
    private LocalDateTime vertrekTijd;
    private trein trein;
    private ArrayList<Personeelslid> personeelsleden = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public reis(String vertrekStation, String aankomstStation, LocalDateTime vertrekTijd, trein trein) {

        this.vertrekStation = vertrekStation;
        this.aankomstStation = aankomstStation;
        this.vertrekTijd = vertrekTijd;
        this.trein = trein;
    }
        public void voegPersoneelslidToe(Personeelslid p){
        personeelsleden.add(p);
    }
    public void voegTicketToe(Ticket t){
        tickets.add(t);
    }
    public ArrayList<Personeelslid> geefPersoneelsleden(){
        return personeelsleden;
    }
    public ArrayList<Ticket> geefTickets(){
        return tickets; }


    @Override
    public String toString() {
        return "reis{" +
                "vertrekStation='" + vertrekStation + '\'' +
                ", aankomstStation='" + aankomstStation + '\'' +
                ", vertrekTijd=" + vertrekTijd +
                ", trein=" + trein +
                ", personeelsleden=" + personeelsleden +
                ", tickets=" + tickets +
                '}';
    }
}
