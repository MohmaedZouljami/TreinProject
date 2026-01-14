import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    private static ArrayList<Passagier> Passagier = new ArrayList<>();
    private static ArrayList<reis> reizen = new ArrayList<>();
    private static ArrayList<ticket> tickets = new ArrayList<>();
    private static ArrayList<Trein> treinen = new ArrayList<Trein>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bezig = true;
        while (bezig) {
            System.out.println("\n===============================");
            System.out.println("🚉  TICKET SYSTEEM - HOOFDMENU");
            System.out.println("===============================");
            System.out.println("1️⃣  Passagier registreren");
            System.out.println("2️⃣  Reis aanmaken");
            System.out.println("3️⃣  Trein koppelen");
            System.out.println("4️⃣  Ticket verkopen");
            System.out.println("0️⃣  Programma stoppen");
            System.out.print("👉 Maak een keuze: ");




            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
                    PassagierToevoegen(scanner);
                    break;
                case 2:
                    reisToevoegen(scanner);
                    break;
                case 3:
                    TreinToevoegen(scanner);
                    break;
                case 4:
                    ticketToevoegen(scanner);
                    break;

                case 0:
                    bezig = false;
                    System.out.println("Programma afgesloten.");
                    break;

                default:
                    System.out.println("Ongeldige keuze.");

            }
        }
    }


    private static void PassagierToevoegen(Scanner scanner) {
        System.out.print("Voornaam: ");
        String voornaam = scanner.nextLine();

        System.out.print("Achternaam: ");
        String achternaam = scanner.nextLine();

        System.out.print("Rijksregisternummer: ");
        String rijks = scanner.nextLine();

        System.out.print("Geboortejaar: ");
        int jaar = scanner.nextInt();

        System.out.print("Maand: ");
        int maand = scanner.nextInt();

        System.out.print("Dag: ");
        int dag = scanner.nextInt();
        scanner.nextLine();

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);

        Passagier p = new Passagier(voornaam, achternaam, rijks, geboortedatum);
        Passagier.add(p);

        System.out.println("Passagier toegevoegd!");
    }

    private static void reisToevoegen(Scanner scanner) {
        System.out.print("Vertrekstation: ");
        String vertrek = scanner.nextLine();

        System.out.print("Aankomststation: ");
        String aankomst = scanner.nextLine();

        System.out.print("Jaar: ");
        int jaar = scanner.nextInt();

        System.out.print("Maand: ");
        int maand = scanner.nextInt();

        System.out.print("Dag: ");
        int dag = scanner.nextInt();

        System.out.print("Uur: ");
        int uur = scanner.nextInt();

        System.out.print("Minuten: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime tijdstip = LocalDateTime.of(jaar, maand, dag, uur, min);
        reis r = new reis(vertrek, aankomst, tijdstip);
        Main.reizen.add(r);

    }

    private static void TreinToevoegen(Scanner scanner) {
        System.out.println("Kies een locomotief type:");
        System.out.println("1. CLASS_373 (12 wagons)");
        System.out.println("2. CLASS_374 (14 wagons)");
        System.out.print("Keuze: ");

        int keuze = scanner.nextInt();
        scanner.nextLine();

        LocomotiefType type;

        if (keuze == 1) {
            type = LocomotiefType.CLASS_373;
        } else if (keuze == 2) {
            type = LocomotiefType.CLASS_374;
        } else {
            System.out.println("Ongeldige keuze.");
            return;
        }
        Trein t = new Trein(type);
        treinen.add(t);
        System.out.println("Trein toegevoegd: " + t);
    }

    private static void ticketToevoegen(Scanner scanner) {

        if (Passagier.isEmpty()) {
            System.out.println("❌ Er zijn nog geen passagiers geregistreerd.");
            return;
        }

        if (reizen.isEmpty()) {
            System.out.println("❌ Er zijn nog geen reizen aangemaakt.");
            return;
        }

        if (treinen.isEmpty()) {
            System.out.println("❌ Er is nog geen trein gekoppeld.");
            return;
        }

        // Automatisch eerste passagier, eerste reis, eerste trein
        Passagier passagier = Passagier.get(0);
        reis gekozenReis = reizen.get(0);
        Trein trein = treinen.get(0);

        // Koppel trein aan reis (indien nog niet gebeurd)
        gekozenReis.setTrein(trein);

        // Standaard klasse
        KlasseType klasse = KlasseType.EERSTE_KLASSE;

        // Ticket aanmaken (GEEN capaciteit-check meer)
        ticket ticket = new ticket(passagier, gekozenReis, klasse);
        tickets.add(ticket);

        // Resultaat tonen
        System.out.println("\n===============================");
        System.out.println("🎫  TICKET");
        System.out.println("===============================");
        System.out.println(ticket);

    }
}