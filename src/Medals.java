public class Medals {
    private Medal[] medalArray;
    private int size = 0;
    private int counter;

    // Konstruktor Medals
    Medals(int capacity) {
        this.medalArray = new Medal[capacity]; // Hier kommen nur Objekte vom Typ Medal
        this.counter = 0;
    }

    // _______________________ Methoden _________________
    private void swap(int i, int j) {
        Medal temp = medalArray[i];
        medalArray[i] = medalArray[j];
        medalArray[j] = temp;
    }

    public boolean add(Medal addingMedal) {
        // 1. Prüfen, ob noch Platz im Array ist
        if (size == medalArray.length) {
            return false;
        }
        // 2. Das Medal-Objekt an die nächste freie Stelle setzen
        medalArray[size] = addingMedal;
        size++;
        // 3. Sortierung durch fortgesetztes Vertauschen
        for (int i = size - 1; i > 0; i--) {
            // Nutze Methode isLess: Wenn das neue Element "kleiner" ist als sein linker Nachbar, tauschen.
            if (medalArray[i].isLess(medalArray[i - 1])) {
                swap(i - 1, i);
            } else {
                // Wenn es nicht mehr kleiner ist, ist die richtige Position erreicht.
                return true;
            }
        }
        return true;
    }

    public boolean contains(Medal containsMedal) {
        // Ruft die binäre Suche auf und prüft, ob ein gültiger Index gefunden wurde
        return index(containsMedal) >= 0;
    }

    public int size() {
        return size;
    }

    public boolean remove (Medal removeMedal) {
        for (int i = 0; i < counter; i++) {
            if (medalArray[i] == removeMedal) {
                medalArray[i] = medalArray[counter - 1];
                counter--;
                return true;
            }
        }
        return false;
    }

    // Binary search
    private int index(Medal key) {
        int low = 0;
        int high = size - 1; // Nutze 'size' statt 'counter' für Konsistenz [12]
        while (low <= high) {
            int mid = (low + high) / 2;
            Medal midMedal = medalArray[mid];
            if (midMedal.isSame(key)) {
                return mid; // Gefunden!
            }
            if (midMedal.isLess(key)) {
                low = mid + 1; // Suche in der rechten Hälfte weiter [9]
            } else {
                high = mid - 1; // Suche in der linken Hälfte weiter [9]
            }
        }
        return -1; // Nicht enthalten
    }
}