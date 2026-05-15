public class Medal implements Comparable<Medal> {
    protected String name;
    protected String material;
    protected int year;

    // __________________Konstruktor Medal______________________
    Medal(String name, String material, int year) {
        this.name = name;
        this.material = material;
        this.year = year;
    }

    // __________________Gleichheit_prüfen_________________
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("Übergabe ist null!");
            return false;
        } else if (getClass() != obj.getClass()) {
            System.out.println("Nicht die gleiche Klasse!");
            return false;
        }
        // Neues Objekt erstellen für Vergleich
        Medal other = (Medal) obj;
        if (this.name.equals(other.name) &&
                this.material.equals(other.material) &&
                this.year == other.year) {
            return true;
        }
        return false;
    }

    // Aufgabe 2 b) und c), Blatt 6
    public int compareTo(Medal compareObject) {
        String firstCompareAlphabet = compareObject.name.toLowerCase();
        String secondCompareAlphabet = compareObject.material.toLowerCase();
        int thirdCompareYear = compareObject.year;
        // Der Vergleich wird übergeben, damit es dann verglichen werden kann
        int lexicographicalOrderName = firstCompareAlphabet.compareTo(this.name.toLowerCase());
        int lexicographicalOrderMaterial = secondCompareAlphabet.compareTo(this.material.toLowerCase());

        if(lexicographicalOrderName < 0) {
            // Wenn Name < 0
            return -1;
        } else if(lexicographicalOrderName > 0) {
            return 1;
        } else if(lexicographicalOrderMaterial < 0) {
            // Wenn Material < 0
            return -1;
        } else if(lexicographicalOrderMaterial > 0) {
            return 1;
        } else if(thirdCompareYear < this.year) {
            // Wenn Jahr < 0
            return -1;
        } else if(thirdCompareYear > this.year) {
            return 1;
        } else {
            // Wenn alles gleich ist
            return 0;
        }
    }

    // _____________String_ausgabe_mit_return_____________
    @Override
    public String toString() {
        return this.name + ", " + this.material + ", " + this.year;
    }
}