public class Medals<ME extends Comparable<ME>> implements Container<ME> {    // ME für Medal Elements
    private ME[] medalArray;
    private int size = 0;
    private int counter;

    // _________________ Konstruktor Medals ________________________
    Medals(int capacity) {
        this.medalArray = (ME[]) new Comparable[capacity];
        this.counter = 0;
    }

    // _______________________ Methoden __________________________
    private void swap(int i, int j) {
        // ME statt Medal, weil oben nun ME als Platzhalter für Medal gilt
        ME temp = medalArray[i];
        medalArray[i] = medalArray[j];
        medalArray[j] = temp;
    }

    // ________Hinzufügen_und_an_der_richtigen_Stelle_vertauschen__________
    public boolean add(ME addingMedal) {
        // Prüfen, ob noch Platz im Array ist
        if (size == medalArray.length) {
            return true;
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
                return false;
            }
        }
        return true;
    }

    // _______________Gibt_aus_ob_index_gefunden_wurde_____________________
    @Override
    public boolean contains(ME containsMedal) {
        // Ruft die binäre Suche auf und prüft, ob ein gültiger Index gefunden wurde
        return index(containsMedal) >= 0;
    }

    // __________________Entfernen_eines_Platzes_im_Array____________________
    @Override
    public boolean remove(ME removeMedal) {
        for (int i = 0; i < this.medalArray.length; i++) {
            if (medalArray[i].equals(removeMedal)) {
                medalArray[i] = medalArray[this.medalArray.length - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    // _____________Binary_search_____________
    @Override
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
                low = mid + 1; // Suche in der rechten Hälfte weiter
            } else {
                high = mid - 1; // Suche in der linken Hälfte weiter
            }
        }
        return -1; // Nicht enthalten
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (medalArray[i] != null) {
                /*
                    Die Methode toString muss aufgerufen werden, um den String auszugeben.
                    Das Problem ist, dass er sonst aufgrund des return-Befehls nur
                    einmal ausgegeben wird. Die Ausgabe in String wird in der Variable
                    result gespeichert und erst dann ausgegeben.
                */
                result = result + medalArray[i].toString() + "\n";
            }
        }
        return result;
    }

    @Override   // Override abhängig vom Vertrag
    public int size() {
        return size;
    }
}