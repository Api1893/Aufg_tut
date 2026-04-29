public class Medals {
    private Medal[] medalArray;
    private int counter;

    // Konstruktor Medals
    Medals(int capacity) {
        this.medalArray = new Medal[capacity]; // Hier kommen nur Objekte vom Typ Medal
        this.counter = 0;
    }

    // _______________________ Methoden _________________

    public boolean add (Medal addingMedal) {
        if (counter >= medalArray.length) {
            return false;
        }
        medalArray[counter] = addingMedal;
        counter = counter + 1;
        return true;
    }

    public boolean contains (Medal containsMedal) {
        for (int b = 0; b < counter; b++) {
            if (medalArray[b] == containsMedal) {
                return true;
            }
        }
        return false;
    }

    public int size () {
        return counter;
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

    private int index (Medal redundanz) {
        for (int i = 0; i < counter; i++) {
            if (medalArray[i] == redundanz) {
                return i;
            }
        }
        return -1;
    }
}