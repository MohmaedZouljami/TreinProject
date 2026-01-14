class Trein {
    private LocomotiefType type;
    private int wagons;
    private int plaatsenPerWagon = 80;
    private int capaciteit;


    public Trein(LocomotiefType type){
        this.type = type;


        if (type == LocomotiefType.CLASS_373){
            this.wagons = 12;}
        else{
            this.wagons = 14;
        } }


    public LocomotiefType getType() {
        return type; }

    public int getWagons() {
        return wagons;

    }
    public int getPlaatsenPerWagon() {
        return plaatsenPerWagon;

    } public int getTotalePlaatsen(){
        return wagons * plaatsenPerWagon; }

    @Override public String toString(){
        return type + " - " + wagons + " wagons (" + getTotalePlaatsen() + " plaatsen)"; }

    public int getCapaciteit() {
        return capaciteit;
    }
}