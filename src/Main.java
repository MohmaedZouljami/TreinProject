/**Wat is Scanner?
 *WScanner laat je toe om gegevens van de gebruiker in te lezen zodat je programma interactief wordt
 * */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        euromoon beheer = new euromoon();
        boolean bezig = true;

        while (bezig) {

            System.out.println(" MENU ");
            System.out.println("1. Passagiers ");
            System.out.println("2. reis");
            System.out.println("3. Trein ");
            System.out.println("4. Ticket ");
            System.out.println("5. klasse");
            int keuze = scanner.nextInt();
            scanner.nextLine();

            int keuze = scanner.nextInt();
            scanner.nextLine();
            switch (keuze) {

                case 1:
                    passagiersToeVoegen(scanner, beheer);
                    break;
                case 2:
                    reisToeVoegen(scanner, beheer);
                    break;
                case 3:
                    treinToeVoegen(scanner,beheer);
                    break;
                case 4:
                    ticketToeVoegen(scanner,beheer);
                    break;
                case 5:
                    klasseToeVoegen(scanner,beheer);
                    break;
                case 0:
                    bezig = false;
                    System.out.println("afsluite");
                    break;

            }

        }
    }
}
public static void passagiersToeVoegen(Scanner scanner, euromoon beheer) {

    System.out.print("voornaam");
    String voornaam = scanner.nextLine();

    System.out.print("achtenaam");
    String achternaam = scanner.nextLine();

    System.out.print("rijkregisternummer");
    String rijkregisternummer = scanner.nextLine();

    System.out.print("geboortejaar");
    int geboortejaar = scanner.nextInt();

    System.out.print("maand");
    int maand = scanner.nextInt();

    System.out.print("dag");
    int dag = scanner.nextInt();

    LocalDate geboortedatum = LocalDate.of(geboortejaar, maand, dag);

    passagiers m = new passagiers(voornaam, achternaam, rijkregisternummer);
}










public static void reisToeVoegen (Scanner scanner, euromoon beheer) {
    System.out.print("Vertrekstation: ");
    String vertrektation = scanner.nextLine();

    System.out.print("Aankomststation");
    String aankomststation = scanner.nextLine();

    System.out.print("jaar: ");
    int jaar = scanner.nextInt();

    System.out.print("maand: ");
    int maand = scanner.nextInt();

    System.out.print("dag: ");
    int dag = scanner.nextInt();

    System.out.print("uur: ");
    int uur = scanner.nextInt();

    System.out.print("minuten: ");
    int min = scanner.nextInt();

    System.out.println("Kies u trein:");


    if (beheer.getReizen().isEmpty()) {
        System.out.println("Geen treinen beschikbaar.");

    }

    trein t = beheer.getTreinen().get(0);
    reis r = new reis(vertrektation, aankomststation);
    LocalDateTime datum = LocalDateTime.of(jaar, maand, dag, uur, min );
}
