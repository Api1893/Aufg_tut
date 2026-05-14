public class Medals<ME extends Comparable<ME>> implements Container<ME> {    // ME für Medal Elements
    private ME[] medalArray;
    private int size = 0;
    private int counter;

    // _________________ Konstruktor Medals ________________________
    Medals(int capacity) {
        this.medalArray = (ME[]) new Object[capacity];
        this.counter = 0;
    }

    // _______________________ Methoden __________________________
    private void swap(int i, int j) {
        // ME statt Medal, weil oben nun ME als Platzhalter für Medal gilt
        ME temp = medalArray[i];
        medalArray[i] = medalArray[j];
        medalArray[j] = temp;
    }

    // Vertauschen
    public int add(ME addingMedal) {
        // Prüfen, ob noch Platz im Array ist
        if (size == medalArray.length) {
            return 0;
        }
        // Das Medal-Objekt an die nächste freie Stelle setzen
        medalArray[size] = addingMedal;
        size++;
        // Sortierung durch fortgesetztes Vertauschen
        for (int i = size - 1; i > 0; i--) {
            // Wenn das Element kleiner ist, als das linke Element, dann tauschen
            if (medalArray[i].compareTo(medalArray[i - 1]) > 0) {
                swap(i - 1, i);
            } else {
                // Wenn es nicht mehr kleiner ist, ist die richtige Position erreicht.
                return 0;
            }
        }
        return 0;
    }

    public boolean contains(ME containsMedal) {
        // Ruft die binäre Suche auf und prüft, ob ein gültiger Index gefunden wurde
        return index(containsMedal) >= 0;
    }

    @Override   // Override hat was mit Container Vertrag zu tun, dass es überschrieben wird
    public int size() {
        return size;
    }

    public boolean remove(Medal removeMedal) {
        for (int i = 0; i < this.medalArray.length; i++) {
            if (medalArray[i] == removeMedal) {
                medalArray[i] = medalArray[this.medalArray.length - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    // Binary search
    public int index(ME key) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            ME midMedal = medalArray[mid];
            if (midMedal.equals(key)) {
                return mid; // Gefunden!
            }
            // Hier wurde compareTo ausgetauscht mit isLess
            if (midMedal.compareTo(key) < 0) {
                low = mid + 1; // Suche in der rechten Hälfte weiter [9]
            } else {
                high = mid - 1; // Suche in der linken Hälfte weiter [9]
            }
        }
        return -1; // Nicht enthalten
    }

    @Override
    public String toString() {
        for (int i = 0; i < medalArray.length; i++) {
            if(medalArray[i] != null) {
                System.out.println(medalArray[i].name+", "+medalArray[i].material+", "+medalArray[i].year);
            }
        }
        return "";
    }
}