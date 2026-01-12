    public enum LocomotiefType {
        CLASS_373(12), CLASS_374(14);

        private int maximaalAantalWagons;

        private LocomotiefType(int maximaalAantalWagons) {
            this.maximaalAantalWagons = maximaalAantalWagons;
        }

        public int geefMaximaalAantalWagons() {
            return maximaalAantalWagons;
        }
    }
