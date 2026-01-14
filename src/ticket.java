public class ticket {
    private Passagier passagier;
    private reis reis;
    private KlasseType klasse;

    public ticket(Passagier passagier, reis reis, KlasseType klasse) {
        this.passagier = passagier;
        this.reis = reis;
        this.klasse = klasse;
    }
    public double getPrijs() {
        if (klasse == KlasseType.EERSTE_KLASSE) {
            return 80.0;
        } else {
            return 50.0;
        }
    }
    public Passagier getPassagier() {
        return passagier;
    }

    public reis getReis() {
        return reis;
    }

    public KlasseType getKlasse() {
        return klasse;
    }

    @Override
    public String toString() {
        return "🎫 Ticket voor " + passagier.getVoornaam() + " " + passagier.getAchternaam() +
                "🧳 Reis: " + reis.getVertrekstation() + " → " + reis.getAankomststation() +
                " om " + reis.getTijdstip() +
                "📝 Klasse: " + klasse +
                " 🚄Trein: " + reis.getTrein().getType();
    }
}