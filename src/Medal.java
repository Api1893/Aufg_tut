public class Medal {
    private String name;
    private String material;
    private int year;

    // Konstruktor Medal
    Medal(String name, String material, int year) {
        this.name = name;
        this.material = material;
        this.year = year;
    }

    // Aufgabe 3, Blatt 4
    public boolean isSame(Medal equalsString) {
        String nameCompare = equalsString.name.toLowerCase();
        String materialCompare = equalsString.material.toLowerCase();
        int yearCompare = equalsString.year;

        // Anwendung von equals
        boolean theSame = nameCompare.equals(this.name.toLowerCase()) &&
                materialCompare.equals(this.material.toLowerCase()) &&
                yearCompare == this.year;

        // Prüfen ob es gleich ist
        if (theSame) {
            return true;
        } else return false;
    }

    // Aufgabe 4, Blatt 4
    public boolean isLess(Medal compareObject) {
        String firstCompareAlphabet = compareObject.name.toLowerCase();
        String secondCompareAlphabet = compareObject.material.toLowerCase();
        int thirdCompareYear = compareObject.year;

        int lexicographicalOrderName = firstCompareAlphabet.compareTo(this.name.toLowerCase());
        int lexicographicalOrderMaterial = secondCompareAlphabet.compareTo(this.material.toLowerCase());

        if (lexicographicalOrderName < 0) {
            //System.out.println(lexicographicalOrderName + " Weiter vorne bzw. kleiner");
            return false;
        } else if (lexicographicalOrderName > 0) {
            //System.out.println(lexicographicalOrderName + " Weiter hinten bzw. größer");
            return true;
        } else if (lexicographicalOrderMaterial < 0) {
            //System.out.println("Weiter vorne, bzw. Negativer");
            return false;
        } else if (lexicographicalOrderMaterial > 0) {
            //System.out.println("Weiter hinten, bzw. Positiver");
            return true;
        } else if (thirdCompareYear > this.year) {
            //System.out.println("Weiter hinten, bzw. größer");
            return true;
        } else {
            //System.out.println("Alles gleich");
            return true;
        }
    }

    @Override
    public String toString() {
        // Hier baust du den String zusammen, den du auf der Konsole sehen willst
        return this.name + " - " + this.material + " - " + this.year;
    }

}