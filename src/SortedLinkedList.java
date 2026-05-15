public class SortedLinkedList<ME extends Comparable<ME>> implements Container<ME> {
    private int size = 0;
    private Node head;

    // Innere Klasse
    private class Node {
        ME number ;
        Node next;

        Node(ME number) {
            this.number = number;
        }
    }

    // Sortierung, dass das neue Objekt immer vorne ist (Alphabetisch)
    public int add(ME number){
        // Neuer Knoten erstellen
        Node newHead = new Node(number);
        // Prüfung ob Kopf leer oder Kopf kleiner gleich ist
        if (head == null || number.compareTo(head.number) <= 0) {
            newHead.next = head;
            head = newHead;
        }
        else {
            // current Hilfsvarible für durchlauf
            Node current = head;
            while (current.next != null && number.compareTo(current.next.number) < 0) {
                current = current.next;
            }
            newHead.next = current.next;
            current.next = newHead;
        }
        // Die Kapazität der Liste wird um 1 erhöt
        size++;
        return 0;
    }

    public int index(ME element) {
        int result = index(element);
        return result;
    }

    public boolean remove(ME elements) {
        boolean elementToRemove = remove(elements);
        return true;
    }

    // Suchfunktion
    public boolean contains(ME number) {
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

    // Inhalt auszulessen mit String
    public String toString() {
        // Wir starten am Kopf der Liste
        Node current = head;
        // Wir laufen so lange weiter, bis wir hinter dem letzten Element (null) sind
        while (current != null) {
            System.out.println(current.number);
            // Zum nächsten Knoten springen
            current = current.next;
        }
        return "";
    }
}
