public class ticket {
    private passagiers passagier;
    private reis reis;
    private KlasseType klasse;

    public ticket(passagiers passagier, reis reis, KlasseType klasse) {
        this.passagier = passagier;
        this.reis = reis;
        this.klasse = klasse;
    }

    public passagiers geefPassagier() {
        return passagier;
    }


    public reis geefReis(reis reis) {
        return reis;
    }

    public KlasseType geefKlasse(KlasseType klasse) {
        return klasse;
    }

    @Override
    public String toString() {
        return "ticket{" +
                "passagier=" + passagier +
                ", reis=" + reis +
                ", klasse=" + klasse +
                '}';
    }
}


