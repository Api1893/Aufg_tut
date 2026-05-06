public class SortedLinkedList  {
    private int size = 0;
    private Node head;

    // Innere Klasse
    private class Node {
        int number;
        Node next;

        Node(int number) {
            this.number = number;
        }
    }

    public boolean add(int number){
        // Neuer Knoten erstellen
        Node newHead = new Node(number);

        // Prüfung ob Kopf leer oder Kopf kleiner gleich ist
        if (head == null || number <= head.number) {
            newHead.next = head;
            head = newHead;
        }
        else {
            // current Hilfsvarible für durchlauf
            Node current = head;

            while (current.next != null && current.next.number < number) {
                current = current.next;
            }
            newHead.next = current.next;
            current.next = newHead;
        }
        // Die Kapazität der Liste wird um 1 erhöt
        size++;
        return true;
    }

    // Suchfunktion
    public boolean contains(int number) {
        for (Node node = head; node != null; node = node.next) {
            if (node.number == number) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    // Inhalt auszulessen
    public void dump() {
        // Wir starten am Kopf der Liste
        Node current = head;
        // Wir laufen so lange weiter, bis wir hinter dem letzten Element (null) sind
        while (current != null) {
            System.out.println(current.number);
            // Zum nächsten Knoten springen
            current = current.next;
        }
    }
}
