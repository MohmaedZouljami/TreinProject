import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    // Lijsten om gegevens tijdelijk bij te houden
    private static ArrayList<Passagier> passagiers = new ArrayList<>();
    private static ArrayList<reis> reizen = new ArrayList<>();
    private static ArrayList<Trein> treinen = new ArrayList<>();
    private static ArrayList<ticket> tickets = new ArrayList<>();

    /**
     * Startpunt van het programma.
     * Toont het menu en verwerkt de keuzes van de gebruiker.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bezig = true;

        while (bezig) {
            System.out.println(" TICKET SYSTEEM - HOOFDMENU");
            System.out.println("===============================");
            System.out.println("1️  Passagier registreren");
            System.out.println("2 Reis aanmaken");
            System.out.println("3  Trein toevoegen");
            System.out.println("4 Trein koppelen aan reis");
            System.out.println("5  Ticket verkopen");
            System.out.println("6️  Boardinglijst tonen");
            System.out.println("0 Programma stoppen");
            System.out.print("Maak een keuze: ");

            int keuze = leesInt(scanner);

            switch (keuze) {
                case 1 -> passagierToevoegen(scanner);
                case 2 -> reisToevoegen(scanner);
                case 3 -> treinToevoegen(scanner);
                case 4 -> treinKoppelen(scanner);
                case 5 -> ticketVerkopen(scanner);
                case 6 -> boardingLijst(scanner);
                case 0 -> {
                    bezig = false;
                    System.out.println("Programma afgesloten.");
                }
                default -> System.out.println("Ongeldige keuze.");
            }
        }
        scanner.close();
    }


    /**
     * Leest veilig een geheel getal in via de scanner..
     */

    private static int leesInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print(" Geef een geldig getal: ");
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    /**
     * Controleert of een gekozen index geldig is binnen een lijst.
     */

    private static int kiesIndex(Scanner scanner, int max) {
        int index = leesInt(scanner);
        if (index < 0 || index >= max) {
            System.out.println(" Ongeldige index.");
            return -1;
        }
        return index;
    }

    /**
     * Registreert een nieuwe passagier.
     */

    // 1️ PASSAGIER TOEVOEGEN
    private static void passagierToevoegen(Scanner scanner) {
        System.out.print("Voornaam: ");
        String voornaam = scanner.nextLine();

        System.out.print("Achternaam: ");
        String achternaam = scanner.nextLine();

        System.out.print("Rijksregisternummer: ");
        String rijks = scanner.nextLine();

        System.out.print("Geboortejaar: ");
        int jaar = leesInt(scanner);
        System.out.print("Maand: ");
        int maand = leesInt(scanner);
        System.out.print("Dag: ");
        int dag = leesInt(scanner);

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);
        passagiers.add(new Passagier(voornaam, achternaam, rijks, geboortedatum));

        System.out.println(" Passagier toegevoegd!");
    }

    /**
     * Maakt een nieuwe reis aan.
     */
    // 2 REIS TOEVOEGEN
    private static void reisToevoegen(Scanner scanner) {
        System.out.print("Vertrekstation: ");
        String vertrek = scanner.nextLine();

        System.out.print("Aankomststation: ");
        String aankomst = scanner.nextLine();

        System.out.print("Jaar: ");
        int jaar = leesInt(scanner);
        System.out.print("Maand: ");
        int maand = leesInt(scanner);
        System.out.print("Dag: ");
        int dag = leesInt(scanner);
        System.out.print("Uur: ");
        int uur = leesInt(scanner);
        System.out.print("Minuten: ");
        int min = leesInt(scanner);

        LocalDateTime tijdstip = LocalDateTime.of(jaar, maand, dag, uur, min);
        reizen.add(new reis(vertrek, aankomst, tijdstip));

        System.out.println(" Reis toegevoegd!");
    }

    /**
     * Voegt een trein toe op basis van het gekozen locomotieftype.
     */
    // 3️ TREIN TOEVOEGEN (LocomotiefType)
    private static void treinToevoegen(Scanner scanner) {
        System.out.println("Kies type locomotief:");
        System.out.println("1️  CLASS_373 (12 wagons, 960 zitplaatsen)");
        System.out.println("2️ CLASS_374 (14 wagons, 1120 zitplaatsen)");
        System.out.print("Keuze: ");

        int keuze = leesInt(scanner);

        LocomotiefType type;
        switch (keuze) {
            case 1 -> type = LocomotiefType.CLASS_373;
            case 2 -> type = LocomotiefType.CLASS_374;
            default -> {
                System.out.println(" Ongeldige keuze.");
                return;
            }
        }

        Trein t = new Trein(type);
        treinen.add(t);

        System.out.println(" Trein toegevoegd: " + t);
    }

    /**
     * Koppelt een bestaande trein aan een bestaande reis.
     */
    // 4️ TREIN KOPPELEN AAN REIS
    private static void treinKoppelen(Scanner scanner) {
        if (reizen.isEmpty() || treinen.isEmpty()) {
            System.out.println(" Zorg dat er reizen en treinen bestaan.");
            return;
        }

        System.out.println("Kies een reis:");
        for (int i = 0; i < reizen.size(); i++) {
            System.out.println(i + ". " + reizen.get(i));
        }
        int reisIndex = kiesIndex(scanner, reizen.size());
        if (reisIndex == -1) return;

        System.out.println("Kies een trein:");
        for (int i = 0; i < treinen.size(); i++) {
            System.out.println(i + ". " + treinen.get(i));
        }
        int treinIndex = kiesIndex(scanner, treinen.size());
        if (treinIndex == -1) return;

        reizen.get(reisIndex).setTrein(treinen.get(treinIndex));
        System.out.println("✔ Trein gekoppeld aan reis!");
    }

    /**
     * Verkoopt een ticket voor een passagier en een reis.
     */
    // 5️ TICKET VERKOPEN
    private static void ticketVerkopen(Scanner scanner) {
        if (passagiers.isEmpty() || reizen.isEmpty()) {
            System.out.println("Geen passagiers of reizen beschikbaar.");
            return;
        }

        System.out.println("Kies passagier:");
        for (int i = 0; i < passagiers.size(); i++) {
            System.out.println(i + ". " + passagiers.get(i));
        }
        int pIndex = kiesIndex(scanner, passagiers.size());
        if (pIndex == -1) return;

        System.out.println("Kies reis:");
        for (int i = 0; i < reizen.size(); i++) {
            System.out.println(i + ". " + reizen.get(i));
        }
        int rIndex = kiesIndex(scanner, reizen.size());
        if (rIndex == -1) return;

        reis r = reizen.get(rIndex);
        if (r.getTrein() == null || !r.heeftPlaats()) {
            System.out.println(" Geen trein of geen plaatsen.");
            return;
        }

        System.out.println("Kies klasse:");
        System.out.println("1. Eerste klasse");
        System.out.println("2. Tweede klasse");
        int k = leesInt(scanner);

        KlasseType klasse = (k == 1) ? KlasseType.EERSTE_KLASSE : KlasseType.TWEEDE_KLASSE;

        ticket t = new ticket(passagiers.get(pIndex), r, klasse);
        tickets.add(t);
        r.voegTicketToe(t);

        System.out.println("✔ Ticket verkocht!");
        System.out.println(t);
    }

    /**
     * Toont de boardinglijst van een gekozen reis.
     */

    // 6️ BOARDINGLIJST
    private static void boardingLijst(Scanner scanner) {
        if (reizen.isEmpty()) {
            System.out.println(" Geen reizen.");
            return;
        }

        System.out.println("Kies een reis:");
        for (int i = 0; i < reizen.size(); i++) {
            System.out.println(i + ". " + reizen.get(i));
        }
        int index = kiesIndex(scanner, reizen.size());
        if (index == -1) return;

        reis r = reizen.get(index);

        System.out.println(" BOARDINGLIJST");
        System.out.println("Reis: " + r);
        System.out.println("Trein: " + r.getTrein());

        System.out.println("Passagiers:");
        for (ticket t : r.getTickets()) {
            System.out.println("- " + t.getPassagier().getVoornaam() + " " + t.getPassagier().getAchternaam());
        }
    }
}